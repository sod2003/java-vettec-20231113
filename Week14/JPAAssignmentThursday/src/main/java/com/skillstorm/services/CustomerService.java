package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Customer;
import com.skillstorm.repositories.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public List<Customer> findAll() {
        return repo.findAll();
    }
   
    public Customer findById(Long id) {
        return repo.getReferenceById(id);
    }
   
    public Customer save(Customer customer) {
        return repo.save(customer);
    }
}