package com.jap.furniture;

public class FurnitureDemo
    {
        public static void main(String[] args)
        {
            // Declare Objects for the furniture Bookshelf, Table and Sofa
        	Sofa sofa=new Sofa();
        	sofa.setColor("Red");
        	sofa.setNoOfSeaters(3);
        	sofa.setFurnitureType(FurnitureType.OFFICE);
        	sofa.setPrice(10000);
        	
        	System.out.println("Sofa Details Before Discount");
        	sofa.displayFurnitureDetails();
        	
        	double discountedPrice = sofa.calculateDiscountedPrice();
        	sofa.setDiscountPrice(discountedPrice);
        	
        	System.out.println("Sofa Details After Discount");
        	sofa.displayFurnitureDetails();
        	
        	// Take 30 Mins to completed  @10.50am
        	
        	
            // Ensure that the super type refers to the sub classes
            // Display the details of each of them
        }
    }