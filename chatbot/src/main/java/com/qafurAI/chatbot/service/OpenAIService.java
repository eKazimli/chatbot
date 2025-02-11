package com.qafurAI.chatbot.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenAIService {

    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "YOUR_OPENAI_API_KEY";

    public String getAIResponse(String message) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + API_KEY);
        headers.set("Content-Type", "application/json");

        String requestBody = "{ \"model\": \"gpt-4\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.POST, request, String.class);

        return response.getBody();
    }
}
