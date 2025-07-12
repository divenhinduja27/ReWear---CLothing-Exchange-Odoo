
package com.example.Re_wear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemid;
    private String title;
    private String description;
    private String tag;
    private String size;
    private int point;
    private String available; // 'yes' or 'no'
    private String category;
    private String previouslistings;
    private Long userid; // uploader's user id
    private String images; // comma-separated URLs or paths

    public Long getItemid() { return itemid; }
    public void setItemid(Long itemid) { this.itemid = itemid; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public int getPoint() { return point; }
    public void setPoint(int point) { this.point = point; }
    public String getAvailable() { return available; }
    public void setAvailable(String available) { this.available = available; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getPreviouslistings() { return previouslistings; }
    public void setPreviouslistings(String previouslistings) { this.previouslistings = previouslistings; }
    public Long getUserid() { return userid; }
    public void setUserid(Long userid) { this.userid = userid; }
    public String getImages() { return images; }
    public void setImages(String images) { this.images = images; }
}
