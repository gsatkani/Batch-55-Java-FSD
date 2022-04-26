package com.wipro.engines;

public class FuelEngine extends Engine {

	private int cc;
	private int cylinders;

	public void showSpecs() {
		engineSpecification();
		System.out.println("CC Engines");
		System.out.println(getCc());
		System.out.println("No of Cyclinders");
		System.out.println(getCylinders());

	}

	public FuelEngine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FuelEngine(int cc, int cylinders) {
		super();
		this.cc = cc;
		this.cylinders = cylinders;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

}
