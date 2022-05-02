package com.wipro.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeMain {
	static BufferedReader reader;
	static FileReader fileReader;
	// Give information to compiler ,this method will throws FileNotFoundException,IOException
	public int countNumberOfLines() throws FileNotFoundException, IOException {
		fileReader = new FileReader("employee.csv");
		reader = new BufferedReader(fileReader);
		int noOfLines = 0;    	String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			noOfLines++;
		}
		fileReader.close();
		reader.close();
		return noOfLines;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		EmployeeMain employeeMain = new EmployeeMain();
		int size = employeeMain.countNumberOfLines();
		System.out.println("No of Employees" + size);
		Employee[] employeeList = new Employee[size];
		fileReader = new FileReader("employee.csv");
		reader = new BufferedReader(fileReader);
		String line = "";  	int index = 0;
		while ((line = reader.readLine()) != null) {
			String[] split = line.split(","); // split[0]=101 split[1]=name split[2]=salary
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(split[0]));
			employee.setName(split[1]);
			employee.setSalary(Double.parseDouble(split[2]));
			employee.setCompany(split[3]);
			employee.setCity(split[4]);
			// System.out.println(employee.toString());
			employeeList[index] = employee;
			index++;
		}
		System.out.println("Employee Details");
		for (Employee employee : employeeList) {
			System.out.println("Id " + employee.getId() + " Name " + employee.getName());
		}
		fileReader.close();
		reader.close();

	}

}
