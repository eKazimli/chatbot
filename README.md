Projenin Yetenekleri ve Fonksiyonları:

1. Sohbet (Chat) İşlevleri
    - Kullanıcının mesajlarına yanıt verir.
    - Her mesaj için farklı ve anlamlı yanıtlar üretebilir.
    - Mesajları anlamlandırarak, AI (DeepAI) desteği ile daha gelişmiş yanıtlar sunabilir.

2. AI ile Metin Üretimi
    - Kullanıcı tarafından verilen bir "prompt" (başlangıç metni) ile AI üzerinden anlamlı metinler oluşturur.
    - Örneğin:
        - Girdi: "Bir yaz günü sahilde olmak"
        - Çıktı: "Sıcak kumlar, dalgaların huzur veren sesi ve güneşin sıcaklığı..."

3. Hava Durumu Bilgisi
    - Kullanıcının belirttiği şehir için hava durumu bilgisi sağlar.
    - Şehir adını algılayarak:
        - Güncel sıcaklık
        - Hava durumu tahmini (ör. yağmurlu, güneşli)
    - Dinamik olarak gerçek zamanlı hava durumu entegrasyonu yapılabilir (WeatherService ile).

4. Kullanıcı Profili Yönetimi
    - Profil Güncelleme: Kullanıcının ad ve soyad bilgilerini alarak veritabanında saklar.
    - Profil Sorgulama: Kullanıcı adını sorgulayarak kaydedilmiş bilgileri getirir.
        - Örneğin:
            - Girdi: "/profil/Ahmet"
            - Çıktı: "Kayıtlı profil: Ahmet Yılmaz"
    - Veritabanı (H2) entegrasyonu ile bilgiler kalıcı olarak saklanır.

5. Kullanıcı Bilgilerini Geçici Olarak Saklama
    - Uygulama çalıştığı sürece:
        - Kullanıcının ad ve soyad bilgilerini bellekte tutar.
        - "Adımı hatırla" gibi özellikler sunar.
    - Örneğin:
        - Girdi: "/kullanici/adi/Ahmet"
        - Sonra: "/benim-adim"
        - Yanıt: "Adın Ahmet, harika bir isim!"

6. Dinamik Sohbet Geliştirme
    - Kullanıcı mesajlarına göre özelleştirilmiş yanıtlar oluşturur.
    - Örnek sorular:
        - "Nasıl gidiyor?"
        - "Bana bir şaka yap"
        - "Hangi arabayı seversin?"
    - Yanıtlar, kullanıcıdan alınan girdiye göre şekillendirilir.

7. H2 Veritabanı Kullanımı
    - Kullanıcı profilleri, veritabanında saklanır.
    - Kalıcı olarak ad ve soyad bilgilerini saklar ve getirir.
    - Veritabanı sorgularıyla daha karmaşık kullanıcı yönetimi yapılabilir.

8. Kolay Geliştirilebilirlik
    - Spring Boot ile geliştirildiği için:
        - Modüler ve genişletilebilir bir yapı sunar.
        - Yeni servisler veya API'ler eklemek kolaydır.
    - Örneğin, daha fazla sohbet yeteneği veya AI modeli eklenebilir.

9. Basit ve Hızlı Test Edilebilirlik
    - REST API formatında olduğundan Postman gibi araçlarla kolayca test edilebilir.
    - H2 veritabanı konsolundan kullanıcı profilleri sorgulanabilir:
        - URL: http://localhost:8080/h2-console

10. Kullanım Alanları
    - Chatbot: Kullanıcılar için dinamik bir sohbet botu olarak kullanılabilir.
    - Kişisel Asistan: Kullanıcıya hava durumu bilgisi, adını hatırlama gibi kişisel asistan özellikleri sunabilir.
    - AI Destekli Uygulamalar: Metin oluşturma veya anlamlandırma gibi özellikler için AI desteği sağlar.
    - Eğitim Amaçlı: Spring Boot, H2 veritabanı ve REST API geliştirme süreçlerini öğrenmek için ideal bir proje yapısı sunar.
