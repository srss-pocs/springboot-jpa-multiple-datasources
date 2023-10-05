package com.example.multipledatasources.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multipledatasources.entity.Address;
import com.example.multipledatasources.entity.Customer;
import com.example.multipledatasources.service.AddressService;
import com.example.multipledatasources.service.CustomerService;

@RestController
@RequestMapping("/api")
public class MultiDatabaseController {

	@Autowired
	CustomerService customerService;

	@Autowired
	AddressService addressService;

	@GetMapping("/customer/user/{userId}")
	public Customer findCustomerByUserId(@PathVariable int userId) {
		return customerService.findByUserId(userId);
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> findCustomerById(@PathVariable int id) {
		return customerService.findById(id);
	}

	@GetMapping("/address/{userId}")
	public Address findAddressByUserId(@PathVariable int userId) {
		return addressService.findByUserId(userId);
	}

	@GetMapping("/address/{id}")
	public Optional<Address> findById(@PathVariable int id) {
		return addressService.findById(id);
	}

	@PostMapping("/address")
	public void saveAddress(@RequestBody Address address) {
		addressService.saveAddress(address);
	}
	
	@PostMapping("/customer")
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}

}
