package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepo;

@Service
public class FruitService {
	@Autowired
	FruitRepo f;
	
	public List<Fruit> showinfo(){
		return f.findAll();
	}
	
	public Optional<Fruit> readid(int id) {
		return f.findById(id);
	}
	
	public String create(Fruit bk) {
		if(!f.existsById(bk.getId())) {
			f.save(bk);
			return "CREATED SUCCESSFULLY";			
		}
		else
			return "NOT CREATED";
	}
	
	public Fruit updateId(int id, Fruit bk) {
		if(f.existsById(id)) {
			System.out.println("UPDATED SUCCESSFULLY");
			return f.saveAndFlush(bk);
		}
		else {
			System.out.println("Please enter a valid id");
			return bk;
		}
	}
	
	public String deleteId(int id) {
		if(f.existsById(id)) {
			f.deleteById(id);
			return "Deleted successfully";
		}
		else
			return "Enter a valid id to delete";
}
	public Page<Fruit> getAllUser(PageRequest pageRequest)
	{
		return f.findAll(pageRequest);
	}

	public List<Fruit> getinfoid(int id) {
		// TODO Auto-generated method stub
		return f.getinfoid(id);
	}

	public List<Fruit> getinfoYear(int id) {
		// TODO Auto-generated method stub
		return f.getinfoYear(id);
	}
	
	public Fruit updateQuery(int id, Fruit bk) {
		if(f.existsById(id)) {
			System.out.println("UPDATED SUCCESSFULLY");
			return f.saveAndFlush(bk);
		}
		else {
			System.out.println("Please enter a valid id");
			return bk;
		}
	}

	
}
