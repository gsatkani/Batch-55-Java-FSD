package com.jap.furniture;

public class Bookshelf extends Furniture {
	// specify attributes for BookShelf
	int noOfRacks;
  
	// define constructors, ensure the super keyword is used
	public Bookshelf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookshelf(int noOfRacks) {
		super();
		this.noOfRacks = noOfRacks;
	}

	public int getNoOfRacks() {
		return noOfRacks;
	}

	public void setNoOfRacks(int noOfRacks) {
		this.noOfRacks = noOfRacks;
	}

	

}