package com.onlineshopping.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlineshopping.model.Product;


public interface ProductDao extends MongoRepository<Product, Integer> {
	
	List<Product> findByCategoryId(int category);

}
