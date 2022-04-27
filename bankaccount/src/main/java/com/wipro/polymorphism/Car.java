package com.wipro.polymorphism;

public class Car extends Vechile {
	String fuelType;
    //1.Same Method signature
	//2 Same return type / method name / same number of parameter /datatype
	@Override
	public void specification() {
		super.specification();
		System.out.println("Fuel Type" + fuelType);
	}

	public static void main(String[] args) {
		Car baleno = new Car();
		baleno.model = "Delta 1.4";
		baleno.companyName = "Maruti Suzuki";
		baleno.fuelType = "Petrol";

		baleno.specification();
		
		// Try the practice problem statement / for doubts @9.30pm

	}
}
