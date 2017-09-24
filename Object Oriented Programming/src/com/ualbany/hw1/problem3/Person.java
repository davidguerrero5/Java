// David Guerrero 
// 9/15/17
package com.ualbany.hw1.problem3;

public class Person {

	private String firstName;
	private String lastName;
	private Address address;
	private CheckingBankAccount account;

	public Person(String fName, String lName, Address home) {
		this.firstName = fName;
		this.lastName = lName;
		this.address = home;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @return the account
	 */
	public CheckingBankAccount getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(CheckingBankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "Address: " + address + "\n" + "Account Balance: "
				+ account;
	}

	
}
