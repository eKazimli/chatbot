package com.qafurAI.chatbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class DeepAiService {

    @Value("${deepai.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String generateText(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("api-key", apiKey);

        JSONObject request = new JSONObject();
        request.put("text", prompt);

        HttpEntity<String> entity = new HttpEntity<>(request.toString(), headers);

        ResponseEntity<String> response = restTemplate.postForEntity(
                "https://api.deepai.org/api/text-generator",
                entity,
                String.class
        );

        return response.getBody();
    }
}
