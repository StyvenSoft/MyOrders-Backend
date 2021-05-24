package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping ("/orders/")
public class OrderRest {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	private ResponseEntity<List<Orders>> getAllOrders() {
		return ResponseEntity.ok(orderService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Orders> saveOrders(@RequestBody Orders orders){
		try {
			Orders ordersSave = orderService.save(orders);
			return ResponseEntity.created(new URI("/orders/"+ordersSave.getOrderId())).body(ordersSave);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	}	
}
