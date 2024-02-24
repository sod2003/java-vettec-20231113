package com.skillstorm.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skillstorm.models.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {

    @Query("SELECT * FROM order_info")
    List<OrderInfo> findAll();

    @Query("SELECT * FROM order_info WHERE order_id = ?")
    OrderInfo findById(int id);

    @Query("INSERT INTO order_info (scheduled_time, customer_id) VALUES (?1, ?2)")
    OrderInfo save(LocalDateTime scheduledTime, int customerId);
}
