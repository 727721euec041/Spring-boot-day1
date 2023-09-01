package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "_cart")
public class Cart {
@Id
private int iden;

public Cart() {
	super();
}

public Cart(int iden) {
	super();
	this.iden = iden;
}

public int getIden() {
	return iden;
}

public void setIden(int iden) {
	this.iden = iden;
}

}
