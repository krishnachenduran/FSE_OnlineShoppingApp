package com.onlineshopping.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlineshopping.model.Cart;


public interface CartDao extends MongoRepository<Cart, Integer> {	
	
	List<Cart> findByUser_id(int userId);

}
