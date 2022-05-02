package com.wipro.exceptionhandling;

public class StringBufferBuilder {

	public static void main(String[] args) {

		String company = "Wipro"; // Immutable Class
		company.concat("Technlogies");
		System.out.println(company);

		// StringBuffer and StringBuilder Mutable Class
		StringBuffer buffer = new StringBuffer("Stacktoute");

		buffer.append(" Technolgies");
		System.out.println(buffer);

		char charAt = buffer.charAt(0);
		System.out.println(charAt);

		buffer.delete(0, 3);
		System.out.println(buffer);
		
		//Object is root class for entire java objets
		//Class Object is the root of the class hierarchy. 
		//Every class has Object as a superclass
		
		Object object=new Object();
		object=11;
		object="Sathish g";
		
		// to find two objects are equal  => override equals method

	}

}
