package com.wipro.employee;

public class Employee {
	// Encapsulation - implemented by Access Modifiers public private protected
	// default
	public int id;
	public String name;
	private double salary;
	private long phone;
	// special member function
	// JVM automatically create constructor - System.out.println("Default Constructor");
	public Employee() {
     	this.id = 101;
		this.name = "Siva";
		this.salary = 25000;
		this.phone = 976543311;
	}
	// Parameterized Constructor
	public Employee(int id, String name, double salary, long phone) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.phone=phone;
	}
    // Behavior - Display Employee Details
	public void displayEmployeeDetails() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
		System.out.println("Phone " + phone);
		
	}
	
	
	//// Access private Data Members -> generate getter and setter methods

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
