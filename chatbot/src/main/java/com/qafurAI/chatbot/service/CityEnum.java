package com.qafurAI.chatbot.service;

import lombok.Getter;

@Getter
public enum CityEnum {
    BAKU("Azerbaycan", "Hazar kıyısındaki harika bir şehir."),
    ISTANBUL("Türkiye", "Asya ve Avrupa'yı birleştiren büyüleyici şehir."),
    ANKARA("Türkiye", "Türkiye'nin başkenti, politik ve kültürel merkez."),
    LONDON("İngiltere", "Tarihi, kültürü ve Big Ben'i ile ünlü."),
    PARIS("Fransa", "Aşk şehri, Eyfel Kulesi'nin evi."),
    BERLIN("Almanya", "Tarihi, sanat ve modern kültürün merkezi."),
    TOKYO("Japonya", "Teknoloji ve geleneklerin buluşma noktası."),
    MOSCOW("Rusya", "Kızıl Meydan ve Kremlin'i ile ünlü."),
    MADRID("İspanya", "Sanat ve futbol tutkusunun merkezi."),
    ROME("İtalya", "Tarihi ve mutfağı ile dünyanın en güzel şehirlerinden biri."),
    NEW_YORK("ABD", "Hiç uyumayan şehir, Özgürlük Heykeli'nin evi."),
    TORONTO("Kanada", "Kültürel çeşitliliği ve CN Kulesi ile bilinir."),
    SHANGHAI("Çin", "Modern ve geleneksel kültürün bir araya geldiği yer."),
    SYDNEY("Avustralya", "Opera Evi ve güzel plajlarıyla ünlü."),
    SINGAPORE("Singapur", "Modern şehir devleti ve Marina Bay Sands."),
    KIEV("Ukrayna", "Tarihi yapılar ve sıcak insanlarıyla bilinir."),
    LOS_ANGELES("ABD", "Hollywood ve eğlence endüstrisinin merkezi."),
    CHICAGO("ABD", "Rüzgarlı Şehir, mimarisi ve pizzası ile ünlü."),
    WASHINGTON("ABD", "Beyaz Saray ve Amerikan tarihinin kalbi.");

    private final String country;
    private final String description;

    CityEnum(String country, String description) {
        this.country = country;
        this.description = description;
    }

    public static CityEnum fromString(String cityName) {
        for (CityEnum city : CityEnum.values()) {
            if (city.name().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }
}
