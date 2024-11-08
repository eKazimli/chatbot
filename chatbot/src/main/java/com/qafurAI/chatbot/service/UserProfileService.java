package com.qafurAI.chatbot.service;

import com.qafurAI.chatbot.entity.UserProfile;
import com.qafurAI.chatbot.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public Optional<UserProfile> findByFirstName(String firstName) {
        return userProfileRepository.findByFirstName(firstName);
    }

    public Optional<UserProfile> findByLastName(String lastName) {
        return userProfileRepository.findByLastName(lastName);
    }

    public UserProfile saveUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }
}
