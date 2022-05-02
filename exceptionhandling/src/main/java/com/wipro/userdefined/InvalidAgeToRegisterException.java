package com.wipro.userdefined;

public class InvalidAgeToRegisterException  extends Exception{
   
	
	// User Defined Exception 
	// Step 1 :  extends Exception Class
	// Step 2 :  create constructor
	// Step 3 : pass messge to super class
	public InvalidAgeToRegisterException(String message) {
		super(message);
	}
}
