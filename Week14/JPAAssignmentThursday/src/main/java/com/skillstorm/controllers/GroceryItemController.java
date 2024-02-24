package com.skillstorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.GroceryItem;
import com.skillstorm.services.GroceryItemService;

@RestController
@RequestMapping("/groceries")
public class GroceryItemController {
    
    @Autowired
    private GroceryItemService service;
    
    @GetMapping
    public List<GroceryItem> findAll() {
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public GroceryItem findById(@PathVariable int id) {
        return service.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public GroceryItem save(@RequestBody GroceryItem groceryItem) {
        return service.save(groceryItem);
    }
}