package edu.albany.shop;

import java.util.ArrayList;

public class Cashier {
	private String name; // cashier's name
	private Customer currentCustomer; // the customer the cashier is currently
										// servicing
	private double tillCash; // the amount of cash in the till

	public Cashier(String name, double tillCash, Customer customer) {
		this.name = name;
		this.tillCash = tillCash;
		this.currentCustomer = customer;
	}

	public void ringUpSandwich(Customer customer) {
		currentCustomer = customer;
		computeTotal();
	}

	public void computeTotal() {
		double total = currentCustomer.getCash(); // total amount to charge the customer

		// if the customer can afford to pay, then add the total paid to the
		// cash in the till
		if (currentCustomer.givePayment(total)) {
			tillCash += total;
			System.out.println("this is still printing");
		}
	}
	
	@Override
	public String toString() {
		return "\nCashier Name Name: " + name + "\nServing Customer: " + currentCustomer.getName() + "\nCash in Register: " + tillCash;
	}
}
