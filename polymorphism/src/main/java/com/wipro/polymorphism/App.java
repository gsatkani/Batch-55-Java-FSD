package com.wipro.polymorphism;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        Stall stall=new Stall();
        System.out.println("Enter Stall Name");
        stall.setName(scanner.nextLine());
        System.out.println("Enter Stall Detail");
        stall.setDetail(scanner.nextLine());
        System.out.println("Enter Owner Name");
        stall.setOwner(scanner.nextLine());
        System.out.println("enter stall type");
        String type=scanner.nextLine();
        System.out.println("enter square feet");
        int sqfeet=scanner.nextInt();
        System.out.println("Do you need to add TV yes or no");
        if(scanner.next().equalsIgnoreCase("yes")) {
             System.out.println("Enter number of tv");
             int noOfTv=scanner.nextInt();
             double cost = stall.calculateCost(type, sqfeet, noOfTv);
             System.out.println("Totat Cost " + cost);
        }
        else {
        	double cost=stall.calculateCost(type, sqfeet);
        	System.out.println("Ttotal Cost " + cost);
        }
        
        
    }
}
