package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
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
	
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getCustomers() {
       
    	List<Customer> customers = customerService.findAll();
    	return customers;
    	
    }
	
    
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Customer getCustomer(@PathVariable("id") String id) {
    	Customer customer = customerService.findOne(id);
    	return customer;
    }
}
