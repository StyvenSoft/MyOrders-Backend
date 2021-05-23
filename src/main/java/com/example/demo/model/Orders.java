package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "order")

public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OrderId;
	private Timestamp orderDate;
	private int quantity;
	private int unitPrice;
	
	@ManyToOne
	@JoinColumn(name = "customers_id")
	private Customers customers;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employees employees;
	
}
