package com.qafurAI.chatbot.controller;

import com.qafurAI.chatbot.service.ChatService;
import com.qafurAI.chatbot.service.DeepAiService;
import com.qafurAI.chatbot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * Kullanıcıdan gelen mesajı işleyerek cevap döner.
     * @param request Kullanıcının mesajını içeren JSON objesi
     * @return Sohbet yanıtı
     */
    @PostMapping("/qafur")
    public String askChat(@RequestBody Map<String, String> request) {
        String message = request.get("message");
        if (message == null || message.isEmpty()) {
            return "Lütfen bir mesaj gönder.";
        }
        return chatService.getChatResponse(message);
    }

    /**
     * AI ile metin oluşturma işlevi.
     * @param request Prompt içeren JSON objesi
     * @return Oluşturulan metin
     */
    @PostMapping("/generate-text")
    public String generateText(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        if (prompt == null || prompt.isEmpty()) {
            return "Lütfen bir metin oluşturma isteği gönder.";
        }
        return deepAiService.generateText(prompt);
    }

    /**
     * Şehir ismine göre hava durumu bilgisi döner.
     * @param city Şehir adı
     * @return Hava durumu bilgisi
     */
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

    /**
     * Kullanıcı adını döner.
     * @param firstName Kullanıcının adı
     * @return Kullanıcı adı yanıtı
     */
    @GetMapping("/kullanici/adi/{firstName}")
    public String getUserFirstName(@PathVariable String firstName) {
        return "Merhaba " + firstName + ", harika görünüyorsun!";
    }

    /**
     * Kullanıcı soyadını döner.
     * @param lastName Kullanıcının soyadı
     * @return Kullanıcı soyadı yanıtı
     */
    @GetMapping("/kullanici/soyadi/{lastName}")
    public String getUserLastName(@PathVariable String lastName) {
        return "Soyadınız harika: " + lastName + "!";
    }

    /**
     * Kullanıcı profili güncelleme işlevi.
     * @param request JSON formatında kullanıcı bilgileri
     * @return Güncelleme sonucu
     */
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
