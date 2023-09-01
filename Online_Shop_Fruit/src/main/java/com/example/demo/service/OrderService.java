package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepo;
@Service
public class OrderService {
	@Autowired
	OrderRepo f;
	public String create(Order fr) {
		if(!f.existsById(fr.getId())) {
			f.save(fr);
			return "CREATED SUCCESSFULLY";			
		}
		else
			return "NOT CREATED";
	}
	public String deleteId(int id) {
		if(f.existsById(id)) {
			f.deleteById(id);
			return "Deleted successfully";
		}
		else
			return "Enter a valid id to delete";
}
	
	public Order updateId(int id, Order fr) {
		if(f.existsById(id)) {
			System.out.println("UPDATED SUCCESSFULLY");
			return f.saveAndFlush(fr);
		}
		else {
			System.out.println("Please enter a valid id");
			return fr;
		}
	}

	
	
}
