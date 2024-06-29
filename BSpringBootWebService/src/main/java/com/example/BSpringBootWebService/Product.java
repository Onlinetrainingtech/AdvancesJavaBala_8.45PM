package com.example.BSpringBootWebService;

public class Product 
{
   private int id;
   private String name;
   private String batchno;
   private double price;
   private int noofproduct;
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
public String getBatchno() {
	return batchno;
}
public void setBatchno(String batchno) {
	this.batchno = batchno;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNoofproduct() {
	return noofproduct;
}
public void setNoofproduct(int noofproduct) {
	this.noofproduct = noofproduct;
}
public Product(int id, String name, String batchno, double price, int noofproduct) {
	super();
	this.id = id;
	this.name = name;
	this.batchno = batchno;
	this.price = price;
	this.noofproduct = noofproduct;
}
public Product() {
	
}
   
   
}
