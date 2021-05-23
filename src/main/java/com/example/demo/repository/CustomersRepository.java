package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Long>{
	
}
