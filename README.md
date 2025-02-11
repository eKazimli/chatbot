ChatBot Projesi

📌 Projenin Genel Tanıtımı

Bu proje, kullanıcıların mesajlarını analiz eden ve anlamlı yanıtlar üreten bir AI destekli sohbet botudur.
Spring Boot, PostgreSQL ve OpenAI API ile geliştirilmiş olup, hem metin tabanlı hem de sesli mesaj desteği sunar.

🚀 Projenin Yetenekleri ve Fonksiyonları

1️⃣ Sohbet (Chat) İşlevleri

✅ Kullanıcının mesajlarına anlamlı ve dinamik yanıtlar verir.✅ OpenAI API ile AI destekli gelişmiş cevaplar sunar.✅ Kullanıcının mesajlarını analiz ederek farklı bağlamlarda yanıt üretir.

2️⃣ AI ile Metin Üretimi

✅ Kullanıcının verdiği bir "prompt" üzerinden AI ile anlamlı metinler oluşturur.✅ Örnek: "Bir yaz günü sahilde olmak" → "Sıcak kumlar, dalgaların huzur veren sesi..."✅ AI modeli sayesinde özgün içerikler üretir.

3️⃣ Hava Durumu Bilgisi

✅ Kullanıcının belirttiği şehir için güncel hava durumu bilgilerini getirir.✅ Hava tahminlerini dinamik olarak sunar (API entegrasyonu ile genişletilebilir).

4️⃣ Kullanıcı Profili Yönetimi

✅ Kullanıcılar için isim kaydetme ve profil oluşturma desteği sunar.✅ Kullanıcının adı ve diğer bilgileri PostgreSQL veritabanında saklanır.✅ Kullanıcı, adını tekrar sormadan çağırabilir ("Benim adım ne?" gibi).

5️⃣ Dinamik Sohbet Geliştirme

✅ Kullanıcının sorduğu farklı sorulara esnek yanıtlar oluşturur.✅ "Bana bir şaka yap", "Nasıl gidiyor?" gibi sorulara eğlenceli yanıtlar verebilir.

6️⃣ JWT ile Kullanıcı Kimlik Doğrulama

✅ Kullanıcılar giriş yaparak JWT (JSON Web Token) ile kimlik doğrulaması yapabilir.✅ Yetkilendirme ve güvenlik mekanizması sayesinde sadece giriş yapan kullanıcılar mesaj gönderebilir.✅ API güvenliği sağlanmıştır.

7️⃣ Google Speech API ile Sesli Mesaj Tanıma

✅ Kullanıcı sesli mesaj gönderebilir ve bu mesaj metne çevrilebilir.✅ Google Speech-to-Text API kullanarak konuşmalar metne dönüştürülür.

8️⃣ Web ve Mobil Uygulama Desteği İçin API

✅ Proje içinde entegre bir HTML + JavaScript frontend bulunur.✅ Kullanıcı arayüzü üzerinden giriş yapıp sohbet edilebilir.✅ Dışarıdan React.js, Vue.js veya mobil uygulamalar ile kolayca bağlanabilir.

🛠️ Teknolojiler ve Kullanılan Araçlar

Backend: Java (Spring Boot, Spring Security, Spring Data JPA)

Veritabanı: PostgreSQL

Kimlik Doğrulama: JWT (JSON Web Token)

AI Desteği: OpenAI API (ChatGPT)

Sesli Mesaj Tanıma: Google Speech-to-Text API

Frontend: HTML + JavaScript (static dizini içinde)

💡 Projenin Kurulumu ve Çalıştırılması

📌 Gereksinimler

Java 17+

Maven

PostgreSQL (chatbot_db veritabanı oluşturulmalı)

Ngrok (Eğer dışarıdan test edilecekse)

📌 Kurulum Adımları

1️⃣ PostgreSQL’i Çalıştır:

net start postgresql  # Windows
sudo systemctl start postgresql  # Linux / Mac

2️⃣ Proje Klasörüne Gir:

cd chatbot  # Proje klasörüne gir

3️⃣ Maven ile Uygulamayı Başlat:

mvn clean install
mvn spring-boot:run

4️⃣ Tarayıcıda Frontend’i Aç:

http://localhost:8080/index.html

5️⃣ Postman veya cURL ile API Testleri Yap:

curl -X POST http://localhost:8080/auth/login -H "Content-Type: application/json" -d '{"username": "ali"}'

Gelen JWT token ile API çağrıları yapabilirsiniz.

🚀 Dışarıdan Erişim ve Ngrok ile Test Etme

Eğer projeyi başka cihazlardan test etmek istiyorsan:
1️⃣ Ngrok’u çalıştır:

ngrok http 8080

2️⃣ Ngrok’un verdiği URL’yi kullanarak test et:

https://random-ngrok-id.ngrok.io/index.html

📌 API Endpoint’leri

HTTP Metodu

Endpoint

Açıklama

POST

/auth/login

Kullanıcı girişi yapar, JWT döner.

POST

/api/chatbot/send

Kullanıcının mesajını chatbot'a gönderir.

POST

/api/chatbot/speech-to-text

Sesli mesajı metne çevirir.

👨‍💻 Geliştirme ve Katkı Sağlama

✅ Projeyi geliştirmek istiyorsan:

Yeni API özellikleri ekleyebilirsin.

Daha gelişmiş AI yanıtları oluşturabilirsin.

Web veya mobil uygulama entegrasyonları yapabilirsin.

📩 Geri bildirim veya katkı sağlamak istersen, benimle iletişime geçebilirsin! 🚀