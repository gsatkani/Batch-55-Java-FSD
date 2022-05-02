package com.wipro.exp;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size = scanner.nextInt();
		String[] marks = new String[size];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark " + (i + 1));
			marks[i] = scanner.next();
		}
		try {
			int sum = 0;
			for (int i = 0; i < marks.length; i++) {
				int no = Integer.parseInt(marks[i]); // Integer.parseInt("abc") - > throw exception
				sum = sum + no;
			}
			System.out.println("Sum of Array " + sum);

		} catch (Exception ex) {
			Exception ex2 = ex;
			String string = ex.toString();
			System.out.println(ex.toString());
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Finally wil be executed always");
			System.out.println("Free Up Resources Closing  Scanner class");
			scanner.close();
		}

	}

}
