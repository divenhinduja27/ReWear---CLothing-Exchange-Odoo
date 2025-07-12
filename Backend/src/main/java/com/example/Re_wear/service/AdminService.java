package com.example.Re_wear.service;

import java.util.List;

import com.example.Re_wear.model.Admin;

public interface AdminService {
    Admin save(Admin admin);
    Admin findById(Long adminid);
    Admin findByEmail(String email);
    List<Admin> findAll();
    void deleteById(Long adminid);
}
