package com.jap.furniture;

public interface IFurniture {
    // define the discount percentage for various furniture types
	double office=0.1;  // static final
	double home=0.05;
	double garden=0.025	;
	
	double calculateDiscountedPrice();
	void displayFurnitureDetails();
    // define common methods like calculateDiscountedPrice and display furniture details

}
