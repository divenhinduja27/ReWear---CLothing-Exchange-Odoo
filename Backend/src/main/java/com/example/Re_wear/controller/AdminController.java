package com.example.Re_wear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Re_wear.service.ItemService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private ItemService itemService;
    @GetMapping("")
    public String adminPanel(Model model) {
        model.addAttribute("pendingItems", itemService.findPendingApproval());
        model.addAttribute("allItems", itemService.findAll());
        return "admin-panel";
    }

    @PostMapping("/approve/{id}")
    public String approveItem(@PathVariable Long id) {
        itemService.approveItem(id);
        return "redirect:/admin";
    }

    @PostMapping("/reject/{id}")
    public String rejectItem(@PathVariable Long id) {
        itemService.rejectItem(id);
        return "redirect:/admin";
    }

    @PostMapping("/remove/{id}")
    public String removeItem(@PathVariable Long id) {
        itemService.removeItem(id);
        return "redirect:/admin";
    }
}
