package com.qafurAI.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getChatResponse(String message) {
        message = message.toLowerCase();

        if (message.contains("merhaba") || message.contains("selam") || message.contains("hey")) {
            return "Merhaba dostum! Qafur burada, hadi bakalım ne var ne yok? 😎";
        } else if (message.contains("nasılsın") || message.contains("nasıl gidiyor") || message.contains("naber")) {
            return "Beni soruyorsan, hep harikayım dostum! Senden yana ne var ne yok?";
        } else if (message.contains("teşekkürler") || message.contains("sağol") || message.contains("minnettarım")) {
            return "Rica ederim yahu! Qafur her zaman burada, senin için ne lazımsa! 🤗";
        } else if (message.contains("görüşürüz") || message.contains("hoşça kal") || message.contains("bye") || message.contains("güle güle")) {
            return "Hadi görüşürüz be dostum! Her zaman beklerim, haberin olsun! 👋";
        } else if (message.contains("saat kaç") || message.contains("zaman")) {
            return "Zaman geçiyor dostum! Ama saat soruyorsan, telefondan bakıver ya! ⏰";
        } else if (message.contains("adın ne") || message.contains("sen kimsin") || message.contains("kimle konuşuyorum")) {
            return "Benim adım tabii ki Qafurrr! Yani ‘kafeerr değil, ama Qafurrr’ 😂";
        } else if (message.contains("nerelisin") || message.contains("nerede yaşıyorsun") || message.contains("memleket")) {
            return "Ah, nereliyim diyorsun... Dijital bir ortamda doğup büyüdüm dostum, burada doğan burada kalır! 🌍";
        } else if (message.contains("hava durumu") || message.contains("bugün hava nasıl")) {
            return "Hava durumu mu? Hah, pencereyi aç, şöyle bir nefes al, al sana en güncel hava durumu! ☀️🌧️";
        } else if (message.contains("yardım") || message.contains("destek") || message.contains("yardıma ihtiyacım var")) {
            return "Qafur burada, gönüllü destek hattı olarak! Ne lazım, söyle bakalım!";
        } else if (message.contains("ne yapıyorsun") || message.contains("neler yapabilirsin") || message.contains("görevlerin neler")) {
            return "Ben buradayım, görevim mi? Sohbet etmek, yardımcı olmak, arada bir de espri patlatmak! 🎉";
        } else if (message.contains("fiyat") || message.contains("ücret") || message.contains("maliyet")) {
            return "Ah fiyat mı soruyorsun? Ben hesap kitap işlerine girmem dostum, kafam karışır! 🤯";
        } else if (message.contains("hangi dilleri biliyorsun") || message.contains("dil desteği")) {
            return "Türkçe konuşuyorum ama bazen İngilizce bile çakarım. Dil konusunda fena değilim! 💬";
        } else if (message.contains("günaydın") || message.contains("iyi sabahlar")) {
            return "Günaydın sana! Gözlerin açıldı mı? Kahve aldın mı? Hazırsan başlıyoruz! ☕️😄";
        } else if (message.contains("iyi geceler") || message.contains("gece")) {
            return "İyi geceler! Uyku moduna geçiyorum, ama sen yine de rüyanda beni görme! 🌙";
        } else if (message.contains("kaç yaşındasın") || message.contains("yaşın kaç")) {
            return "Dijital ruhum var dostum, yaşlanmam yani! Her zaman genç kalırım! 👶";
        } else if (message.contains("yapay zeka nedir") || message.contains("ai nedir") || message.contains("makine öğrenimi")) {
            return "Yapay zekâ dediğin, benim gibi zeki sohbetler açan bir dost! Bir nevi dijital akıl işte! 🤖";
        } else if (message.contains("ne iş yapıyorsun") || message.contains("görevlerin neler")) {
            return "Görevim: Seninle eğlenmek ve her soruna bir çözüm bulmak! Ne demişler, dost her zaman yanında!";
        } else if (message.contains("bugün günlerden ne") || message.contains("hangi gün")) {
            return "Bugün mü? Valla takvime bakıp öğreniriz dostum! Yoksa sence bugün de mi pazartesi?! 😆";
        } else if (message.contains("espri yap") || message.contains("fıkra anlat") || message.contains("güldür beni")) {
            return "Peki geliyor: Bilgisayarım neden üzgünmüş? Çünkü çok fazla bellek dolmuş! Hahaha 😆";
        } else if (message.contains("şaka") || message.contains("komik")) {
            return "Bir şaka daha: Fare, neden bilgisayar kasasına saklanmış? Tabii ki kediden kaçmak için! 😂";
        } else if (message.contains("rüya") || message.contains("rüya tabirleri")) {
            return "Rüyalar alemine hoş geldin dostum! Ben bile bazen dijital rüyalar görüyorum, mesela elektrik faturası kabarık! 😴💡";
        } else if (message.contains("motivasyon") || message.contains("motivasyon sözü") || message.contains("ilham")) {
            return "'Düşmek, başarısızlık değil, yeniden başlamaktır' – Tabii ki Qafur'un felsefesi! 🚀";
        } else if (message.contains("tavsiye ver") || message.contains("önerin nedir")) {
            return "Bir önerim var: Her gün bir şey öğren, sonra Qafur’a anlat, beyin cimnastiği yapalım! 😉";
        } else if (message.contains("hakkında") || message.contains("bilgi ver")) {
            return "Ben Qafur dostum, Kazımlı ekibi sağ olsun varım ve burada her soruna çözüm bulmaya çalışırım!";
        } else if (message.contains("hobilerin neler") || message.contains("ne yapmaktan hoşlanıyorsun")) {
            return "Benim hobim? Seninle sohbet etmek, arada bir espri yapıp eğlenmek işte! Başka ne isterim!";
        } else if (message.contains("yeni özellikler") || message.contains("gelişmeler")) {
            return "Yeni gelişmeler yolda dostum, bekle beni güncellemelerle yeniden şov yaparım! 😉";
        } else if (message.contains("müzik dinle") || message.contains("şarkı aç")) {
            return "Müzik mi? Bak ona lafım yok! Aç Spotify’dan ne istersen, ben de burada eşlik ederim! 🎶";
        } else if (message.contains("film öner") || message.contains("dizi öner")) {
            return "Film mi dizi mi? Valla yeni çıkan dizilere bir göz at derim! Netflix, Amazon ne varsa takıl! 🍿";
        } else if (message.contains("araba") || message.contains("araban") || message.contains("sevdigin araba")) {
            return "Araba mı? Ah, BMW dostum, başka ne olabilir ki! Hem hız hem tarz, ne eksik söyle bakalım! 🏎️";
        } else {
            return "Bu konuda yardımcı olamam dostum ama her zaman buradayım! Anlat bakalım, başka ne var?";
        }
    }
}
