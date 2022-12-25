package com.onlineshopping.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.onlineshopping.model.Address;


public interface AddressDao extends MongoRepository<Address, Integer> {

}
