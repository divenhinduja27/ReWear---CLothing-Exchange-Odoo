package com.example.Re_wear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Re_wear.model.Admin;
import com.example.Re_wear.model.User;
import com.example.Re_wear.service.AdminService;
import com.example.Re_wear.service.UserService;

@RestController
@RequestMapping("/temp")
public class AuthController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/admin-login")
    public String adminLogin(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid admin email or password");
        }
        return "admin-login";
    }

    @GetMapping("/admin-signup")
    public String adminSignup() {
        return "admin-signup";
    }

    @PostMapping("/admin-signup")
    public String processAdminSignup(@RequestParam String email, @RequestParam String password, @RequestParam String name, Model model) {
        // Check if admin already exists
        if (adminService.findByEmail(email) != null) {
            model.addAttribute("error", "Admin email already registered");
            return "admin-signup";
        }
        // Create and save admin
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setPassword(passwordEncoder.encode(password));
        admin.setName(name);
        adminService.save(admin);
        return "redirect:/auth/admin-login";
    }
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid email or password");
        }
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String processSignup(@RequestParam String email, @RequestParam String password, @RequestParam String name, Model model) {
        // Check if user already exists
        if (userService.findByEmail(email) != null) {
            model.addAttribute("error", "Email already registered");
            return "signup";
        }
        // Create and save user
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setName(name);
        userService.save(user);
        return "redirect:/auth/login";
    }
}
