package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "customer")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String companyName;
	private String contactName;
	private String city;
	private int phoneNumber;

}
