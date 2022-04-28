package com.wipro.methodoverride;

public class Exhibition extends Event {

	int noOfStalls;

	@Override
	public double generateRevenue() {
		return noOfStalls * 10000;
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

}
