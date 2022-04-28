package com.wipro.apriltwentyeight;

public class EnumMain {
	
	public static void main(String[] args) {
		
		switch (Color.GREEN) {
		case GREEN:
			System.out.println("You Have Selected Green");
			break;
         
		case RED:
			System.out.println("You Have Selected Red");
			break;
        
		case BLUE:
			System.out.println("You Have Selected Blue");
			break;
        // Take a Break 15 mins
		default:
			break;
		}
		
	}

}
