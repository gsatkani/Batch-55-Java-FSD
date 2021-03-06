package com.wipro.customer;

public class Address {

	private int houseNo;
	private String streetName;
	private String city;
	private int pincode;
	
	// Default Constructor
	public Address() {
		
	}
	// Parameterized Constructor
	public Address(int houseno,String street,String city,int pin) {
		this.houseNo=houseno;
		this.streetName=street;
		this.city=city;
		this.pincode=pin;
	}
	
	// Getter and Setter Methods
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
