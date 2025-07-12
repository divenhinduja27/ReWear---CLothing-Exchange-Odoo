package com.example.Re_wear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Re_wear.model.Admin;
import com.example.Re_wear.model.User;
import com.example.Re_wear.service.AdminService;
import com.example.Re_wear.service.UserService;

import java.util.Map;

@RestController
@RequestMapping("/temp")
public class AuthController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Admin login
    @GetMapping("/admin-login")
    public String adminLogin(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid admin email or password");
        }
        return "admin-login";
    }

    // Admin signup
    @GetMapping("/admin-signup")
    public String adminSignup() {
        return "admin-signup";
    }

    @PostMapping("/admin-signup")
    public String processAdminSignup(@RequestParam String email, @RequestParam String password, @RequestParam String name, Model model) {
        if (adminService.findByEmail(email) != null) {
            model.addAttribute("error", "Admin email already registered");
            return "admin-signup";
        }

        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setPassword(passwordEncoder.encode(password));
        admin.setName(name);
        adminService.save(admin);
        return "redirect:/temp/admin-login";
    }

    // User login
    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid email or password");
        }
        return "login";
    }
    @PostMapping("/login")
    public String processLogin(@RequestBody Map<String, String> loginData, Model model) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        User user = userService.findByEmail(email);
        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
            model.addAttribute("error", "Invalid email or password");
            return "login"; // return login page (if using Thymeleaf or JSP)
        }

        // If login successful, redirect
        return "redirect:/temp/dashboard"; // or wherever you want
    }


    // User signup
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String processSignup(
            @RequestBody Map<String, String> requestBody,
            Model model) {

        if (userService.findByEmail(requestBody.get("email")) != null) {
            model.addAttribute("error", "Email already registered");
            return "signup";
        }

        if (!requestBody.get("password").equals(requestBody.get("confirmPassword"))) {
            model.addAttribute("error", "Passwords do not match");
            return "signup";
        }

        User user = new User();
        user.setName(requestBody.get("fullName"));
        user.setEmail(requestBody.get("email"));
        user.setUsername(requestBody.get("username"));
        user.setPhoneNumber(requestBody.get("phoneNumber"));
        user.setPassword(passwordEncoder.encode(requestBody.get("password")));

        userService.save(user);

        return "redirect:/temp/login";
    }
}
