package com.wipro.calculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calc=new Calculator();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter First");
        calc.first=scanner.nextInt();
        System.out.println("Enter Second");
        calc.second=scanner.nextInt();
        System.out.println("Press 1.Addition 2.Division 5.Exit");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:
        	int result=calc.addition(calc.first, calc.second);
        	System.out.println("Additon  "+ result);
        	break; // Terminate the block
        case 2: 
        	System.out.println("Division " + calc.division(calc.first, calc.second));
        	break;
        default:
        	System.out.println("Thank you");
        	break;
        }
        
    }
}
