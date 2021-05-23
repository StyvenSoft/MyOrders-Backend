package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping ("/employees/")
public class EmployeeRest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	private ResponseEntity<List<Employees>> getAllEmployees (){
		return ResponseEntity.ok(employeeService.findAll());
	}
}
