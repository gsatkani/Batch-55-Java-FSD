package com.wipro.calculator;

public class CalculatorMain implements Calculator {

	public int addition(int x, int y) {
		return x + y;
	}

	public int subtraction(int x, int y) {

		return x - y;
	}

	public double multipliaction(double x, double y) {
		return x * y;
	}

	public double division(double x, double y) {
		return x / y;
	}

	public static void main(String[] args) {
		CalculatorMain calculator = new CalculatorMain();

		System.out.println(calculator.addition(10, 20));

	}

}
