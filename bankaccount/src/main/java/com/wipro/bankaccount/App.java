package com.wipro.bankaccount;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner;
    public static void main( String[] args )
    {
        System.out.println( "Press \n1.Saving\n 2.Current\n3.Exit");
        scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:
        	SavingAccount account=new SavingAccount();
        	System.out.println("Enter Account type");
        	account.setAccName(scanner.next());
        	System.out.println("Enter Account number");
        	account.setAccNo(scanner.next());
        	System.out.println("Enter Bank Name");
        	account.setBankName(scanner.next());
        	System.out.println("Enter Minimum Balance");
        	account.setMinBalance(scanner.nextInt());
        	
        	account.display();
        	
        	break;
        	// Try Case 2
        default:
        	System.out.println("Thank you");
        	break;
        }
    }
}
