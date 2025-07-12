package com.example.Re_wear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Re_wear.model.User;
import com.example.Re_wear.service.ItemService;
import com.example.Re_wear.service.OrderService;
import com.example.Re_wear.service.UserService;

@Controller
public class DashboardController {
    @Autowired
    private UserService userService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private OrderService orderService;
    @GetMapping("/dashboard")
    public String dashboard(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        if (userDetails == null) {
            return "redirect:/auth/login";
        }
        User user = userService.findByEmail(userDetails.getUsername());
        model.addAttribute("user", user);
        model.addAttribute("items", itemService.findByUploaderId(user.getUserid()));
        model.addAttribute("orders", orderService.findByBuyerid(user.getUserid()));
        return "dashboard";
    }
}
