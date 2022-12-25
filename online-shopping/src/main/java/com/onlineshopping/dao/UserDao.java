package com.onlineshopping.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlineshopping.model.User;


public interface UserDao extends MongoRepository<User, Integer> {
	
	User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);
	List<User> findByRole(String role);

}
