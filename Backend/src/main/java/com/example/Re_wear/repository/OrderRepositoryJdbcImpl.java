package com.example.Re_wear.repository;

import com.example.Re_wear.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryJdbcImpl implements OrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Order save(Order order) {
        if (order.getOrderid() == null) {
            jdbcTemplate.update(
                "INSERT INTO Orders (itemid, buyerid, category, isbuy, status) VALUES (?, ?, ?, ?, ?)",
                order.getItemid(), order.getBuyerid(), order.getCategory(), order.getIsbuy(), order.getStatus()
            );
        } else {
            jdbcTemplate.update(
                "UPDATE Orders SET itemid=?, buyerid=?, category=?, isbuy=?, status=? WHERE orderid=?",
                order.getItemid(), order.getBuyerid(), order.getCategory(), order.getIsbuy(), order.getStatus(), order.getOrderid()
            );
        }
        // For simplicity, not returning the auto-generated id. Use queryForObject if needed.
        return order;
    }

    @Override
    public Order findById(Long orderid) {
        return jdbcTemplate.queryForObject(
            "SELECT * FROM Orders WHERE orderid = ?",
            new BeanPropertyRowMapper<>(Order.class),
            orderid
        );
    }

    @Override
    public List<Order> findAll() {
        return jdbcTemplate.query("SELECT * FROM Orders", new BeanPropertyRowMapper<>(Order.class));
    }

    @Override
    public List<Order> findByBuyerid(Long buyerid) {
        return jdbcTemplate.query(
            "SELECT * FROM Orders WHERE buyerid = ?",
            new BeanPropertyRowMapper<>(Order.class),
            buyerid
        );
    }

    @Override
    public List<Order> findByItemid(Long itemid) {
        return jdbcTemplate.query(
            "SELECT * FROM Orders WHERE itemid = ?",
            new BeanPropertyRowMapper<>(Order.class),
            itemid
        );
    }

    @Override
    public void deleteById(Long orderid) {
        jdbcTemplate.update("DELETE FROM Orders WHERE orderid = ?", orderid);
    }
}
