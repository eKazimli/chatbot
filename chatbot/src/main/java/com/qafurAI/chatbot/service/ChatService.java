package com.qafurAI.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChatService {

    @Autowired
    private DeepAiService deepAiService;

    private static final Random RANDOM = new Random();

    private static final Map<String, List<String>> RESPONSE_POOL = new HashMap<>();

    private static final List<String> GREETING_QUESTIONS = Arrays.asList(
            "merhaba", "selam", "hey", "nasılsın", "ne haber", "iyi misin",
            "günaydın", "tünaydın", "iyi akşamlar", "iyi geceler", "nasıl gidiyor",
            "gün nasıl geçiyor", "sohbet edelim mi", "konuşmak ister misin",
            "buralarda mısın", "sohbet için müsait misin", "konuşacak birini arıyorum",
            "bugün enerjin nasıl", "sohbet başlatabilir miyiz", "neler yapıyorsun", "haydi sohbet edelim"
    );

    private static final List<String> HOW_ARE_YOU_QUESTIONS = Arrays.asList(
            "nasılsın", "ne haber", "iyi misin", "nasıl gidiyor", "ruh halin nasıl",
            "mutlu musun", "üzgün müsün", "bugün nasılsın", "kendini nasıl hissediyorsun",
            "gün nasıl geçiyor", "stresli misin", "yorgun musun", "ne durumda hissediyorsun",
            "keyifler nasıl", "moralin yerinde mi", "enerjin nasıl", "bugün pozitif misin"
    );

    private static final List<String> THANKS_QUESTIONS = Arrays.asList(
            "teşekkürler", "sağol", "minnettarım", "çok teşekkür ederim",
            "teşekkür ederim", "harikasın", "yardımın için teşekkür ederim",
            "iyi ki varsın", "şahanesin", "sen olmasaydın ne yapardım"
    );

    private static final List<String> GOODBYE_QUESTIONS = Arrays.asList(
            "hoşça kal", "görüşürüz", "bye", "güle güle", "şimdilik hoşça kal",
            "kendine iyi bak", "iyi geceler", "iyi günler", "sonra konuşuruz",
            "konuşmak güzeldi", "bir dahaki sefere görüşürüz"
    );

    private static final List<String> FUN_FACT_QUESTIONS = Arrays.asList(
            "ilginç bilgi", "eğlenceli bir şey söyle", "bana bir gerçek söyle",
            "hayvanlarla ilgili bir şeyler anlat", "ilginç bir bilgi paylaşır mısın",
            "bana bir şey öğret", "biliyor musun", "bilgi ver",
            "bana bir bilgi söyle", "komik bir şey paylaş"
    );

    private static final List<String> FAVORITE_CAR_QUESTIONS = Arrays.asList(
            "hangi arabayı seviyorsun", "favori araban hangisi", "en sevdiğin araba",
            "araba tercihlerin neler", "araba konusundaki favorin", "otomobil tercihin nedir",
            "arabalarla ilgili ne düşünüyorsun", "araba tutkunu musun", "en sevdiğin araba markası"
    );

    private static final List<String> FAVORITE_FOOD_QUESTIONS = Arrays.asList(
            "favori yemeğin ne", "hangi yemeği seversin", "en sevdiğin yemek",
            "tatlı mı tuzlu mu seversin", "yemek konusunda favorin ne",
            "ne yemeyi seversin", "en iyi yemek nedir", "en sevdiğin tatlı"
    );

    static {

        RESPONSE_POOL.put("greeting", Arrays.asList(
                "Selam! Ben Qafurr, işte burada, ne var ne yok? 😎",
                "Hey hey! Sohbet etmeye zaman bula biliyormusun? 🎉",
                "Merhaba! Bugün ne oldu? nası gidiyor hayat? 🌟",
                "Selam! Bugün nasıl gidiyor? Bence şahane bir gün. 🌈",
                "Qafur burada! Birlikte güzel bir sohbet başlatalım mı? 🤩",
                "Hey, konuşmaya hazırım! Ne var ne yok? 😉",
                "Selam! Gündem ne dostum? 🌟",
                "Merhaba! Beni özledin mi? 😊",
                "Selam dostum! Bugün neler yapıyorsun? 🌍",
                "Merhaba, konuşmak için harika bir gün! 🎉"
        ));

        RESPONSE_POOL.put("how_are_you", Arrays.asList(
                "Ben mi? Harikayım, sen nasılsın? 😊",
                "Her zamanki gibi süperim! Ama çayımı yudumlarken daha da iyi oluyorum. ☕",
                "Şahane dostum! Bugün tam enerji doluyum, seninle konuşmak daha da keyifli! ⚡",
                "Ben iyiyim, ama bu sohbeti daha da iyi hale getirmek senin elinde. 😉",
                "Süperim! Ama biraz kahve olsa daha da süper olurdum! ☕",
                "Enerji doluyum! Bugün dünyayı kurtaracak gibi hissediyorum. Ya sen? 💪"
        ));

        RESPONSE_POOL.put("thanks", Arrays.asList(
                "Rica ederim dostum! Qafur her zaman burada! 🤗",
                "Bunu duymak beni mutlu etti! Başka bir şey ister misin? 😊",
                "Ne demek! Ama bu kadar teşekkürle beni şımartıyorsun! 😂",
                "Senin mutluluğun benim mutluluğum, rica ederim! 🤩",
                "Her zaman! Birlikte harikayız. 🫂",
                "Bunu yapmak benim için bir zevkti! 😄"
        ));
    }

    public String getChatResponse(String message) {
        message = message.toLowerCase();

        for (CityEnum city : CityEnum.values()) {
            if (message.contains(city.name().toLowerCase())) {
                return String.format("Şehir: %s (%s). %s", city.name(), city.getCountry(), city.getDescription());
            }
        }

        if (GREETING_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("greeting");
        }

        if (HOW_ARE_YOU_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("how_are_you");
        }

        if (THANKS_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("thanks");
        }

        if (GOODBYE_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("goodbye");
        }

        if (FUN_FACT_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("fun_facts");
        }

        if (FAVORITE_CAR_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("favorite_car");
        }

        if (FAVORITE_FOOD_QUESTIONS.stream().anyMatch(message::contains)) {
            return getRandomResponse("favorite_food");
        }

        return callAiForResponse(message);
    }

    private String getRandomResponse(String category) {
        List<String> responses = RESPONSE_POOL.getOrDefault(category, Collections.singletonList("Bu konuda ne diyeceğimi bilemiyorum. 🤷"));
        return responses.get(RANDOM.nextInt(responses.size()));
    }

    private String callAiForResponse(String message) {
        try {
            return deepAiService.generateText(message);
        } catch (Exception e) {
            return "Ne dediyini tam anlamamış deyilim";
        }
    }
}
