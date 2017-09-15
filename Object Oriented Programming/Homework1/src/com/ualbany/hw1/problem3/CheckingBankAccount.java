// David Guerrero 
// 9/15/17
package com.ualbany.hw1.problem3;

public class CheckingBankAccount {

	public double value;

	public CheckingBankAccount(double value) {
		this.value = value;
	}

	/**
	 * Returns the value of the account
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Deposits money into account
	 * @param value the value to set
	 */
	public void deposit(double value) {
		this.value += value;
	}
	
	/**
	 * Withdraws money from account
	 */
	public void withdraw(double value) {
		if (this.value >= value) {
			this.value -= value;
		}
	}

	@Override
	public String toString() {
		return "$" + value;
	}
	
	

}
