package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "employeetable")
public class Employeeentity {
	@Id
	@GeneratedValue
private int id;
	
private String name;
private int age;
private long salary;
public Employeeentity() {
	super();
}
public Employeeentity(int id, String name, int age, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
}
