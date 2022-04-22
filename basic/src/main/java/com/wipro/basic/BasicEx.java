package com.wipro.basic;

import java.util.*;

// Variable - 1. Instance 2.Class/Static 3.Local 
// Datatype - Eight Primitive Datatype
public class BasicEx {

	public static void main(String[] xyz) {
		
		// Local - Variable declared inside the method or block {}
		byte age=18; //1 -100 1 byte
		short salary=30000; // 2 byte
		int pincode=635112; // 4 byte
		long phone=9566259956l; // 8 byte
		int age2=18; // 4 byte / 1 byte - 3 byte waste
		 
		float cgpa=7.8f; // 4 byte
		double amount=12345.67; // 8 byte
		  
		boolean status=true; // 1 bit
		char dept ='D';  // 2 byte
		
		System.out.println(10+20);  //30
		System.out.println("ABC" + 10 + 20); //ABC1020
		System.out.println(10 + 20+ "ABC"); // 30ABC
		
		System.out.println(age + "\n" + salary +"\n"+ pincode+"--"+ age2+"--"+ cgpa+"--"+amount+"--"+ status+"--"+ dept +"--"+ phone);
	    System.out.println("--------------------------------------------");
	    
	    // Arithmetic Operator  % Modulo Operator  10%6 - > 4 Remainder  10%2 == 0 
	    Scanner scan=new Scanner(System.in);
	    int no=scan.nextInt();
	    if(no%2==0) {
	    	System.out.println(no + " is Even");
	    }
	    else {
	    	System.out.println(no + " is Odd");
	    }
	    // Relational Operator
	    if(no>0) {
	    	System.out.println(no + " is Positive");
	    }
	    else if(no<0) {
	    	System.out.println(no + " is Negative");
	    }
	    else if(no==0) {
	    	System.out.println(no + " is Zero");
	    }
	    
	    // ASCII Values (Decimal Numbers)  ->  Binary Numbers
	    System.out.println("Enter a Charcter");
	    char str= scan.next().charAt(0);  
	    // Logial Operator
	    if(str>='A' && str<='Z') {    // 65>=65 && 65<=90
	    	System.out.println(str + " is UpperCase");
	    }
	    else if(str>='a' && str<='z') {
	    	System.out.println(str + " is LowerCase");
	    }
	    else {
	    	System.out.println(str + " is Not Character");
	    }
	    // convert uppercase to lowercase
	    System.out.println(str+32); // 65+32==>97
	    System.out.println((char)(str+32)); // a
	    // greatest among two numbers
	    // Swapping two numbers     
		
	}
	
}
