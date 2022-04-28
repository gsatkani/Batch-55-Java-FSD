package com.wipro.polymorphism;

public class Addition {
	//1.Same Method Name
	//2.Different number of parameter
	//3.Same number of parameters -> datatype of parameter should differ
	
	public int addition(int x,int y) { // 2
		return x+y;
	}
	

	public int addition (int x,int y,int z) { // 3 
		return x+y+z;
	}
	
	public double addition(int x,double y) { // 
		return x+y;
	}
	
	public double addition(double x,double y) {
		return x+y;
	}

}
