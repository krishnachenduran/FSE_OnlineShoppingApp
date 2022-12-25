package com.onlineshopping.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlineshopping.model.Category;

public interface CategoryDao extends MongoRepository<Category, Integer> {
	

}
