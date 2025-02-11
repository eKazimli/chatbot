package com.qafurAI.chatbot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "users")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private int age;
    @Setter
    private String birthDate;

    public UserProfile() {}

    public UserProfile(String firstName, String lastName, int age, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Adım " + firstName + " " + lastName + ", yaşım " + age + " ve doğum tarihim " + birthDate + ".";
    }
}
