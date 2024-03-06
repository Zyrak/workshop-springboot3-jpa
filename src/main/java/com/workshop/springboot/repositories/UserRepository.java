package com.workshop.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
