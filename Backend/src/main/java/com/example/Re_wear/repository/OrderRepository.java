package com.example.Re_wear.repository;

import java.util.List;

import com.example.Re_wear.model.Order;

public interface OrderRepository {
    Order save(Order order);
    Order findById(Long orderid);
    List<Order> findAll();
    List<Order> findByBuyerid(Long buyerid);
    List<Order> findByItemid(Long itemid);
    void deleteById(Long orderid);
}
