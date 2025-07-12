
package com.example.Re_wear.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Re_wear.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByUserid(Long userid);
    List<Item> findByAvailable(String available);

    // Approve item (set available = 'yes')
    @org.springframework.data.jpa.repository.Modifying
    @org.springframework.data.jpa.repository.Query("UPDATE Item i SET i.available = 'yes' WHERE i.itemid = :itemId")
    void approveItemById(@org.springframework.data.repository.query.Param("itemId") Long itemId);

    // Reject item (set available = 'no')
    @org.springframework.data.jpa.repository.Modifying
    @org.springframework.data.jpa.repository.Query("UPDATE Item i SET i.available = 'no' WHERE i.itemid = :itemId")
    void rejectItemById(@org.springframework.data.repository.query.Param("itemId") Long itemId);
}
