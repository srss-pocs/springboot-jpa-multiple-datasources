package com.example.multipledatasources.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.multipledatasources.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {
	Customer findByUserId(int userId);
}