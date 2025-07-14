/**
 * Speech-to-Text API Client Library
 * Easy integration for any website
 * 
 * Usage:
 * const speechAPI = new SpeechToTextAPI('http://localhost:3000');
 * const transcription = await speechAPI.transcribeFile(audioFile);
 */

class SpeechToTextAPI {
    constructor(baseURL = 'http://localhost:3000') {
        this.baseURL = baseURL;
        this.isRecording = false;
        this.mediaRecorder = null;
        this.audioChunks = [];
        this.recordingStartTime = 0;
        this.recordingTimer = null;
    }

    /**
     * Transcribe an audio file
     * @param {File|Blob} audioFile - Audio file to transcribe
     * @returns {Promise<string|Array>} Transcription result
     */
    async transcribeFile(audioFile) {
        if (!audioFile) {
            throw new Error('No audio file provided');
        }

        const formData = new FormData();
        formData.append('audioFile', audioFile, 'audio.wav');

        try {
            const response = await fetch(`${this.baseURL}/api/transcribe`, {
                method: 'POST',
                body: formData
            });

            const data = await response.json();
            
            if (response.ok && data.success) {
                return data.transcription;
            } else {
                throw new Error(data.message || data.error || 'Transcription failed');
            }
        } catch (error) {
            console.error('Transcription error:', error);
            throw error;
        }
    }

    /**
     * Start recording audio from microphone
     * @param {Object} options - Recording options
     * @param {Function} options.onStart - Callback when recording starts
     * @param {Function} options.onStop - Callback when recording stops
     * @param {Function} options.onError - Callback for errors
     * @param {Function} options.onTimeUpdate - Callback for time updates
     * @returns {Promise<void>}
     */
    async startRecording(options = {}) {
        if (this.isRecording) {
            throw new Error('Recording already in progress');
        }

        try {
            const stream = await navigator.mediaDevices.getUserMedia({ audio: true });
            
            this.mediaRecorder = new MediaRecorder(stream);
            this.audioChunks = [];
            this.isRecording = true;

            this.mediaRecorder.ondataavailable = (event) => {
                this.audioChunks.push(event.data);
            };

            this.mediaRecorder.onstop = () => {
                this.isRecording = false;
                this.stopRecordingTimer();
                stream.getTracks().forEach(track => track.stop());
                
                if (options.onStop) {
                    const audioBlob = new Blob(this.audioChunks, { type: 'audio/wav' });
                    options.onStop(audioBlob);
                }
            };

            this.mediaRecorder.start();
            this.recordingStartTime = Date.now();
            this.startRecordingTimer(options.onTimeUpdate);
            
            if (options.onStart) {
                options.onStart();
            }

        } catch (error) {
            this.isRecording = false;
            console.error('Error accessing microphone:', error);
            
            if (options.onError) {
                options.onError('Microphone access denied. Please allow permissions.');
            } else {
                throw new Error('Microphone access denied');
            }
        }
    }

    /**
     * Stop recording audio
     */
    stopRecording() {
        if (this.mediaRecorder && this.mediaRecorder.state === 'recording') {
            this.mediaRecorder.stop();
        }
    }

    /**
     * Record audio for a specific duration and transcribe
     * @param {number} durationMs - Duration in milliseconds
     * @returns {Promise<string|Array>} Transcription result
     */
    async recordAndTranscribe(durationMs = 10000) {
        return new Promise((resolve, reject) => {
            this.startRecording({
                onStop: async (audioBlob) => {
                    try {
                        const transcription = await this.transcribeFile(audioBlob);
                        resolve(transcription);
                    } catch (error) {
                        reject(error);
                    }
                },
                onError: (error) => reject(new Error(error))
            });

            // Auto-stop after duration
            setTimeout(() => {
                if (this.isRecording) {
                    this.stopRecording();
                }
            }, durationMs);
        });
    }

    /**
     * Check if the API is healthy
     * @returns {Promise<boolean>} Health status
     */
    async healthCheck() {
        try {
            const response = await fetch(`${this.baseURL}/api/health`);
            return response.ok;
        } catch (error) {
            return false;
        }
    }

    /**
     * Get recording status
     * @returns {boolean} True if currently recording
     */
    isCurrentlyRecording() {
        return this.isRecording;
    }

    /**
     * Get current recording time
     * @returns {string} Formatted time string (MM:SS)
     */
    getRecordingTime() {
        if (!this.isRecording) return '00:00';
        
        const elapsed = Date.now() - this.recordingStartTime;
        const minutes = Math.floor(elapsed / 60000);
        const seconds = Math.floor((elapsed % 60000) / 1000);
        return `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
    }

    /**
     * Start recording timer
     * @param {Function} onTimeUpdate - Callback for time updates
     */
    startRecordingTimer(onTimeUpdate) {
        this.recordingTimer = setInterval(() => {
            if (onTimeUpdate) {
                onTimeUpdate(this.getRecordingTime());
            }
        }, 1000);
    }

    /**
     * Stop recording timer
     */
    stopRecordingTimer() {
        if (this.recordingTimer) {
            clearInterval(this.recordingTimer);
            this.recordingTimer = null;
        }
    }

    /**
     * Create a simple UI component
     * @param {string} containerId - ID of the container element
     * @returns {Object} UI controls object
     */
    createUI(containerId) {
        const container = document.getElementById(containerId);
        if (!container) {
            throw new Error(`Container with ID '${containerId}' not found`);
        }

        // Create UI elements
        container.innerHTML = `
            <div class="speech-api-ui">
                <div class="upload-section">
                    <h3>📁 Upload Audio File</h3>
                    <input type="file" id="audioFile" accept="audio/*" style="margin: 10px 0;">
                    <button id="transcribeBtn" style="margin: 5px;">🔄 Transcribe File</button>
                </div>
                
                <div class="recording-section">
                    <h3>🎤 Record Audio</h3>
                    <div id="recordingControls">
                        <button id="recordBtn" style="margin: 5px;">🔴 Start Recording</button>
                        <button id="stopBtn" style="margin: 5px;" disabled>⏹️ Stop Recording</button>
                        <span id="recordingTime" style="margin: 10px; font-weight: bold;">00:00</span>
                    </div>
                    <audio id="audioPlayer" controls style="width: 100%; margin: 10px 0; display: none;"></audio>
                </div>
                
                <div class="result-section">
                    <h3>📝 Transcription Result</h3>
                    <textarea id="transcriptionResult" rows="5" cols="50" readonly 
                              style="width: 100%; margin: 10px 0; padding: 10px;"></textarea>
                </div>
                
                <div id="errorMessage" style="color: red; margin: 10px 0; display: none;"></div>
            </div>
        `;

        // Get UI elements
        const audioFileInput = container.querySelector('#audioFile');
        const transcribeBtn = container.querySelector('#transcribeBtn');
        const recordBtn = container.querySelector('#recordBtn');
        const stopBtn = container.querySelector('#stopBtn');
        const recordingTime = container.querySelector('#recordingTime');
        const audioPlayer = container.querySelector('#audioPlayer');
        const transcriptionResult = container.querySelector('#transcriptionResult');
        const errorMessage = container.querySelector('#errorMessage');

        let recordedBlob = null;

        // File transcription
        transcribeBtn.addEventListener('click', async () => {
            const file = audioFileInput.files[0];
            if (!file) {
                this.showError('Please select an audio file');
                return;
            }

            try {
                this.showError('');
                transcriptionResult.value = 'Processing...';
                transcribeBtn.disabled = true;

                const transcription = await this.transcribeFile(file);
                transcriptionResult.value = Array.isArray(transcription) ? 
                    transcription.join('\n') : transcription;

            } catch (error) {
                this.showError('Error: ' + error.message);
            } finally {
                transcribeBtn.disabled = false;
            }
        });

        // Recording functionality
        recordBtn.addEventListener('click', async () => {
            try {
                this.showError('');
                recordBtn.disabled = true;
                stopBtn.disabled = false;

                await this.startRecording({
                    onStart: () => {
                        recordingTime.textContent = '00:00';
                    },
                    onStop: (audioBlob) => {
                        recordedBlob = audioBlob;
                        audioPlayer.src = URL.createObjectURL(audioBlob);
                        audioPlayer.style.display = 'block';
                        recordBtn.disabled = false;
                        stopBtn.disabled = true;
                        
                        // Auto-transcribe
                        this.transcribeRecording(audioBlob);
                    },
                    onError: (error) => {
                        this.showError(error);
                        recordBtn.disabled = false;
                        stopBtn.disabled = true;
                    },
                    onTimeUpdate: (time) => {
                        recordingTime.textContent = time;
                    }
                });

            } catch (error) {
                this.showError('Error: ' + error.message);
                recordBtn.disabled = false;
                stopBtn.disabled = true;
            }
        });

        stopBtn.addEventListener('click', () => {
            this.stopRecording();
        });

        // Helper functions
        const self = this;
        this.transcribeRecording = async (audioBlob) => {
            try {
                transcriptionResult.value = 'Processing recording...';
                const transcription = await this.transcribeFile(audioBlob);
                transcriptionResult.value = Array.isArray(transcription) ? 
                    transcription.join('\n') : transcription;
            } catch (error) {
                this.showError('Error: ' + error.message);
            }
        };

        this.showError = (message) => {
            errorMessage.textContent = message;
            errorMessage.style.display = message ? 'block' : 'none';
        };

        // Return controls object
        return {
            transcribeFile: async (file) => {
                const transcription = await this.transcribeFile(file);
                transcriptionResult.value = Array.isArray(transcription) ? 
                    transcription.join('\n') : transcription;
                return transcription;
            },
            startRecording: () => recordBtn.click(),
            stopRecording: () => stopBtn.click(),
            getResult: () => transcriptionResult.value,
            setResult: (text) => { transcriptionResult.value = text; }
        };
    }
}

// Export for different module systems
if (typeof module !== 'undefined' && module.exports) {
    module.exports = SpeechToTextAPI;
} else if (typeof window !== 'undefined') {
    window.SpeechToTextAPI = SpeechToTextAPI;
} 