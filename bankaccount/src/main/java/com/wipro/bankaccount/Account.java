package com.wipro.bankaccount;

public class Account {
	
	protected String accName;
	protected String accNo;
	protected String bankName;
	
	void display() {
		System.out.println("Account Type " + getAccName());
		System.out.println("Account No " + getAccNo());
		System.out.println(" Bank Name " + getBankName());
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	

}
