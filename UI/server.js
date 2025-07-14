const express = require('express');
const multer = require('multer');
const axios = require('axios');
const FormData = require('form-data');
const cors = require('cors');
const fs = require('fs');
const path = require('path');
const https = require('https');

const app = express();
const PORT = process.env.PORT || 3000;

// Enable CORS for all routes
app.use(cors());

// Parse JSON request bodies
app.use(express.json());

// Serve static files from public directory
app.use(express.static('public'));

// Configure multer for file uploads
const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    const uploadDir = 'uploads';
    if (!fs.existsSync(uploadDir)) {
      fs.mkdirSync(uploadDir);
    }
    cb(null, uploadDir);
  },
  filename: function (req, file, cb) {
    cb(null, Date.now() + '-' + file.originalname);
  }
});

const upload = multer({ 
  storage: storage,
  fileFilter: (req, file, cb) => {
    // Accept audio files and text files
    if (file.mimetype.startsWith('audio/') || file.mimetype === 'text/plain') {
      cb(null, true);
    } else {
      cb(new Error('Only audio and text files are allowed!'), false);
    }
  },
  limits: {
    fileSize: 50 * 1024 * 1024 // 50MB limit
  }
});

// Einstein API configuration
const EINSTEIN_API_CONFIG = {
  // Using test1 environment as specified
  baseURL: 'https://einstein-transcribe.sfproxy.einsteintest1.test1-uswest2.aws.sfdc.cl',
  endpoint: '/transcribe/v1/tenant/transcription',
  headers: {
    'X-sfdc-core-tenant-id': 'core/test1na54ice1/00DZ60000004YriMAE',
    'X-sfdc-app-context': 'EinsteinGPT',
    'hawking-tenant-id': 'test',
    'Cookie': 'JSESSIONID=node0v460wmtwb3ku1jc9e7z1lcx80183.node0'
  }
};

// Create axios instance with SSL certificate handling
const axiosInstance = axios.create({
  httpsAgent: new https.Agent({
    rejectUnauthorized: false, // This will ignore SSL certificate errors
    secureProtocol: 'TLSv1_2_method'
  }),
  timeout: 30000 // 30 second timeout
});

// Route to handle voice-to-text conversion
app.post('/api/transcribe', upload.single('audioFile'), async (req, res) => {
  try {
    if (!req.file) {
      return res.status(400).json({ error: 'No audio file provided' });
    }

    console.log('Received file:', req.file.filename);
    
    // Create form data for Einstein API
    const formData = new FormData();
    formData.append('file', fs.createReadStream(req.file.path), {
      filename: req.file.originalname,
      contentType: req.file.mimetype
    });
    formData.append('engine', 'internal');
    formData.append('language', 'English');

    // Make request to Einstein API using the configured axios instance
    const response = await axiosInstance.post(
      EINSTEIN_API_CONFIG.baseURL + EINSTEIN_API_CONFIG.endpoint,
      formData,
      {
        headers: {
          ...EINSTEIN_API_CONFIG.headers,
          ...formData.getHeaders()
        }
      }
    );

    // Clean up uploaded file
    fs.unlinkSync(req.file.path);

    // Return transcription result
    res.json({
      success: true,
      transcription: response.data,
      filename: req.file.originalname
    });

  } catch (error) {
    console.error('Transcription error:', error.message);
    
    // Clean up uploaded file if it exists
    if (req.file && fs.existsSync(req.file.path)) {
      fs.unlinkSync(req.file.path);
    }

    // Handle different types of errors
    if (error.response) {
      res.status(error.response.status).json({
        error: 'Einstein API Error',
        message: error.response.data || error.message,
        status: error.response.status
      });
    } else if (error.code === 'ECONNABORTED') {
      res.status(408).json({
        error: 'Request Timeout',
        message: 'The transcription request timed out'
      });
    } else {
      res.status(500).json({
        error: 'Internal Server Error',
        message: error.message
      });
    }
  }
});

// Route to handle text-to-speech conversion
app.post('/api/synthesize', upload.single('textFile'), async (req, res) => {
  try {
    if (!req.file) {
      return res.status(400).json({ error: 'No text file provided' });
    }

    const language = req.body.language || 'english'; // Default to english
    const engine = req.body.engine || 'aws'; // Default to aws
    console.log('Synthesizing text file:', req.file.filename, 'Language:', language, 'Engine:', engine);
    
    // Create form data for Einstein API
    const formData = new FormData();
    formData.append('file', fs.createReadStream(req.file.path), {
      filename: req.file.originalname,
      contentType: req.file.mimetype
    });
    formData.append('engine', engine);
    formData.append('language', language);

    // Make request to Einstein API
    const response = await axiosInstance.post(
      EINSTEIN_API_CONFIG.baseURL + '/speech/v1/tenant/synthesize',
      formData,
      {
        headers: {
          ...EINSTEIN_API_CONFIG.headers,
          ...formData.getHeaders()
        },
        responseType: 'json'
      }
    );

    // Clean up uploaded file
    fs.unlinkSync(req.file.path);

    // Return synthesis result
    res.json({
      success: true,
      audioStream: response.data.audioStream,
      filename: req.file.originalname,
      language: language,
      engine: engine
    });

  } catch (error) {
    console.error('Synthesis error:', error.message);
    
    // Clean up uploaded file if it exists
    if (req.file && fs.existsSync(req.file.path)) {
      fs.unlinkSync(req.file.path);
    }

    // Handle different types of errors
    if (error.response) {
      res.status(error.response.status).json({
        error: 'Einstein API Error',
        message: error.response.data || error.message,
        status: error.response.status
      });
    } else if (error.code === 'ECONNABORTED') {
      res.status(408).json({
        error: 'Request Timeout',
        message: 'The synthesis request timed out'
      });
    } else {
      res.status(500).json({
        error: 'Internal Server Error',
        message: error.message
      });
    }
  }
});

// Route to handle language translation
app.post('/api/translate', async (req, res) => {
  try {
    const { input, sourceLanguage, targetLanguage, engine = 'aws', settings = {} } = req.body;
    
    if (!input || !sourceLanguage || !targetLanguage) {
      return res.status(400).json({ 
        error: 'Missing required fields', 
        message: 'input, sourceLanguage, and targetLanguage are required' 
      });
    }

    console.log('Translating text:', { input, sourceLanguage, targetLanguage, engine });

    // Make request to Einstein API
    const response = await axiosInstance.post(
      EINSTEIN_API_CONFIG.baseURL + '/translate/v1/tenant/translation',
      {
        input,
        engine,
        sourceLanguage,
        targetLanguage,
        settings
      },
      {
        headers: {
          ...EINSTEIN_API_CONFIG.headers,
          'Content-Type': 'application/json'
        }
      }
    );

    // Return translation result
    res.json({
      success: true,
      translation: response.data.translation,
      appliedSettings: response.data.appliedSettings,
      sourceLanguageCode: response.data.sourceLanguageCode,
      targetLanguageCode: response.data.targetLanguageCode
    });

  } catch (error) {
    console.error('Translation error:', error.message);

    // Handle different types of errors
    if (error.response) {
      res.status(error.response.status).json({
        error: 'Einstein API Error',
        message: error.response.data || error.message,
        status: error.response.status
      });
    } else if (error.code === 'ECONNABORTED') {
      res.status(408).json({
        error: 'Request Timeout',
        message: 'The translation request timed out'
      });
    } else {
      res.status(500).json({
        error: 'Internal Server Error',
        message: error.message
      });
    }
  }
});

// Health check endpoint
app.get('/api/health', (req, res) => {
  res.json({ status: 'OK', timestamp: new Date().toISOString() });
});

// Proxy endpoint for conversation API
app.post('/api/conversation', async (req, res) => {
  try {
    const { userId, query } = req.body;
    
    if (!userId || !query) {
      return res.status(400).json({ 
        error: 'Missing required fields', 
        message: 'Both userId and query are required' 
      });
    }

    console.log('Forwarding conversation request:', { userId, query });

    const response = await axios.post('http://localhost:8080/conversation/query', {
      userId,
      query
    }, {
      headers: {
        'Content-Type': 'application/json'
      },
      timeout: 30000
    });

    res.json(response.data);

  } catch (error) {
    console.error('Conversation API error:', error.message);
    
    if (error.response) {
      res.status(error.response.status).json({
        error: 'Conversation API Error',
        message: error.response.data || error.message,
        status: error.response.status
      });
    } else if (error.code === 'ECONNREFUSED') {
      res.status(503).json({
        error: 'Service Unavailable',
        message: 'Conversation API server is not running on localhost:8080'
      });
    } else {
      res.status(500).json({
        error: 'Internal Server Error',
        message: error.message
      });
    }
  }
});

// Serve the main page
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

// Error handling middleware
app.use((error, req, res, next) => {
  if (error instanceof multer.MulterError) {
    if (error.code === 'LIMIT_FILE_SIZE') {
      return res.status(400).json({
        error: 'File too large',
        message: 'Audio file must be smaller than 50MB'
      });
    }
  }
  
  console.error('Unhandled error:', error);
  res.status(500).json({
    error: 'Internal Server Error',
    message: error.message
  });
});

app.listen(PORT, () => {
  console.log(`🎙️  Speech-to-Text Backend Server running on port ${PORT}`);
  console.log(`📱 Open http://localhost:${PORT} to access the UI`);
  console.log(`🔗 Using Einstein API: ${EINSTEIN_API_CONFIG.baseURL}`);
}); 