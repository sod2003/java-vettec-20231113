package com.skillstorm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skillstorm.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT * FROM customer")
    List<Customer> findAll();

    @Query("SELECT * FROM customer WHERE customer_id = :id")
    Customer findById(@Param("id") int id);

    @Query("INSERT INTO customer (name, address) VALUES (:name, :address)")
    Customer save(@Param("name") String name, @Param("address") String address);
}
