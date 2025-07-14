const axios = require('axios');
const FormData = require('form-data');
const fs = require('fs');
const path = require('path');
const https = require('https');

// Create axios instance with SSL certificate handling
const axiosInstance = axios.create({
  httpsAgent: new https.Agent({
    rejectUnauthorized: false, // This will ignore SSL certificate errors
    secureProtocol: 'TLSv1_2_method'
  }),
  timeout: 60000 // 60 second timeout for transcription
});

// Test configuration
const API_BASE_URL = 'http://localhost:3000';
const TEST_AUDIO_FILE = 'test-audio.wav'; // You can replace this with your audio file

async function testTranscriptionAPI() {
    console.log('🎙️ Testing Speech-to-Text API...\n');

    // Test 1: Health check
    try {
        console.log('1. Testing health endpoint...');
        const healthResponse = await axiosInstance.get(`${API_BASE_URL}/api/health`);
        console.log('✅ Health check passed:', healthResponse.data);
    } catch (error) {
        console.log('❌ Health check failed:', error.message);
        return;
    }

    // Test 2: Check if test file exists
    if (!fs.existsSync(TEST_AUDIO_FILE)) {
        console.log(`\n2. Test file '${TEST_AUDIO_FILE}' not found.`);
        console.log('   Please place an audio file named "test-audio.wav" in the project directory.');
        console.log('   Or modify the TEST_AUDIO_FILE variable in this script.');
        return;
    }

    // Test 3: Transcribe audio file
    try {
        console.log('\n2. Testing transcription endpoint...');
        
        const formData = new FormData();
        formData.append('audioFile', fs.createReadStream(TEST_AUDIO_FILE), {
            filename: TEST_AUDIO_FILE,
            contentType: 'audio/wav'
        });

        const transcribeResponse = await axiosInstance.post(
            `${API_BASE_URL}/api/transcribe`,
            formData,
            {
                headers: {
                    ...formData.getHeaders()
                }
            }
        );

        console.log('✅ Transcription successful!');
        console.log('📝 Result:', JSON.stringify(transcribeResponse.data, null, 2));

    } catch (error) {
        console.log('❌ Transcription failed:');
        if (error.response) {
            console.log('   Status:', error.response.status);
            console.log('   Error:', error.response.data);
        } else {
            console.log('   Error:', error.message);
        }
    }
}

// Test 4: Test with cURL equivalent
function showCurlCommand() {
    console.log('\n3. cURL equivalent command:');
    console.log(`curl -X POST ${API_BASE_URL}/api/transcribe \\`);
    console.log(`  -F "audioFile=@${TEST_AUDIO_FILE}"`);
}

// Run tests
async function runTests() {
    await testTranscriptionAPI();
    showCurlCommand();
    
    console.log('\n🎉 Test completed!');
    console.log('📱 Open http://localhost:3000 in your browser to use the web interface.');
}

// Run if this file is executed directly
if (require.main === module) {
    runTests().catch(console.error);
}

module.exports = { testTranscriptionAPI }; 