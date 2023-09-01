package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.*;
@Entity
@Table(name = "_order")
public class Order {
@Id
private int i;
private int ordernumber;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "iden")
private List<Cart> orde;
public Order(int i, int ordernumber, List<Cart> orde) {
	super();
	this.i = i;
	this.ordernumber = ordernumber;
	this.orde = orde;
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public List<Cart> getOrde() {
	return orde;
}
public void setOrde(List<Cart> orde) {
	this.orde = orde;
}
public int getId() {
	return i;
}
public void setId(int i) {
	this.i = i;
}
public int getOrdernumber() {
	return ordernumber;
}
public void setOrdernumber(int ordernumber) {
	this.ordernumber = ordernumber;
}
public Order() {
	super();
}
public Order(int i, int ordernumber) {
	super();
	this.i = i;
	this.ordernumber = ordernumber;
}
}
