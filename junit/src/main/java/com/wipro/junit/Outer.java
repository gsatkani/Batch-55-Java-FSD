package com.wipro.junit;
public class Outer {
	public int a = 100;
	public static int d = 300;
	// Nested Class
	public class Inner {
		public int b = 200;

		public void addition() {
			System.out.println(a + b);
		}
	}
	static class InnerStatic {
		public int c = 300;

		public void subatraction() {
			System.out.println(d + c);
			// System.out.println(a + c);
		}
	}
	public static void main(String[] args) {
		// Create an Object for inner class
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.addition();
		// Create an Object for static inner class
		Outer.InnerStatic inner2 = new Outer.InnerStatic();
		inner2.subatraction();
	}
}
