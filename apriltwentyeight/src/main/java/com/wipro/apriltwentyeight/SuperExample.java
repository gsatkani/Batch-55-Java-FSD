package com.wipro.apriltwentyeight;
class A {
   String company ="Wipro";
   public A() {
		super();
		System.out.println("A");
		System.out.println(company); // Wipro
	}
}
class B extends A {
	String company="Stackroute";
	public B() {
		super(); // first statement in a constructor
		System.out.println("B");
		System.out.println(super.company); // Wipro
		System.out.println(company);       // Stackroute
	}
}
public class SuperExample extends B {
	String company="IBM";
	public SuperExample() {
		super(); // it will call Super class constructor
		System.out.println("C");
		System.out.println(super.company); // Stackroute
		System.out.println(company);       // IBM
	}
	public static void main(String[] args) {
		SuperExample obj=new SuperExample();  // BAC 
	}

}
