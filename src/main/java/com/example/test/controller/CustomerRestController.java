package com.example.test.controller;

import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.domain.model.Customer;
import com.example.test.domain.service.CustomerService;

@RestController
@RequestMapping("api/customers")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	  // (1)
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getCustomers() {
       
    	List<Customer> customers = customerService.findAll();
    	return customers;
    	
    }
	
}
