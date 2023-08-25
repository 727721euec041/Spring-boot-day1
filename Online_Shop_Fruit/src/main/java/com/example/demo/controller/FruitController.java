package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Fruit;
import com.example.demo.service.FruitService;

@RestController
public class FruitController {
	@Autowired
	FruitService fser;
	
	@GetMapping("getit")
	public List<Fruit> show(){
		return fser.showinfo();
	}
	
	@GetMapping("/getQuery")
	public ResponseEntity<List<Fruit>> getQuery()
	{
		return ResponseEntity.status(200).body(fser.findAllQuery());
	}
 	
	@GetMapping("getId/{id}")
	public Optional<Fruit> showid(@PathVariable int id) {
		return fser.readid(id);
	}
	@PutMapping("updatequery")
	public void updateUserQuery(@PathVariable String price, @PathVariable Long id)
	{
		fser.updateUserQuery(price, id);
	}
	@GetMapping("getAllUser")
	
		public ResponseEntity<Page<Fruit>> getAllUSer
		(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size,
			@RequestParam(defaultValue = "id") String sortField,
			@RequestParam(defaultValue = "asc") String sortOrder
			
				)
		{
			PageRequest pageRequest = PageRequest.of(page, size,Sort.by(Sort.Direction.fromString(sortOrder), sortField));
			return ResponseEntity.status(200).body(fser.getAllUser(pageRequest));
		}
	
	
	@PostMapping("add")
	public String add(@RequestBody Fruit fr) {
		return  fser.create(fr);
	}
	
	@PutMapping("update/{id}")
	public Fruit updateId(@PathVariable int id, @RequestBody Fruit fr) {
		return fser.updateId(id, fr);
	}
	
	
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		return fser.deleteId(id);
	}
	@DeleteMapping("deleteQuery")
	public int deleteUserQuery(@PathVariable int id)
	{
		return fser.deleteUser(id);
	}
	
}
