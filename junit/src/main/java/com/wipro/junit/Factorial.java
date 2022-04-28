package com.wipro.junit;

public class Factorial {

	public int calculateFactorial(int no) {
		if (no < 0) {
			return -1;
		}
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}

		return fact;

	}

	public int addition(int x, int y) {
		return x + y;
	}

}
