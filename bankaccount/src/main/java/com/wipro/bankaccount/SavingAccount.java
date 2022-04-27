package com.wipro.bankaccount;

public class SavingAccount extends Account {

	private int minBalance;

	void display() {
		super.display(); // super keyword - refers to Super Class / Parent 
		System.out.println("Min Balance " + getMinBalance());
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

}
