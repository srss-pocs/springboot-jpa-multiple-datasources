package com.example.multipledatasources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.multipledatasources.entity.Customer;
import com.example.multipledatasources.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Optional<Customer> findById(int id) {
		return customerRepository.findById(id);
	}

	public Customer findByUserId(int userId) {
		return customerRepository.findByUserId(userId);
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	

}
