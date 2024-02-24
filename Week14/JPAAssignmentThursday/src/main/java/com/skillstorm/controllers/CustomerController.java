package com.skillstorm.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Customer;
import com.skillstorm.services.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> findAll() {
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id) {
        return service.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return service.save(customer);
    }
}
