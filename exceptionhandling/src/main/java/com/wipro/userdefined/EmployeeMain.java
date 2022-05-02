package com.wipro.userdefined;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Employee");
		int[] num=new int[5];
		Employee[] employeeList = new Employee[scanner.nextInt()];
		System.out.println("Enter Employee Details");
		for (int i = 0; i < employeeList.length; i++) {
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter Id");
			String id = scanner.nextLine();
			
			int a=scanner.nextInt();
			num[i]=a;
			
			Employee emp=new Employee(name, id);
			employeeList[i] = emp;
		}
		System.out.println("Enter Employee ID to Seach");
		String key = scanner.nextLine();
		boolean flag = false;
		try {
			// Search in an array
			for (Employee employee : employeeList) {
				if (key.equals(employee.getId())) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Employee id:" + key + " is found");
			} else {
				throw new EmployeeNotFoundException("Employee id:" + key + " is not found");
			}

		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
      // Complete Problem connect @8.00pm
	}

}
