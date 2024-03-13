package com.workshop.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.springboot.entities.Category;
import com.workshop.springboot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository orderRepository;

	public List<Category> findAll() {
		return orderRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = orderRepository.findById(id);
		return obj.get();
	}
}
