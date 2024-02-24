package com.skillstorm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.models.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Integer>{

    @Query("SELECT * FROM grocery_item")
    List<GroceryItem> findAll();

    @Query("SELECT * FROM grocery_item WHERE grocery_id = ?")
    GroceryItem findById(int id);

    @Query("INSERT INTO grocery_item (description, quantity, order_id) VALUES (?1, ?2, ?3)")
    GroceryItem save(String description, int quantity, int orderId);
}
