package com.example.multipledatasources.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multipledatasources.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	Address findByUserId(int userId);

}