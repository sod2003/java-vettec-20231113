package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.GroceryItem;
import com.skillstorm.repositories.GroceryItemRepository;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepository repo;

    public List<GroceryItem> findAll() {
        return repo.findAll();
    }

    public GroceryItem findById(Long id) {
        return repo.getReferenceById(id);
    }

    public GroceryItem save(GroceryItem groceryItem) {
        return repo.save(groceryItem);
    }
}
