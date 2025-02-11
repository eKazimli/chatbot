 
package com.qafurAI.chatbot.controller;

import com.qafurAI.chatbot.service.OpenAIService;
import com.qafurAI.chatbot.service.GoogleSpeechService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {

    private final OpenAIService openAIService;
    private final GoogleSpeechService googleSpeechService;

    public ChatbotController(OpenAIService openAIService, GoogleSpeechService googleSpeechService) {
        this.openAIService = openAIService;
        this.googleSpeechService = googleSpeechService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> getChatbotResponse(@RequestBody String message) {
        String response = openAIService.getAIResponse(message);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/speech-to-text")
    public ResponseEntity<String> transcribeAudio(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = "uploads/" + file.getOriginalFilename();
            file.transferTo(new java.io.File(filePath));
            String text = googleSpeechService.transcribeAudio(filePath);
            return ResponseEntity.ok(text);
        } catch (IOException e) {
            return ResponseEntity.badRequest().body("Ses dosyası işlenemedi!");
        }
    }
}
