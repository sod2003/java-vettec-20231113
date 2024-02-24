package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.OrderInfo;
import com.skillstorm.repositories.OrderInfoRepository;

@Service
public class OrderInfoService {

    @Autowired
    private OrderInfoRepository repo;
    
    public List<OrderInfo> findAll() {
        return repo.findAll();
    }
   
    public OrderInfo findById(Long id) {
        return repo.getReferenceById(id);
    }
   
    public OrderInfo save(OrderInfo orderInfo) {
        return repo.save(orderInfo);
    }
}
