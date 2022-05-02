package com.jap.furniture;

public class Sofa extends Furniture implements IFurniture {
	// Specify attributes for Sofa
	int noOfSeaters;

	@Override
	public double calculateDiscountedPrice() {
		double discountPrice=0.0;
		
		if(getFurnitureType().equals(FurnitureType.HOME)) {
			discountPrice=getPrice() - (getPrice()*(home));	
		}
		
		else if(getFurnitureType().equals(FurnitureType.OFFICE)) {
			discountPrice=getPrice() - (getPrice()*(office));
		}
		
		else if(getFurnitureType().equals(FurnitureType.GARDEN)) {
			discountPrice=getPrice() - (getPrice()*(office));
		}
		return discountPrice;
	}

	@Override
	public void displayFurnitureDetails() {
		displayFurniture();
		System.out.println("No Of Seaters " + getNoOfSeaters());

	}

	public Sofa() {
		super();
	}

	public Sofa(int noOfSeaters) {
		super();
		this.noOfSeaters = noOfSeaters;
	}

	public int getNoOfSeaters() {
		return noOfSeaters;
	}

	public void setNoOfSeaters(int noOfSeaters) {
		this.noOfSeaters = noOfSeaters;
	}

}