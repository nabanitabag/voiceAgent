# 🎙️ Speech to Text Backend

A Node.js backend application that converts audio files to text using Einstein AI's transcription service, with both file upload and live recording capabilities.

## Features

- 🎵 Support for multiple audio formats (WAV, MP3, M4A, FLAC, OGG)
- 🎤 **Live audio recording** directly in the browser
- 🌐 Simple web interface with tabbed interface for upload/record
- 🛡️ File validation and error handling
- 📱 Responsive design with drag-and-drop support
- ⚡ Real-time processing with loading indicators
- 🔴 Recording controls with timer and playback
- 🎧 Audio playback of recorded content

## Prerequisites

- Node.js (v14 or higher)
- npm or yarn package manager
- Modern web browser with microphone access support

## Installation

1. Clone or download this repository
2. Install dependencies:
   ```bash
   npm install
   ```

## Usage

### Starting the Server

```bash
# Development mode with auto-reload
npm run dev

# Production mode
npm start
```

The server will start on `http://localhost:3000`

### Web Interface Features

#### 📁 Upload Tab
- Drag and drop audio files
- Click to browse and select files
- Support for all major audio formats
- File size validation (50MB limit)

#### 🎤 Record Tab
- **Live audio recording** using browser microphone
- Recording timer with real-time display
- Playback controls for recorded audio
- Direct transcription of recorded content
- Microphone permission handling

### API Endpoints

#### POST `/api/transcribe`
Converts an audio file to text.

**Request:**
- Method: POST
- Content-Type: multipart/form-data
- Body: `audioFile` (audio file or recorded blob)

**Response:**
```json
{
  "success": true,
  "transcription": ["Transcribed text here..."],
  "filename": "audio.wav"
}
```

#### GET `/api/health`
Health check endpoint.

**Response:**
```json
{
  "status": "OK",
  "timestamp": "2024-01-01T00:00:00.000Z"
}
```

### Recording Workflow

1. **Start Recording**: Click "Start Recording" button
2. **Grant Permissions**: Allow microphone access when prompted
3. **Record Audio**: Speak into your microphone (timer shows duration)
4. **Stop Recording**: Click "Stop Recording" when done
5. **Playback**: Use "Play Recording" to review your audio
6. **Transcribe**: Click "Convert Recording to Text" to process

### Browser Compatibility

The recording feature requires:
- **HTTPS** (or localhost for development)
- **Modern browser** with MediaRecorder API support
- **Microphone permissions** granted by user

**Supported Browsers:**
- Chrome 47+
- Firefox 25+
- Safari 14.1+
- Edge 79+

## Configuration

The application uses Einstein AI's test1 environment by default:
- Base URL: `https://einstein-transcribe.sfproxy.einsteintest1.test1-uswest2.aws.sfdc.cl`
- Headers configured for test environment
- SSL certificate handling for internal APIs

## File Limits

- Maximum file size: 50MB
- Supported formats: Audio files only
- Processing timeout: 30 seconds
- Recording format: WAV (browser-generated)

## Error Handling

The application handles various error scenarios:
- Invalid file types
- File size limits
- Network timeouts
- API errors
- Server errors
- **Microphone permission denials**
- **Browser compatibility issues**

## Development

### Project Structure

```
speech_to_text/
├── server.js          # Main server file
├── package.json       # Dependencies
├── public/
│   └── index.html     # Web interface with recording
├── uploads/           # Temporary file storage (auto-created)
├── test-api.js        # API testing script
└── README.md          # This file
```

### Testing with cURL

You can also test the API directly using cURL:

```bash
curl -X POST http://localhost:3000/api/transcribe \
  -F "audioFile=@path/to/your/audio.wav"
```

### Testing Recording

1. Open http://localhost:3000 in a modern browser
2. Click the "🎤 Record Audio" tab
3. Grant microphone permissions
4. Test the recording functionality

## Environment Variables

- `PORT`: Server port (default: 3000)

## Troubleshooting

1. **File upload fails**: Check file format and size limits
2. **Recording not working**: Ensure HTTPS/localhost and microphone permissions
3. **API timeout**: Ensure stable internet connection
4. **Server won't start**: Check if port 3000 is available
5. **Dependencies missing**: Run `npm install`
6. **SSL certificate errors**: Already handled in the code

## Security Notes

- Microphone access requires user consent
- Audio is processed locally before sending to API
- No audio data is stored permanently on the server
- SSL certificate validation is disabled for internal APIs

## License

MIT License
