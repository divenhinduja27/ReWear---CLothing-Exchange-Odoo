package com.example.Re_wear.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Re_wear.model.Order;
import com.example.Re_wear.repository.OrderRepository;
import com.example.Re_wear.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findById(Long orderid) {
        return orderRepository.findById(orderid);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findByBuyerid(Long buyerid) {
        return orderRepository.findByBuyerid(buyerid);
    }

    @Override
    public List<Order> findByItemid(Long itemid) {
        return orderRepository.findByItemid(itemid);
    }

    @Override
    public void deleteById(Long orderid) {
        orderRepository.deleteById(orderid);
    }
}
