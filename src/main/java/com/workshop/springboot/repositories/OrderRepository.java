package com.workshop.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
