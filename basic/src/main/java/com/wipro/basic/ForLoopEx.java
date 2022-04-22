package com.wipro.basic;

public class ForLoopEx {

	public static void main(String[] args) {

		// Print 1 -10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// Print Sum of first 10 natural numbers
		// 1*2*3*4*...10
		int sum = 0;
		int mul = 1;
		for (int i = 1; i <= 10; i++) {
			// 0+1
			sum = sum + i;
			mul = mul * i;
		}
		System.out.println("Sum " + sum);
		System.out.println("Multiply " + mul);
		int evenSum=0,oddSum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}
			else {
				oddSum=oddSum+i;
			}
		}
		System.out.println("Even Sum " + evenSum + " Odd Sum " + oddSum);
		
		for(int i=1;i<=10;i=i+2) {
			
		}
		// 5!  1*2*3*4*5
		// While syntax
		// Sum of digits / reveres digits
		// Take Break 3.30pm
	}

}
