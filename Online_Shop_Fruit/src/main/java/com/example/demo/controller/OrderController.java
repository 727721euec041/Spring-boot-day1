package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
@RestController
public class OrderController {
	@Autowired
	OrderService ser;

	@DeleteMapping("deleted/{id}")
	public String delete(@PathVariable int id)
	{
		return ser.deleteId(id);
	}
	@PutMapping("updated/{id}")
	public Order updateId(@PathVariable int id, @RequestBody Order fr)
	{
		return ser.updateId(id, fr);
	}
}
