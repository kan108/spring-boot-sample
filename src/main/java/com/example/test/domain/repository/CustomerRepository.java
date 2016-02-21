package com.example.test.domain.repository;

import java.util.List;

import com.example.test.domain.model.Customer;

public interface CustomerRepository {
	
	List<Customer> findAll();

}
