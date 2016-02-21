package com.example.test.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.domain.model.Customer;
import com.example.test.domain.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		
		List<Customer> customers = customerRepository.findAll();
		return customers;
		
	}
	
}
