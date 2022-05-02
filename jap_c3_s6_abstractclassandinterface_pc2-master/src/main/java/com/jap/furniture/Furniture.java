package com.jap.furniture;

public class Furniture {
	// declare color, price, discounted price and furniture type as variables
	String color;
	double price;
	double discountPrice;
	FurnitureType furnitureType;
	
	public void displayFurniture() {
		System.out.println("Color  " + getColor());
		System.out.println("Price  " + getPrice());
		System.out.println("Discounted Price  " + getDiscountPrice());
		System.out.println("Furniture Type  " + getFurnitureType());
	}
	public Furniture() {
		super();
	}
	
	public Furniture(String color, double price, double discountPrice, FurnitureType furnitureType) {
		super();
		this.color = color;
		this.price = price;
		this.discountPrice = discountPrice;
		this.furnitureType = furnitureType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public FurnitureType getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(FurnitureType furnitureType) {
		this.furnitureType = furnitureType;
	}

}