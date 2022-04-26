package com.wipro.engines;

// Super Class 
public class Engine {

	private String model; // getModel()
	private String engineType; // getEngineType
	private int power;
	private int rpm;
	private int torque;
	private int weight;
	
	public void engineSpecification() {
		System.out.println("Types of Engines");
		System.out.println(getEngineType());
		System.out.println("Power Source");
		System.out.println(getEngineType());
		System.out.println("Model Number");
		System.out.println(getModel());
	}
	

	public Engine() {

	}

	public Engine(String model, int power, int rpm, int torque, int weight, String type) {
		this.model = model;
		this.power = power;
		this.rpm = rpm;
		this.torque = torque;
		this.weight = weight;
		this.engineType = type;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
