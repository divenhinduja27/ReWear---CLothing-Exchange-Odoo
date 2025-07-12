
package com.example.Re_wear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;
    private Long itemid;
    private Long buyerid;
    private String category; // 'swap' or 'platform'
    private String isbuy; // 'true', 'false', or NULL
    private String status; // 'pending', 'completed'

    public Long getOrderid() { return orderid; }
    public void setOrderid(Long orderid) { this.orderid = orderid; }
    public Long getItemid() { return itemid; }
    public void setItemid(Long itemid) { this.itemid = itemid; }
    public Long getBuyerid() { return buyerid; }
    public void setBuyerid(Long buyerid) { this.buyerid = buyerid; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getIsbuy() { return isbuy; }
    public void setIsbuy(String isbuy) { this.isbuy = isbuy; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
