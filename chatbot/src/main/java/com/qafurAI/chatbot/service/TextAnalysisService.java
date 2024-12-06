package com.qafurAI.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class TextAnalysisService {

    public String analyzeText(String input) {
        if (input == null || input.isEmpty()) {
            return "Cümle ekle lütfen";
        }

        int characterCountWithoutSpaces = input.replace(" ", "").length();
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        return "Karakter Sayısı: " + characterCountWithoutSpaces +
               ", Kelime Sayısı: " + wordCount;
    }
}
