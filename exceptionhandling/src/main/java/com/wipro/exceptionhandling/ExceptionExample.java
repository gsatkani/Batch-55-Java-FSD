package com.wipro.exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = 100, b = 0;
		System.out.println("----ArithmeticException----");
		try {
			// throw the Exception
			int c = a / b;
			System.out.println("Result " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Divide By Zero is not possible");
		}
		System.out.println("----ArrayIndexOutOfBoundsException----");
		try {
			double[] cgpa = new double[] { 7.8, 9.8, 6.7, 8.9 }; // 0 1 2 3
			System.out.println(cgpa[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Check Index Value");
		}
		System.out.println("--- NullPointerException---");

		try {
			String company = null;
			System.out.println(company.toLowerCase());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--- NumberFormatException---");
		String no = "123abc";
		try {
			Integer value = Integer.parseInt(no);
			System.out.println(value);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage() + " Give Valid Input");
		}
		System.out.println("Exception Handling");

	}

}
