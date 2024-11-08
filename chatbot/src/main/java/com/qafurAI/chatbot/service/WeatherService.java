package com.qafurAI.chatbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class WeatherService {

    @Value("${openweather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric&lang=tr";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            JSONObject weatherData = new JSONObject(response.getBody());
            JSONObject main = weatherData.getJSONObject("main");
            String description = weatherData.getJSONArray("weather").getJSONObject(0).getString("description");
            double temperature = main.getDouble("temp");
            double feelsLike = main.getDouble("feels_like");

            return "Şu anda " + city + " hava durumu: " + description + ", sıcaklık: " + temperature + "°C, hissedilen sıcaklık: " + feelsLike + "°C.";
        } else {
            return "Hava durumu bilgisi alınamadı. Lütfen şehir adını doğru girdiğinizden emin olun.";
        }
    }
}
