/**
 * Speech-to-Text API Integration Example
 * 
 * This file shows how to integrate the speech-to-text functionality
 * into your Link UI application.
 */

class SpeechToTextIntegration {
    constructor(baseUrl = 'http://localhost:3000') {
        this.baseUrl = baseUrl;
    }

    /**
     * Send a text command to the speech-to-text API
     * @param {string} command - The command to execute
     * @param {string} userId - User ID (optional)
     * @returns {Promise<Object>} API response
     */
    async sendCommand(command, userId = '4') {
        try {
            const response = await fetch(`${this.baseUrl}/api/conversation`, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    userId: userId,
                    query: command
                })
            });

            const data = await response.json();
            return {
                success: response.ok,
                data: data,
                status: response.status
            };
        } catch (error) {
            return {
                success: false,
                error: error.message,
                status: 500
            };
        }
    }

    /**
     * Synthesize speech from text
     * @param {string} text - Text to convert to speech
     * @param {string} language - Language (english/hindi)
     * @param {string} engine - Speech engine (aws/elevenlabs)
     * @returns {Promise<Object>} Audio data
     */
    async synthesizeSpeech(text, language = 'english', engine = 'aws') {
        try {
            const textBlob = new Blob([text], { type: 'text/plain' });
            const formData = new FormData();
            formData.append('textFile', textBlob, 'text.txt');
            formData.append('language', language);
            formData.append('engine', engine);

            const response = await fetch(`${this.baseUrl}/api/synthesize`, {
                method: 'POST',
                body: formData
            });

            const data = await response.json();
            return {
                success: response.ok,
                data: data,
                status: response.status
            };
        } catch (error) {
            return {
                success: false,
                error: error.message,
                status: 500
            };
        }
    }

    /**
     * Transcribe audio file
     * @param {File} audioFile - Audio file to transcribe
     * @returns {Promise<Object>} Transcription result
     */
    async transcribeAudio(audioFile) {
        try {
            const formData = new FormData();
            formData.append('audioFile', audioFile, 'recording.wav');

            const response = await fetch(`${this.baseUrl}/api/transcribe`, {
                method: 'POST',
                body: formData
            });

            const data = await response.json();
            return {
                success: response.ok,
                data: data,
                status: response.status
            };
        } catch (error) {
            return {
                success: false,
                error: error.message,
                status: 500
            };
        }
    }
}

// Example usage for React/Vue/Any frontend
const speechAPI = new SpeechToTextIntegration('http://localhost:3000');

// Example: Send a command
async function exampleSendCommand() {
    const result = await speechAPI.sendCommand('fetch me all the users from the site India');
    if (result.success) {
        console.log('Command result:', result.data);
        // Handle the response in your UI
        displayResult(result.data);
    } else {
        console.error('Command failed:', result.error);
    }
}

// Example: Synthesize speech
async function exampleSynthesizeSpeech() {
    const text = "User successfully added to site Tokyo";
    const result = await speechAPI.synthesizeSpeech(text, 'english', 'aws');
    if (result.success && result.data.audioStream) {
        // Convert base64 to audio and play
        const audioBlob = new Blob([Uint8Array.from(atob(result.data.audioStream), c => c.charCodeAt(0))], { type: 'audio/mp3' });
        const audioUrl = URL.createObjectURL(audioBlob);
        const audio = new Audio(audioUrl);
        audio.play();
    }
}

// Example: Transcribe audio
async function exampleTranscribeAudio(audioFile) {
    const result = await speechAPI.transcribeAudio(audioFile);
    if (result.success) {
        console.log('Transcription:', result.data.transcription);
        // Use the transcription in your UI
        return result.data.transcription;
    } else {
        console.error('Transcription failed:', result.error);
    }
}

// Export for use in other modules
if (typeof module !== 'undefined' && module.exports) {
    module.exports = SpeechToTextIntegration;
} else if (typeof window !== 'undefined') {
    window.SpeechToTextIntegration = SpeechToTextIntegration;
} 