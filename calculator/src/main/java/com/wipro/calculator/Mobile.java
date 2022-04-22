package com.wipro.calculator;

// Class - 
public class Mobile {
	// Instance Variable - Declared inside class and outside any method
	// State
	String model;
	String brand;
	int ram;
	double price;
	int storage;
    // Instance Method  	// Behavior
	public void communication() {
		System.out.println("Used for Communication");
	}
	public void entertainment() {
		System.out.println("Used for Entertainment");
	}
	public void displayMobileDetails() {
		System.out.println(model + "-- " + brand);
	}
	public static void main(String[] args ) {
		Mobile samsung=new Mobile(); // Create a object for Mobile class
		samsung.model="ABC";
		samsung.brand="Samsung";
		samsung.ram=8;
		samsung.price=34000.50;
		samsung.storage=32;
		samsung.communication();
		samsung.entertainment();
		samsung.displayMobileDetails();
		
		Mobile htc=new Mobile();
		
	}

}
