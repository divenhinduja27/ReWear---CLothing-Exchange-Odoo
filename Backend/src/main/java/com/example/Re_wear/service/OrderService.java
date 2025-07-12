package com.example.Re_wear.service;

import java.util.List;

import com.example.Re_wear.model.Order;

public interface OrderService {
    Order save(Order order);
    Order findById(Long orderid);
    List<Order> findAll();
    List<Order> findByBuyerid(Long buyerid);
    List<Order> findByItemid(Long itemid);
    void deleteById(Long orderid);
}
