package com.example.demo.model;

import jakarta.persistence.*;

@Entity

public class UserModel {
@Id
	private int id;
private String sname;
private String studentDept;
private String email;
public UserModel() {
	super();
}
public UserModel(int id, String sname, String studentDept, String email) {
	super();
	this.id = id;
	this.sname = sname;
	this.studentDept = studentDept;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getStudentDept() {
	return studentDept;
}
public void setStudentDept(String studentDept) {
	this.studentDept = studentDept;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	
}
