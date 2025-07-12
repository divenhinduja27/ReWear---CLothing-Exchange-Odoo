package com.example.Re_wear.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Re_wear.model.Item;
import com.example.Re_wear.repository.ItemRepository;
import com.example.Re_wear.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public List<Item> findByUploaderId(Long uploaderId) {
        return itemRepository.findByUserid(uploaderId);
    }

    @Override
    public List<Item> findPendingApproval() {
        return itemRepository.findByAvailable("pending");
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void approveItem(Long itemId) {
        itemRepository.approveItemById(itemId);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void rejectItem(Long itemId) {
        itemRepository.rejectItemById(itemId);
    }

    @Override
    public void removeItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
