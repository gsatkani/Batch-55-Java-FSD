package com.jap.furniture;

public class Table extends Furniture {
	// specify attributes for Table
	int length;
	int width;
	int height;

	// define constructors, ensure the super keyword is used
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Table(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
