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
@Table (name = "orders")

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
	
	public Orders(Timestamp orderDate, int quantity, int unitPrice, Customers customers, Employees employees) {
		super();
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.customers = customers;
		this.employees = employees;
	}
	
	public Orders() {
	}
	
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
}
