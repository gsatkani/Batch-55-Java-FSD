package com.wipro.polymorphism;

public class Main {

	public static void main(String[] args) {

		Addition calc = new Addition();
		System.out.println(calc.addition(10, 10));
		System.out.println(calc.addition(10, 10, 10));

		System.out.println(calc.addition(10, 20.20));

		System.out.println(calc.addition(10.10, 20.20));

	}

}
