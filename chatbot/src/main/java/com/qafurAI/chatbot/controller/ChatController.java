package com.qafurAI.chatbot.controller;

import com.qafurAI.chatbot.service.ChatService;
import com.qafurAI.chatbot.service.DeepAiService;
import com.qafurAI.chatbot.service.TextAnalysisService;
import com.qafurAI.chatbot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @Autowired
    private DeepAiService deepAiService;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private TextAnalysisService textAnalysisService;

    @PostMapping("/qafur")
    public String askChat(@RequestBody Map<String, String> request) {
        String message = request.get("message");
        if (message == null || message.isEmpty()) {
            return "Lütfen bir mesaj gönder.";
        }
        return chatService.getChatResponse(message);
    }

    @PostMapping("/analyze")
    public ResponseEntity<String> analyzeSentence(@RequestBody String input) {
        String result = textAnalysisService.analyzeText(input);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/generate-text")
    public String generateText(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        if (prompt == null || prompt.isEmpty()) {
            return "Lütfen bir metin oluşturma isteği gönder.";
        }
        return deepAiService.generateText(prompt);
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

    @GetMapping("/kullanici/adi/{firstName}")
    public String getUserFirstName(@PathVariable String firstName) {
        return "Merhaba " + firstName + ", harika görünüyorsun!";
    }

    @GetMapping("/kullanici/soyadi/{lastName}")
    public String getUserLastName(@PathVariable String lastName) {
        return "Soyadınız harika: " + lastName + "!";
    }

    @PostMapping("/profil-guncelle")
    public String updateProfile(@RequestBody Map<String, String> request) {
        String firstName = request.get("firstName");
        String lastName = request.get("lastName");

        if (firstName == null || lastName == null) {
            return "Lütfen hem adınızı hem de soyadınızı gönderin.";
        }

        return "Profil güncellendi: " + firstName + " " + lastName;
    }
}