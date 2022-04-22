package com.wipro.oopsex;

// class and object / methods
public class Mobile {
	// Instance Variable - declared inside the class and outside any method
	// state or data
	String model;
	String brand;
	int ram;
	double price;
	String processor;
	// Behavior - Instance Method
	public void communication() {
		System.out.println("Used for Communication");
	}
	public void entertainment() {
		System.out.println("Social Media App");
	}
	public void displayMobileDetails() {
		System.out.println(model + "--" + brand + "--" + ram + "--" + price + "--" + processor);
	}
	// Entry point for Java Program - JVM(Java Virtual Machine)
	public static void main(String[] xyz) {
		// Create an Object for Mobile Class
		Mobile samsung = new Mobile();
		samsung.model = "Abc";
		samsung.brand = "Def";
		samsung.price = 23345.67;
		samsung.ram = 3;
		samsung.processor = "Quad Core";
		samsung.communication();
		samsung.entertainment();
		samsung.displayMobileDetails();
		Mobile mi=new Mobile();

	}

}
