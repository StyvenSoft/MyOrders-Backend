package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long>{

}
