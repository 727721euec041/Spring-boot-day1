package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruit_details")
public class Fruit {
	@Id
	@Column(name = "id")
private int id;
	private String phone;
	private String message;
private String fruitname;
private String price;
private String edate;
private int quantity;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id")
private Product identity;
public Fruit() {
	super();
}
public Fruit(int id, String phone, String message, String fruitname, String price, String edate, int quantity,
		Product identity) {
	super();
	this.id = id;
	this.phone = phone;
	this.message = message;
	this.fruitname = fruitname;
	this.price = price;
	this.edate = edate;
	this.quantity = quantity;
	this.identity = identity;
}
public Product getIdentity() {
	return identity;
}
public void setIdentity(Product identity) {
	this.identity = identity;
}
//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//@JoinColumn(name = "order_id", referencedColumnName = "id")
//private List<Product> products;

public Fruit(int id, String phone, String message, String fruitname, String price, String edate, int quantity) {
	super();
	this.id = id;
	this.phone = phone;
	this.message = message;
	this.fruitname = fruitname;
	this.price = price;
	this.edate = edate;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getFruitname() {
	return fruitname;
}
public void setFruitname(String fruitname) {
	this.fruitname = fruitname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getEdate() {
	return edate;
}
public void setEdate(String edate) {
	this.edate = edate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
