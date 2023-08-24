package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employeeentity;
import com.example.demo.Service.Employeeservice;

@RestController
public class Employeecontroller {
Employeeservice esr;
@PostMapping("adde")
public Employeeentity add(@RequestBody Employeeentity ee)
{
	return esr.saveinfo(ee);
			}
@GetMapping("employee")
public List<Employeeentity> show()
{
	return esr.showinfo();
}
}
