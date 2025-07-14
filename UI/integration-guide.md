# 🔗 Integration Guide: Speech-to-Text Backend

This guide shows you how to integrate the speech-to-text backend into your existing website or application.

## 🎯 Integration Options

### Option 1: Standalone Backend Service (Recommended)
Deploy the backend as a separate service and call it from your website.

### Option 2: Embedded Backend
Integrate the backend code directly into your existing Node.js application.

### Option 3: API-Only Integration
Use only the API endpoints without the web interface.

---

## 🚀 Option 1: Standalone Backend Service

### Step 1: Deploy the Backend

#### Local Development
```bash
# Clone or copy the backend files
git clone <your-repo>
cd speech_to_text
npm install
npm start
```

#### Production Deployment
```bash
# Using PM2 for production
npm install -g pm2
pm2 start server.js --name "speech-to-text-api"
pm2 save
pm2 startup
```

#### Docker Deployment
```dockerfile
# Dockerfile
FROM node:16-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install --production
COPY . .
EXPOSE 3000
CMD ["npm", "start"]
```

```bash
# Build and run
docker build -t speech-to-text-api .
docker run -p 3000:3000 speech-to-text-api
```

### Step 2: Integrate with Your Website

#### JavaScript Integration
```javascript
// Add this to your website's JavaScript
class SpeechToTextAPI {
    constructor(baseURL = 'http://localhost:3000') {
        this.baseURL = baseURL;
    }

    // Upload and transcribe audio file
    async transcribeFile(audioFile) {
        const formData = new FormData();
        formData.append('audioFile', audioFile);

        try {
            const response = await fetch(`${this.baseURL}/api/transcribe`, {
                method: 'POST',
                body: formData
            });

            const data = await response.json();
            
            if (response.ok && data.success) {
                return data.transcription;
            } else {
                throw new Error(data.message || 'Transcription failed');
            }
        } catch (error) {
            console.error('Transcription error:', error);
            throw error;
        }
    }

    // Record and transcribe audio
    async recordAndTranscribe() {
        try {
            // Get microphone access
            const stream = await navigator.mediaDevices.getUserMedia({ audio: true });
            
            // Record audio
            const mediaRecorder = new MediaRecorder(stream);
            const audioChunks = [];
            
            return new Promise((resolve, reject) => {
                mediaRecorder.ondataavailable = (event) => {
                    audioChunks.push(event.data);
                };

                mediaRecorder.onstop = async () => {
                    const audioBlob = new Blob(audioChunks, { type: 'audio/wav' });
                    
                    try {
                        const transcription = await this.transcribeFile(audioBlob);
                        resolve(transcription);
                    } catch (error) {
                        reject(error);
                    }
                };

                mediaRecorder.start();
                
                // Stop recording after 10 seconds (adjust as needed)
                setTimeout(() => {
                    mediaRecorder.stop();
                    stream.getTracks().forEach(track => track.stop());
                }, 10000);
            });
        } catch (error) {
            throw new Error('Microphone access denied');
        }
    }

    // Health check
    async healthCheck() {
        try {
            const response = await fetch(`${this.baseURL}/api/health`);
            return response.ok;
        } catch (error) {
            return false;
        }
    }
}
```

#### HTML Integration Example
```html
<!DOCTYPE html>
<html>
<head>
    <title>Your Website with Speech-to-Text</title>
</head>
<body>
    <h1>Speech to Text Integration</h1>
    
    <!-- File Upload -->
    <div>
        <h3>Upload Audio File</h3>
        <input type="file" id="audioFile" accept="audio/*">
        <button onclick="transcribeFile()">Transcribe File</button>
    </div>

    <!-- Recording -->
    <div>
        <h3>Record Audio</h3>
        <button onclick="startRecording()">Start Recording</button>
        <button onclick="stopRecording()" disabled id="stopBtn">Stop Recording</button>
    </div>

    <!-- Results -->
    <div>
        <h3>Transcription Result</h3>
        <textarea id="result" rows="5" cols="50" readonly></textarea>
    </div>

    <script>
        const speechAPI = new SpeechToTextAPI('http://localhost:3000');
        let mediaRecorder = null;
        let audioChunks = [];

        // File transcription
        async function transcribeFile() {
            const fileInput = document.getElementById('audioFile');
            const file = fileInput.files[0];
            
            if (!file) {
                alert('Please select an audio file');
                return;
            }

            try {
                const result = document.getElementById('result');
                result.value = 'Processing...';
                
                const transcription = await speechAPI.transcribeFile(file);
                result.value = Array.isArray(transcription) ? transcription.join('\n') : transcription;
            } catch (error) {
                alert('Error: ' + error.message);
            }
        }

        // Recording functionality
        async function startRecording() {
            try {
                const stream = await navigator.mediaDevices.getUserMedia({ audio: true });
                mediaRecorder = new MediaRecorder(stream);
                audioChunks = [];

                mediaRecorder.ondataavailable = (event) => {
                    audioChunks.push(event.data);
                };

                mediaRecorder.onstop = async () => {
                    const audioBlob = new Blob(audioChunks, { type: 'audio/wav' });
                    const result = document.getElementById('result');
                    result.value = 'Processing recording...';
                    
                    try {
                        const transcription = await speechAPI.transcribeFile(audioBlob);
                        result.value = Array.isArray(transcription) ? transcription.join('\n') : transcription;
                    } catch (error) {
                        alert('Error: ' + error.message);
                    }
                };

                mediaRecorder.start();
                document.getElementById('stopBtn').disabled = false;
                alert('Recording started... Click Stop Recording when done.');
            } catch (error) {
                alert('Microphone access denied');
            }
        }

        function stopRecording() {
            if (mediaRecorder && mediaRecorder.state === 'recording') {
                mediaRecorder.stop();
                mediaRecorder.stream.getTracks().forEach(track => track.stop());
                document.getElementById('stopBtn').disabled = true;
            }
        }
    </script>
</body>
</html>
```

---

## 🔧 Option 2: Embedded Backend

### Step 1: Copy Backend Code to Your Project

```bash
# Copy these files to your existing Node.js project
cp server.js your-project/
cp package.json your-project/
cp -r public/ your-project/
```

### Step 2: Install Dependencies

```bash
cd your-project
npm install express multer axios form-data cors
```

### Step 3: Integrate Routes

```javascript
// In your main app.js or server.js
const express = require('express');
const multer = require('multer');
const axios = require('axios');
const FormData = require('form-data');
const cors = require('cors');
const fs = require('fs');
const https = require('https');

const app = express();

// Your existing middleware
app.use(express.json());
app.use(express.static('public'));

// Speech-to-text middleware and routes
const upload = multer({ 
    storage: multer.diskStorage({
        destination: (req, file, cb) => {
            const uploadDir = 'uploads';
            if (!fs.existsSync(uploadDir)) {
                fs.mkdirSync(uploadDir);
            }
            cb(null, uploadDir);
        },
        filename: (req, file, cb) => {
            cb(null, Date.now() + '-' + file.originalname);
        }
    }),
    fileFilter: (req, file, cb) => {
        if (file.mimetype.startsWith('audio/')) {
            cb(null, true);
        } else {
            cb(new Error('Only audio files are allowed!'), false);
        }
    },
    limits: { fileSize: 50 * 1024 * 1024 }
});

const axiosInstance = axios.create({
    httpsAgent: new https.Agent({
        rejectUnauthorized: false,
        secureProtocol: 'TLSv1_2_method'
    }),
    timeout: 30000
});

// Speech-to-text routes
app.post('/api/transcribe', upload.single('audioFile'), async (req, res) => {
    // ... copy the transcription logic from server.js
});

app.get('/api/health', (req, res) => {
    res.json({ status: 'OK', timestamp: new Date().toISOString() });
});

// Your existing routes
app.get('/', (req, res) => {
    res.send('Your existing homepage');
});

app.listen(3000, () => {
    console.log('Your app with speech-to-text running on port 3000');
});
```

---

## 🌐 Option 3: API-Only Integration

### Minimal Backend Setup

```javascript
// minimal-speech-api.js
const express = require('express');
const multer = require('multer');
const axios = require('axios');
const FormData = require('form-data');
const fs = require('fs');
const https = require('https');

const app = express();
const upload = multer({ dest: 'uploads/' });

const axiosInstance = axios.create({
    httpsAgent: new https.Agent({ rejectUnauthorized: false }),
    timeout: 30000
});

app.post('/api/transcribe', upload.single('audioFile'), async (req, res) => {
    try {
        if (!req.file) {
            return res.status(400).json({ error: 'No audio file provided' });
        }

        const formData = new FormData();
        formData.append('file', fs.createReadStream(req.file.path));
        formData.append('engine', 'internal');
        formData.append('language', 'English');

        const response = await axiosInstance.post(
            'https://einstein-transcribe.sfproxy.einsteintest1.test1-uswest2.aws.sfdc.cl/transcribe/v1/tenant/transcription',
            formData,
            {
                headers: {
                    'X-sfdc-core-tenant-id': 'core/jsenv/jsorgid',
                    'X-sfdc-app-context': 'EinsteinGPT',
                    'hawking-tenant-id': 'test',
                    'Cookie': 'JSESSIONID=node0v460wmtwb3ku1jc9e7z1lcx80183.node0',
                    ...formData.getHeaders()
                }
            }
        );

        fs.unlinkSync(req.file.path);
        res.json({ success: true, transcription: response.data });

    } catch (error) {
        if (req.file && fs.existsSync(req.file.path)) {
            fs.unlinkSync(req.file.path);
        }
        res.status(500).json({ error: error.message });
    }
});

app.listen(3000, () => console.log('Speech API running on port 3000'));
```

---

## 🔒 Security Considerations

### CORS Configuration
```javascript
// Configure CORS for your domain
app.use(cors({
    origin: ['https://yourdomain.com', 'http://localhost:3000'],
    credentials: true
}));
```

### Environment Variables
```bash
# .env file
EINSTEIN_API_URL=https://einstein-transcribe.sfproxy.einsteintest1.test1-uswest2.aws.sfdc.cl
EINSTEIN_TENANT_ID=core/jsenv/jsorgid
EINSTEIN_APP_CONTEXT=EinsteinGPT
EINSTEIN_HAWKING_TENANT=test
EINSTEIN_SESSION_ID=node0v460wmtwb3ku1jc9e7z1lcx80183.node0
```

### Rate Limiting
```javascript
const rateLimit = require('express-rate-limit');

const limiter = rateLimit({
    windowMs: 15 * 60 * 1000, // 15 minutes
    max: 100 // limit each IP to 100 requests per windowMs
});

app.use('/api/transcribe', limiter);
```

---

## 🚀 Deployment Options

### Heroku
```bash
# Procfile
web: node server.js

# Deploy
heroku create your-speech-api
git push heroku main
```

### Vercel
```json
// vercel.json
{
  "version": 2,
  "builds": [
    {
      "src": "server.js",
      "use": "@vercel/node"
    }
  ],
  "routes": [
    {
      "src": "/(.*)",
      "dest": "server.js"
    }
  ]
}
```

### AWS Lambda
```javascript
// lambda.js
const serverless = require('serverless-http');
const app = require('./server');

module.exports.handler = serverless(app);
```

---

## 📱 Frontend Framework Integration

### React Example
```jsx
import React, { useState } from 'react';

const SpeechToText = () => {
    const [transcription, setTranscription] = useState('');
    const [isLoading, setIsLoading] = useState(false);

    const transcribeFile = async (file) => {
        setIsLoading(true);
        const formData = new FormData();
        formData.append('audioFile', file);

        try {
            const response = await fetch('http://localhost:3000/api/transcribe', {
                method: 'POST',
                body: formData
            });
            const data = await response.json();
            setTranscription(data.transcription);
        } catch (error) {
            console.error('Error:', error);
        } finally {
            setIsLoading(false);
        }
    };

    return (
        <div>
            <input 
                type="file" 
                accept="audio/*" 
                onChange={(e) => transcribeFile(e.target.files[0])}
            />
            {isLoading && <p>Processing...</p>}
            <textarea value={transcription} readOnly />
        </div>
    );
};

export default SpeechToText;
```

### Vue.js Example
```vue
<template>
  <div>
    <input type="file" @change="handleFileUpload" accept="audio/*">
    <button @click="transcribe" :disabled="!selectedFile || isLoading">
      {{ isLoading ? 'Processing...' : 'Transcribe' }}
    </button>
    <textarea v-model="transcription" readonly></textarea>
  </div>
</template>

<script>
export default {
  data() {
    return {
      selectedFile: null,
      transcription: '',
      isLoading: false
    }
  },
  methods: {
    handleFileUpload(event) {
      this.selectedFile = event.target.files[0];
    },
    async transcribe() {
      if (!this.selectedFile) return;
      
      this.isLoading = true;
      const formData = new FormData();
      formData.append('audioFile', this.selectedFile);

      try {
        const response = await fetch('http://localhost:3000/api/transcribe', {
          method: 'POST',
          body: formData
        });
        const data = await response.json();
        this.transcription = data.transcription;
      } catch (error) {
        console.error('Error:', error);
      } finally {
        this.isLoading = false;
      }
    }
  }
}
</script>
```

---

## 🧪 Testing Your Integration

```javascript
// test-integration.js
const SpeechToTextAPI = require('./speech-api');

async function testIntegration() {
    const api = new SpeechToTextAPI('http://localhost:3000');
    
    // Test health
    const isHealthy = await api.healthCheck();
    console.log('API Health:', isHealthy);
    
    // Test with a sample audio file
    const fs = require('fs');
    const audioFile = fs.createReadStream('test-audio.wav');
    
    try {
        const transcription = await api.transcribeFile(audioFile);
        console.log('Transcription:', transcription);
    } catch (error) {
        console.error('Error:', error.message);
    }
}

testIntegration();
```

This integration guide provides multiple approaches to fit your specific needs. Choose the option that best matches your current setup and requirements! 