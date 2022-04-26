package com.wipro.engines;

public class ElectricEngine extends Engine {

	String currentType;
	String voltage;

	public void showSpecs() {
		
		engineSpecification();
		
		System.out.println("Current Type");
		System.out.println(getCurrentType());
		System.out.println("Voltage");
		System.out.println(getVoltage());

	}

	public ElectricEngine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricEngine(String currentType, String voltage) {
		super();
		this.currentType = currentType;
		this.voltage = voltage;
	}

	public String getCurrentType() {
		return currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

}
