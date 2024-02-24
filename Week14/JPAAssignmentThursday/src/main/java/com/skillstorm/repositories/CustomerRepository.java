package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
