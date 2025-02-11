 
package com.qafurAI.chatbot.service;

import com.google.cloud.speech.v1.*;
import com.google.protobuf.ByteString;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class GoogleSpeechService {

    public String transcribeAudio(String filePath) throws IOException {
        try (SpeechClient speechClient = SpeechClient.create()) {
            ByteString audioBytes = ByteString.copyFrom(Files.readAllBytes(Paths.get(filePath)));

            RecognitionConfig config = RecognitionConfig.newBuilder()
                .setEncoding(RecognitionConfig.AudioEncoding.LINEAR16)
                .setSampleRateHertz(16000)
                .setLanguageCode("tr-TR")
                .build();

            RecognitionAudio audio = RecognitionAudio.newBuilder()
                .setContent(audioBytes)
                .build();

            RecognizeResponse response = speechClient.recognize(config, audio);
            StringBuilder transcript = new StringBuilder();

            for (SpeechRecognitionResult result : response.getResultsList()) {
                transcript.append(result.getAlternativesList().get(0).getTranscript());
                transcript.append(" ");
            }

            return transcript.toString().trim();
        }
    }
}
