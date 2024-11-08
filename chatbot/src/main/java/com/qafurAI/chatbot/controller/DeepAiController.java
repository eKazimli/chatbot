package com.qafurAI.chatbot.controller;

import com.qafurAI.chatbot.entity.UserProfile;
import com.qafurAI.chatbot.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/qafur")
public class DeepAiController {

    private final UserProfileService userProfileService;
    private final WeatherService weatherService;
    private final ChatService chatService;
    private final DeepAiService deepAiService;

    @Autowired
    public DeepAiController(UserProfileService userProfileService, WeatherService weatherService, ChatService chatService, DeepAiService deepAiService) {
        this.userProfileService = userProfileService;
        this.weatherService = weatherService;
        this.chatService = chatService;
        this.deepAiService = deepAiService;
    }

    @GetMapping("/kullanici/adi/{firstName}")
    public Optional<UserProfile> getUserByFirstName(@PathVariable String firstName) {
        return userProfileService.findByFirstName(firstName);
    }

    @GetMapping("/kullanici/soyadi/{lastName}")
    public Optional<UserProfile> getUserByLastName(@PathVariable String lastName) {
        return userProfileService.findByLastName(lastName);
    }

    @PostMapping("/profil-guncelle")
    public UserProfile updateUserProfile(@RequestBody UserProfile userProfile) {
        return userProfileService.saveUserProfile(userProfile);
    }

    @GetMapping("/hava-durumu")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

    @PostMapping("/sohbet")
    public String chat(@RequestBody String message) {
        return chatService.getChatResponse(message);
    }

    @PostMapping("/metin-olustur")
    public String generateText(@RequestBody String prompt) {
        return deepAiService.generateText(prompt);
    }
}
