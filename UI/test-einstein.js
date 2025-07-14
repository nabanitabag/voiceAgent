const axios = require('axios');
const FormData = require('form-data');
const fs = require('fs');

const BASE_URL = 'http://localhost:3000';

// Test configuration
const testConfig = {
  textFile: 'test-text.txt',
  testText: 'Hello, how are you today?'
};

// Helper function to create test files
function createTestFiles() {
  // Create test text file
  fs.writeFileSync(testConfig.textFile, testConfig.testText);
  console.log('✅ Created test text file');
}

// Helper function to clean up test files
function cleanupTestFiles() {
  if (fs.existsSync(testConfig.textFile)) {
    fs.unlinkSync(testConfig.textFile);
    console.log('✅ Cleaned up test text file');
  }
}

// Test health endpoint
async function testHealth() {
  console.log('\n🔍 Testing Health Endpoint...');
  try {
    const response = await axios.get(`${BASE_URL}/api/health`);
    console.log('✅ Health check passed:', response.data);
    return true;
  } catch (error) {
    console.error('❌ Health check failed:', error.message);
    return false;
  }
}

// Test text-to-speech endpoint
async function testTextToSpeech() {
  console.log('\n🔊 Testing Text-to-Speech Endpoint...');
  
  try {
    const formData = new FormData();
    formData.append('textFile', fs.createReadStream(testConfig.textFile));
    formData.append('language', 'english');
    formData.append('engine', 'aws');

    const response = await axios.post(`${BASE_URL}/api/synthesize`, formData, {
      headers: {
        ...formData.getHeaders()
      },
      timeout: 30000
    });

    console.log('✅ Text-to-speech test passed:');
    console.log('   Language:', response.data.language);
    console.log('   Engine:', response.data.engine);
    console.log('   Audio stream received:', !!response.data.audioStream);
    
    // Save the audio file for testing
    if (response.data.audioStream) {
      const audioBuffer = Buffer.from(response.data.audioStream, 'base64');
      fs.writeFileSync('test-output.mp3', audioBuffer);
      console.log('   Audio saved as: test-output.mp3');
    }
    
    return true;
  } catch (error) {
    console.error('❌ Text-to-speech test failed:', error.response?.data || error.message);
    return false;
  }
}

// Test translation endpoint
async function testTranslation() {
  console.log('\n🌐 Testing Translation Endpoint...');
  
  try {
    const response = await axios.post(`${BASE_URL}/api/translate`, {
      input: testConfig.testText,
      sourceLanguage: 'en',
      targetLanguage: 'hi',
      engine: 'aws',
      settings: {
        brevity: 'ON',
        formality: 'INFORMAL',
        profanity: 'MASK'
      }
    }, {
      headers: {
        'Content-Type': 'application/json'
      },
      timeout: 30000
    });

    console.log('✅ Translation test passed:');
    console.log('   Source:', testConfig.testText);
    console.log('   Translation:', response.data.translation);
    console.log('   Source Language:', response.data.sourceLanguageCode);
    console.log('   Target Language:', response.data.targetLanguageCode);
    return true;
  } catch (error) {
    console.error('❌ Translation test failed:', error.response?.data || error.message);
    return false;
  }
}

// Test reverse translation
async function testReverseTranslation() {
  console.log('\n🔄 Testing Reverse Translation...');
  
  try {
    const response = await axios.post(`${BASE_URL}/api/translate`, {
      input: 'नमस्ते, आज आप कैसे हैं?',
      sourceLanguage: 'hi',
      targetLanguage: 'en',
      engine: 'aws',
      settings: {
        brevity: 'ON',
        formality: 'INFORMAL',
        profanity: 'MASK'
      }
    }, {
      headers: {
        'Content-Type': 'application/json'
      },
      timeout: 30000
    });

    console.log('✅ Reverse translation test passed:');
    console.log('   Source: नमस्ते, आज आप कैसे हैं?');
    console.log('   Translation:', response.data.translation);
    return true;
  } catch (error) {
    console.error('❌ Reverse translation test failed:', error.response?.data || error.message);
    return false;
  }
}

// Main test runner
async function runTests() {
  console.log('🚀 Starting Einstein API Tests...');
  console.log('📍 Base URL:', BASE_URL);
  
  // Create test files
  createTestFiles();
  
  const results = {
    health: await testHealth(),
    textToSpeech: await testTextToSpeech(),
    translation: await testTranslation(),
    reverseTranslation: await testReverseTranslation()
  };
  
  // Clean up test files
  cleanupTestFiles();
  
  // Summary
  console.log('\n📊 Test Results Summary:');
  console.log('========================');
  Object.entries(results).forEach(([test, passed]) => {
    console.log(`${passed ? '✅' : '❌'} ${test}: ${passed ? 'PASSED' : 'FAILED'}`);
  });
  
  const passedTests = Object.values(results).filter(Boolean).length;
  const totalTests = Object.keys(results).length;
  
  console.log(`\n🎯 Overall: ${passedTests}/${totalTests} tests passed`);
  
  if (passedTests === totalTests) {
    console.log('🎉 All tests passed! The Einstein API is working correctly.');
  } else {
    console.log('⚠️  Some tests failed. Please check the server logs for more details.');
  }
  
  console.log('\n📱 Open http://localhost:3000/einstein-hub.html to use the Einstein features.');
  console.log('📱 Open http://localhost:3000 to use the Tableau interface.');
}

// Run tests if this file is executed directly
if (require.main === module) {
  runTests().catch(console.error);
}

module.exports = {
  testHealth,
  testTextToSpeech,
  testTranslation,
  testReverseTranslation,
  runTests
}; 