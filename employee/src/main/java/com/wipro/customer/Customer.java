package com.wipro.customer;

public class Customer {

	public int id;  //getId() setId()
	public String name; // getName() setName()
	public long phone;
    // Customer Has A Address - > Relation Between two classes
	// Has A RelationShip
	public Address homeAddress;
	// Default Constructor
	public Customer() {
    }
	//                  10           A        1               add-> 115 Abc Def 6355
    public Customer(int id, String name, long phone, Address address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.homeAddress = address;
	}
	// Add Behavior to Display Customer details
	public void displayCustomerDetails() {
		System.out.println("Id " + getId()); // Integer
		System.out.println("Name " + getName()); // String
		System.out.println("Phone " + getPhone()); // Long
		Address home = getHomeAddress(); // Address
		System.out.println("House No " + home.getHouseNo());
		System.out.println("Street Name " + home.getStreetName());
		System.out.println("City Name " + home.getCity());
		System.out.println("PinCode " + home.getPincode());
	}

	// Generate Getter and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

}
