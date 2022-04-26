package com.wipro.abexample;

public class StateGovt extends Shape  {

	@Override
	public void mask() {
		System.out.println("Mask");
	}

	@Override
	public void socialDistance() {
		System.out.println("Follow Scoial Distance");
   }
	
	public static void main(String[] args) {
		// cannot create object for abstract class
		//Covid govt=new Covid();
		StateGovt govt=new StateGovt();
    	govt.mask();
		govt.socialDistance();
		govt.vaccine();
		
	}

	@Override
	public double calcualtePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
