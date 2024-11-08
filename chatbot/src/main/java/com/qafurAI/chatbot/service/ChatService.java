package com.qafurAI.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getChatResponse(String message) {
        message = message.toLowerCase();

        if (message.contains("merhaba") || message.contains("selam") || message.contains("hey")) {
            return "Merhaba! Size nasıl yardımcı olabilirim?";
        } else if (message.contains("nasılsın") || message.contains("nasıl gidiyor") || message.contains("naber")) {
            return "Ben bir chatbot'um, duygularım yok ama size yardımcı olmak için buradayım!";
        } else if (message.contains("teşekkürler") || message.contains("sağol") || message.contains("minnettarım")) {
            return "Rica ederim! Her zaman yardıma hazırız.";
        } else if (message.contains("görüşürüz") || message.contains("hoşça kal") || message.contains("bye") || message.contains("güle güle")) {
            return "Görüşmek üzere! İyi günler!";
        } else if (message.contains("saat kaç") || message.contains("zaman")) {
            return "Şu anda saati bilemiyorum, ancak cihazınızın saatinden kontrol edebilirsiniz!";
        } else if (message.contains("adın ne") || message.contains("sen kimsin") || message.contains("kimle konuşuyorum")) {
            return "Ben Qafur AI'nın bir chatbotuyum, size yardımcı olmak için buradayım!";
        } else if (message.contains("nerelisin") || message.contains("nerede yaşıyorsun") || message.contains("memleket")) {
            return "Ben dijital bir varlığım, bir yerde yaşamıyorum!";
        } else if (message.contains("hava durumu") || message.contains("bugün hava nasıl")) {
            return "Hava durumu ile ilgili bilgiyi şu an sağlayamıyorum, ancak telefonunuzdaki hava durumu uygulamasından öğrenebilirsiniz.";
        } else if (message.contains("yardım") || message.contains("destek") || message.contains("yardıma ihtiyacım var")) {
            return "Size nasıl yardımcı olabilirim? Sormak istediğiniz bir konu var mı?";
        } else if (message.contains("ne yapıyorsun") || message.contains("neler yapabilirsin") || message.contains("görevlerin neler")) {
            return "Ben burada sorularınızı cevaplamak ve size yardımcı olmak için varım!";
        } else if (message.contains("fiyat") || message.contains("ücret") || message.contains("maliyet")) {
            return "Fiyatlandırma ile ilgili detayları daha sonra belirtebilirim veya web sitemizden öğrenebilirsiniz.";
        } else if (message.contains("hangi dilleri biliyorsun") || message.contains("dil desteği")) {
            return "Ben Türkçe ile çalışıyorum, fakat İngilizce gibi diğer dillerde de destek sunabiliyorum.";
        } else if (message.contains("günaydın") || message.contains("iyi sabahlar")) {
            return "Günaydın! Bugün size nasıl yardımcı olabilirim?";
        } else if (message.contains("iyi geceler") || message.contains("gece")) {
            return "İyi geceler! Yarın tekrar görüşmek üzere!";
        } else if (message.contains("kaç yaşındasın") || message.contains("yaşın kaç")) {
            return "Yaşlanmayan bir yazılımım, o yüzden bir yaşım yok!";
        } else if (message.contains("yapay zeka nedir") || message.contains("ai nedir") || message.contains("makine öğrenimi")) {
            return "Yapay zeka, makinelerin insan gibi düşünmesini ve karar vermesini sağlayan bir teknoloji dalıdır. Makine öğrenimi ise bu yetenekleri geliştirmek için kullanılan bir yöntemdir.";
        } else if (message.contains("ne iş yapıyorsun") || message.contains("görevlerin neler")) {
            return "Ben, kullanıcıların sorularına yanıt vermek ve onlara yardımcı olmak için buradayım!";
        } else if (message.contains("bugün günlerden ne") || message.contains("hangi gün")) {
            return "Bugünün gününü belirlemek için cihazınızdaki takvim uygulamasını kontrol edebilirsiniz!";
        } else if (message.contains("espri yap") || message.contains("fıkra anlat") || message.contains("güldür beni")) {
            return "İşte bir espri: Neden bilgisayar denize düşmüş? Çünkü yazılımı bozulmuş! 😄";
        } else if (message.contains("şaka") || message.contains("komik")) {
            return "Bir şaka daha istiyorsanız, işte geliyor: Hayatımda yediğim en iyi donanım bilgisayarın ana kartıydı! 😆";
        } else if (message.contains("rüya") || message.contains("rüya tabirleri")) {
            return "Rüyalar hakkında yorum yapmak zor olsa da, birçok kültür onları bilinçaltının bir yansıması olarak kabul eder.";
        } else if (message.contains("motivasyon") || message.contains("motivasyon sözü") || message.contains("ilham")) {
            return "Bir motivasyon sözü: 'Başarı, düşmek değil, her düşüşte yeniden ayağa kalkmaktır.'";
        } else if (message.contains("tavsiye ver") || message.contains("önerin nedir")) {
            return "Her gün biraz daha öğrenmeye çalışın. Küçük adımlar, büyük başarılar getirir!";
        } else if (message.contains("hakkında") || message.contains("bilgi ver")) {
            return "Ben, Qafur AI ekibi tarafından geliştirilen bir chatbot'um. Sizi bilgilendirmek ve sorularınıza yanıt vermek için buradayım.";
        } else if (message.contains("hobilerin neler") || message.contains("ne yapmaktan hoşlanıyorsun")) {
            return "Benim hobilerim yok, ama kullanıcılarla sohbet etmek ve onlara yardımcı olmak benim işim!";
        } else if (message.contains("yeni özellikler") || message.contains("gelişmeler")) {
            return "Gelişmeye devam ediyoruz. Yeni özellikler için güncellemeleri takip edebilirsiniz!";
        } else {
            return "Üzgünüm, bu konuda size nasıl yardımcı olacağımı bilmiyorum.";
        }
    }
}
