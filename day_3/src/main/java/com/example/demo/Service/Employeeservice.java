package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employeeentity;
import com.example.demo.Repository.Employeerepo;

@Service
public class Employeeservice {
	@Autowired
Employeerepo er;
public Employeeentity saveinfo(Employeeentity  ee) {
	return er.save(ee);
}
public List<Employeeentity> showinfo()
{
	return er.findAll();
}
}
