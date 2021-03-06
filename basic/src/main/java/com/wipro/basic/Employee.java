package com.wipro.basic;
// Template or blueprint to create the object 
public class Employee {
	// Instance Variable
	String empName; // 4 byte
	// Used for Memory Management
	//static or class variable
	static String company="Wipro"; // 4 byte
	
	//static or class method
	public static void dispalyCompany() {
		// Static method allows only static variable / local variable
		System.out.println(company);
		//System.out.println(empName); its instance variable show error
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee();  // 8 bytes
		emp1.empName="Abc";
		System.out.println(emp1.empName);
		// Access the static Variable - className.StaticVariableName
		System.out.println(Employee.company);
		// Access the static method - className.StaticMethodName
		Employee.dispalyCompany();
		Employee emp2=new Employee(); // 8 bytes
		emp2.empName="Def";
		emp2.company="Wipro";
		
		// 40 -> 160  / 160  => 320 bytes
		// 40 -> 160 / 4 => 164 bytes
		
		
	}
	
	

}
