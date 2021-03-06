package com.wipro.basic;

public class Test {

	public static void main(String[] args) {

		// Binary Op a+b
		// Unary Op a++ ++a -> Increment Operators
		// PreIncrement a++ -> increment a by 1 a=10 a++ -> 11

		int a = 10;
		int c = a++ + 10;
		// 1.c=a+10; c=10+20
		// 2.a=a+1; a=11
		System.out.println(c); // 20
		System.out.println(a); // 11
		System.out.println(a++);// 11
		System.out.println(a); // 12
		System.out.println("------");
		int b = 20;
		int d = ++b + 10;
		// 1.b=b+1 b=21
		// 2.c=b+10 c=21+10=31
		System.out.println(d); // 31
		System.out.println(b); // 21
		System.out.println(++b);// 22
		System.out.println(b); // 22

		do {
			System.out.println("Body of loop will be executed atleat once");
		} while (false);

		for (int i = 0, j = 0; i < 10 || j > 10; i++, j++) {
			//
		}
		switch (2) {
		default:
			System.out.println("default");
		case 1:
			System.out.println("case 1");
			break;

		}

		// ternary operator ? :
		int x = 100, y = 200;
		int res = x > y ? x : y;
		// 100>200 -> y=200
		// 200>100 -> x=200
		System.out.println(res);
		String res1 = x > y ? x + " is Greater" : y + " is Greater";
		System.out.println(res1);

	}

}
