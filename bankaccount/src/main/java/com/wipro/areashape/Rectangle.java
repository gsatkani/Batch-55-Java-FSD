package com.wipro.areashape;

public class Rectangle implements Shape {

	double length;
	double bredth;

	public double calculateArea() {

		return length * bredth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}

}
