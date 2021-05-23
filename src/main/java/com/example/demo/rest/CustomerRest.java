package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customers;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping ("/customers/")
public class CustomerRest {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	private ResponseEntity<List<Customers>> getAllCustomers () {
		return ResponseEntity.ok(customerService.findAll());
	}
}
