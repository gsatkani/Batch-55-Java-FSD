package com.wipro.methodoverride;

public class StageEvent extends Event {

	int noOfShows;
	int noOfSeatsPerShow;

	@Override
	public double generateRevenue() {
		return noOfShows * (noOfSeatsPerShow * 50);
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

}
