package com.wipro.filehandling;

public class Employee {

	int id;
	String name;
	double salary;
	String company;
	String city;

	public Employee() {
		super();

	}

	public Employee(int id, String name, double salary, String company, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
		this.city = city;
	}

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + ", city="
				+ city + "]";
	}

}
