package com.qafurAI.chatbot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
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
