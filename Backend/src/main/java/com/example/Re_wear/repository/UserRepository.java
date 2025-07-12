package com.example.Re_wear.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Re_wear.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
