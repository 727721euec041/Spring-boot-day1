package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "_product")
public class Product {
@Id
private int  ide;
private String productname;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "i")
private Order ord;
public Product(Order ord) {
	super();
	this.ord = ord;
}
public Order getOrd() {
	return ord;
}
public void setOrd(Order ord) {
	this.ord = ord;
}
public Product() {
	super();
}
public Product(int ide, String productname) {
	super();
	this.ide = ide;
	this.productname = productname;
}
public int getIde() {
	return ide;
}
public void setId(int ide) {
	this.ide = ide;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}

}
