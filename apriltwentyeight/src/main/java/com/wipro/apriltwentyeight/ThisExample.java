package com.wipro.apriltwentyeight;

public class ThisExample {
	String company;
	public ThisExample() {
	}
	public ThisExample(String company) {
		super();
		this.company = company;
	}
	void displayCompany(String company) {
		int x = 100;
		// System.out.println(this.x);
		System.out.println(company); //
		System.out.println(this.company); // this keyword always refer to current instance

		// this() - constructor chaining
	}
	public static void main(String[] args) {

		ThisExample obj = new ThisExample();
		obj.company = "Stackroute";
		obj.displayCompany("Wipro");

	}

}
