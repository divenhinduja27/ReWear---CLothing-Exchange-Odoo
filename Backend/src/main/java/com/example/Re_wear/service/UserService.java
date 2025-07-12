package com.example.Re_wear.service;

import java.util.List;

import com.example.Re_wear.model.User;

public interface UserService {
    User findByEmail(String email);
    User save(User user);
    List<User> findAll();
    User findById(Long id);
}
