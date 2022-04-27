package com.wipro.areashape;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Rectangle rectangle = new Rectangle();
			System.out.println("Enter Length");
			rectangle.setLength(scanner.nextDouble());
			System.out.println("Enter Bredth");
			rectangle.setBredth(scanner.nextDouble());

			double area = rectangle.calculateArea();
			System.out.println("Area of Rectangle " + area);

			break;
		// case 2 case 3
		default:
			System.out.println("Thank you");
			break;
		}

	}
}
