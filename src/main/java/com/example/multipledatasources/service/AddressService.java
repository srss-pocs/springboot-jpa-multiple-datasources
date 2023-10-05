package com.example.multipledatasources.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.multipledatasources.entity.Address;
import com.example.multipledatasources.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public Optional<Address> findById(int id) {
		return addressRepository.findById(id);
	}

	public Address findByUserId(int userId) {
		return addressRepository.findByUserId(userId);
	}
	
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
}
