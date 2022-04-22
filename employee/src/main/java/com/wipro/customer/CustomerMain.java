package com.wipro.customer;

import java.util.Scanner;

public class CustomerMain {

	private static Scanner scanner;

	public static void main(String[] args) {

		// Parameterized Constructor
		Address address = new Address(115, "Anna Nagar", "Krishnagiri", 635112);
		Customer customer = new Customer(101, "Karthick", 988224222, address);
		customer.displayCustomerDetails();

		scanner = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.println("Enter the Id");
		cust.setId(scanner.nextInt());
		System.out.println("Enter the Name");
		cust.setName(scanner.next());
		System.out.println("Enter the Phone");
		cust.setPhone(scanner.nextLong());

		Address home = new Address();
		System.out.println("Enter HouseNo");
		home.setHouseNo(scanner.nextInt());
		System.out.println("Enter Street Name");
		home.setStreetName(scanner.next());
		System.out.println("Enter City");
		home.setCity(scanner.next());
		System.out.println("Enter Pincode");
		home.setPincode(scanner.nextInt());

		cust.setHomeAddress(home);
		cust.displayCustomerDetails();
		// Practice Take 30 Mins Break 

	}

}
