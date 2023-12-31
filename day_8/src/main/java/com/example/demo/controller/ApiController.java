package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.BikeService;


@RestController
public class ApiController {

	@Autowired 
	BikeService sser;
	
    @PostMapping("AddDetail")
    public Bike add(@RequestBody Bike ss)
    {
   	 return sser.saveinfo(ss);
    }
    
    @GetMapping("ShowDetails")
    public List<Bike> show()
    {
   	 return sser.showinfo();
    }
    
	
	@GetMapping("/year/{year}")
 	public List<Bike> displayYear(@PathVariable int year)
 	{
 		return sser.getYear(year);
 	}
    @GetMapping("/year/{year}/bikeName/{bike}")
 	public List<Bike> displayYearAndBike(@PathVariable int year,@PathVariable String bike)
 	{
 		return sser.getYearAndBike(year, bike);
 	}
}
