package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private final static Logger logger = LoggerFactory.getLogger(FruitController.class);
	
	
	
	
	@Autowired
	FruitService fser;
	
	@GetMapping("getit")
	public List<Fruit> show()
	{
		System.out.println("sop");
		logger.info("jsdbn");
		return fser.showinfo();
	}
	

	@GetMapping("getId/{id}")
	public Optional<Fruit> showid(@PathVariable int id)
	{
		return fser.readid(id);
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
	public String add(@RequestBody Fruit fr) 
	{
		return  fser.create(fr);
	}
	
	@PutMapping("update/{id}")
	public Fruit updateId(@PathVariable int id, @RequestBody Fruit fr)
	{
		return fser.updateId(id, fr);
	}
	
	
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id)
	{
		return fser.deleteId(id);
	}
	
	@GetMapping("getquery/{id}")
 	public Optional<Fruit> display(@PathVariable int id)
 	{
 		return fser.readid(id);
 	}
	
	@DeleteMapping("delquery/{id}")
	public String disp(@PathVariable int id)
	{
		return fser.deleteId(id);
	}
	
	@PutMapping("updateq/{id}")
	public Fruit updisp(@PathVariable int id, @RequestBody Fruit fr)
	{
		return fser.updateQuery(id, fr);
	}
	
	
	
}
