package com.wipro.basic;

public class WhileEx {
	public static void main(String[] args) {
		// Sum of digits 456 = 4+5+6
		int number = 456;
		int temp = number;
		int sumOfDigits = 0;
		while (temp > 0) { // 456>0 true
			int remainder = temp % 10; // r=456%10 =6
			sumOfDigits = sumOfDigits + remainder; // sum=0+6=6
			temp = temp / 10; // temp/=10 temp=45
		}
		System.out.println("Sum of Digits " + sumOfDigits);
		System.out.println("----------------");
		temp = number;
		int reverse = 0;
		while (temp > 0) {
			int remmainder = temp % 10;
			reverse = reverse * 10 + remmainder;
			temp /= 10;
		}
		System.out.println("Reverse Digit " + reverse);
		if(number==reverse) {
			System.out.println(number + " is Palindrome");
		}
		else {
			System.out.println(number + " is Not Palindrome");
		}
		
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 ==> Armstrong Number
		// 789 = 7^1 + 8^2 + 9^3  --  count number of digits - Math.pow()
		// fibonacci (swap the numbers)
		// prime or not
	}
}
