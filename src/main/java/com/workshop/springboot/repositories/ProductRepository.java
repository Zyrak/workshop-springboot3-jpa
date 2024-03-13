package com.workshop.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
