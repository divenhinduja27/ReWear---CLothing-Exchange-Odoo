package com.example.Re_wear.service;

import java.util.List;

import com.example.Re_wear.model.Item;

public interface ItemService {
    Item save(Item item);
    List<Item> findAll();
    Item findById(Long id);
    List<Item> findByUploaderId(Long uploaderId);
    List<Item> findPendingApproval();
    void approveItem(Long itemId);
    void rejectItem(Long itemId);
    void removeItem(Long itemId);
}
