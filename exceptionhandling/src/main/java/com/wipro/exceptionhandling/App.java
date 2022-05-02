package com.wipro.exceptionhandling;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Java Regular Expression
		boolean str1 = "d".matches("[abc]"); // a b c
		// d in (a,b,c)
		System.out.println(str1);
		// check string - lower
		String company = "wipro";
		boolean matches = company.matches("[a-z]*");
		if (matches) {
			System.out.println("lowercase");
		}
		boolean matches2 = company.matches("[A-Z]*");
		if (matches2) {
			System.out.println("String is in UpperCase");
		}
		String phone = "9566259956";
		boolean matches3 = phone.matches("[0-9]*");
		if (matches3) {
			System.out.println("String contains only digit");
		}
		// Atlest OneUpper Lower Digit
		// [a-zA-Z0-9]+ // + one or more // * zero or more
		String password = "GSAT115";
		boolean flag=true;
		if(!password.matches(".*[a-z]+.*")) {  // !(false) - true
			System.out.println("It must contain one lowercase");
			flag=false;
		}
		else if(!password.matches("[.*[A-Z]+.*]")) {
			System.out.println("It must contain one upper case");
			flag=false;
		}
		else if(!password.matches(".*[0-9]+*")) {
			System.out.println("It must containd one digit");
			flag=false;
		}
		
		if(flag) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is  InValid");
		}
		
		
		String mobile ="8866353442";
		if(mobile.matches("[9 | 8]+{2}[0-9]{8}")) {
			System.out.println("Valid Phone Numbers");
		}
		else {
			System.out.println("Invalid Phone Number");
		}
		
		String idCard="WIP-sat-115";
		if(idCard.matches("[A-Z]{3}-[a-z]{3}-[0-9]{3}")) {
			System.out.println("Valid Id Card");
			
		}
		else {
			System.out.println("Invalid IdCard");
		}
		
		
		// Phone number validation
		// starts with 9/8/7 
		// it contains only 10 digits
		
		// [+][987]{1}[0-9]{9}
		
		// Id Card Validation   AAA{3}-bbb{3}-111{3}
		
		
		
		// it contains either upper or lower or digit
		boolean matches4 = password.matches("[a-zA-Z0-9]+");
		if (matches4) {
			System.out.println("Password is Valid ");
		} else {
			System.out.println("Password is Invalid");
		}

	}
}
