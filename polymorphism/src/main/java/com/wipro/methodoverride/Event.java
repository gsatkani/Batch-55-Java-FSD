package com.wipro.methodoverride;

public class Event {

	String eventName;
	String eventDetail;
    // Override this method in subclass - Same method signature
	public double generateRevenue() {
		return 0.0;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

}
