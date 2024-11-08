package com.qafurAI.chatbot.repository;

import com.qafurAI.chatbot.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    Optional<UserProfile> findByFirstName(String firstName);
    Optional<UserProfile> findByLastName(String lastName);
}
