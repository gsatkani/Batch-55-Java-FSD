package com.wipro.oopsex;

import java.util.Scanner;

// class ->  template or blueprint to create the object
public class Calculator {
	// Instance variable
	public int first;
	public int second;

	// Instance method
	public int addition(int x, int y) {
		int result = x + y;
		return result;
	}

	public int subtraction(int x, int y) {
		return x - y;
	}

	public double multiplication(double x, double y) {
		return x * y;
	}

	public double division(int x, int y) {
		return x / y; // 10/3 == 3.33
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Predefined Class
		Calculator calc = new Calculator(); // User Defined Class
		System.out.println("Enter First");
		calc.first = scanner.nextInt();
		System.out.println("Enter Second");
		calc.second = scanner.nextInt();
		String str = "";
		do {
			System.out.println("Press\n1.Addition\n2.Subtraction \n5.Exit");
			int choice = scanner.nextInt(); // 1
    		switch (choice) { // choice = 1
			case 1: // Match case constant choice =1
				int x = calc.addition(calc.first, calc.second); // x=40
				System.out.println("Addtiion " + x);
				break;// terminate the loop and block { }
			case 2:
				int y = calc.subtraction(calc.first, calc.second);
				System.out.println("Subtraction " + y);
				break;
			default:
				System.out.println("Enter the Correct Option");
				// System.exit(0);
				break;
			}
			System.out.println("Do you want to continue press y");
			str = scanner.next();
		} while (str.equals("y"));

	}

}
