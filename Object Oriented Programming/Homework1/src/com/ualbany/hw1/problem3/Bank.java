// David Guerrero 
// 9/15/17
package com.ualbany.hw1.problem3;

public class Bank {
	
	private String bankName;
	private Address bankAddress;
	
	public Bank(String name, Address address) {
		this.bankName = name;
		this.bankAddress = address;
	}
	
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @return the bankAddress
	 */
	public Address getBankAddress() {
		return bankAddress;
	}

	
	@Override
	public String toString() {
		return "Bank: " + bankName + "\n" + "Bank Address: " + bankAddress + "\n";
	}

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------------------------------------");
		// creates bank object
		Bank chaseBank = new Bank("Chase", new Address("323 Waverly Pl", "", "New York", "NY", 10035));
		
		// creates person object
		Person dave = new Person("David", "Guerrero", new Address("74 LaLa Ave", "", "New York", "NY", 10029));
		
		System.out.println(dave.getFirstName() + " has just walked into " + chaseBank.getBankName() + ". \n");
		
		System.out.println(chaseBank);
		System.out.println(dave);
			
		System.out.println("---------------------------------------------------------------------------------------");
		
		// creates account object
		CheckingBankAccount davesAccount = new CheckingBankAccount(1000);
		
		System.out.println(dave.getFirstName() + " has just opened an account with an initial balance of: " + davesAccount + "\n");
		
		// links the account that was just created to object "dave" 
		dave.setAccount(davesAccount);
		System.out.println(chaseBank);
		System.out.println(dave);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		System.out.println("RECEIPT");
		
		dave.getAccount().deposit(1000);
		
		System.out.println(chaseBank);
		System.out.println(dave);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		System.out.println("RECEIPT");
		
		dave.getAccount().withdraw(500);

		System.out.println(chaseBank);
		System.out.println(dave);
	}
	
}
