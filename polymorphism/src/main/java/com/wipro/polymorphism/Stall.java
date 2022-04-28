package com.wipro.polymorphism;
public class Stall {
	String name;
	String detail;
	String owner;
	public double calculateCost(String type, int squarefeet) {
		if (type.equalsIgnoreCase("platinum")) {
			return 300 * squarefeet;
		} else if (type.equalsIgnoreCase("diamond")) {
			return 200 * squarefeet;
		} else if (type.equalsIgnoreCase("gold")) {
			return 100 * squarefeet;
		}
		return 0.0;
	}
	public double calculateCost(String type, int sqfeet, int noOfTv) {
		double totalCost = 0.0;
		if (type.equalsIgnoreCase("platinum")) {
			totalCost = 300 * sqfeet;
		} else if (type.equalsIgnoreCase("diamond")) {
			totalCost = 200 * sqfeet;
		} else if (type.equalsIgnoreCase("gold")) {
			totalCost = 100 * sqfeet;
		}
		return totalCost + (noOfTv * 10000);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
