package com.wipro.inheritence;

// Inherit the variables method from Laptop Class
public class Dell extends Laptop{

	public String model;
	public String processor;

	public void dellDetails() {
		laptopDetails();
		//System.out.println(ram);
		System.out.println(model);
		System.out.println(processor);
	}
	public static void main(String[] args) {
		
		Dell latitude=new Dell();
		latitude.brand="Dell Latitude";
		latitude.ram=8;
		latitude.price=34000;
		latitude.memory=512;
		latitude.model="3340";
		latitude.processor="I7";
		latitude.dellDetails();
		Laptop laptop=new Laptop();
		//laptop.model="21212";
		
	}
	
}
