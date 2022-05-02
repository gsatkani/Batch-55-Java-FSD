package com.jap.furniture;

public class AppMain {

	public static void main(String[] args) {
		
		Technology java = Technology.JAVA;
		
		System.out.println(java);
		
		switch (java) {
		case JAVA:
			System.out.println("Welcome to Java");
			break;
			
		case CSHARP:
			System.out.println("Welcome to Csharp");
			break;
			
		case PYTHON:
			System.out.println("Welcome to PYthon");
			break;

		default:
			break;
		}
		
		
	}
	
}
