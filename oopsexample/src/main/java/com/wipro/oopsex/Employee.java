package com.wipro.oopsex;
// only public, abstract & final are permitted
public class Employee {
    
	 // Encapsulation ->  wrapping of data and code
	 // Access Modifiers - public private protected default
	 // Data hiding
	 private int id;
	 private String name;
	 private long phone;
	 private String aadharNumber;
	 private String panNumber;
	 private String accountNumber;
	 
	 // Access private data members - Getter and Setter
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

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public static void main(String[] args) {
		
		 Employee empOne=new Employee();
		 empOne.id=101;
		 empOne.name="Siva";
		 empOne.aadharNumber="1212121212";
		 empOne.accountNumber="987665555";
		 empOne.panNumber="jjbaj5615261";
		 
		 System.out.println(empOne.aadharNumber);
		 System.out.println(empOne.accountNumber);
		 System.out.println(empOne.panNumber);
		 
		 
	}
	
}
