package com.wipro.userdefined;

import java.util.Scanner;

public class EventRegistration {
	
	String name;
	int age;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		EventRegistration std1=new EventRegistration();
		std1.name=scanner.nextLine();
		std1.age=scanner.nextInt();
		try {
			if(std1.age<18) {
				throw new InvalidAgeToRegisterException("Age shoud be above 18 to register");
			}
			System.out.println("Welcome "+std1.name  +" Registered Sucessfully");
			
		}catch (InvalidAgeToRegisterException e) {
		    System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you for coming");
			scanner.close();
		}
				
		
		
		
	}
	
	

}
