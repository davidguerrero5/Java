package edu.albany.shop;

import java.util.ArrayList;

public class Cashier {
	private String name; // cashier's name
	private Customer currentCustomer; // the customer the cashier is currently
										// servicing
	private double register; // the amount of cash in the till

	public Cashier(String name, double tillCash, Customer customer) {
		this.name = name;
		this.register = tillCash;
		this.currentCustomer = customer;
	}

	public void ringUpSandwich(Customer customer) {
		currentCustomer = customer;
		computeTotal();
	}

	public void computeTotal() {
		// the customer is charged all of the cash he has in hand
		double total = currentCustomer.getCash();

		if (currentCustomer.givePayment(total)) {
			register += total;
		}
	}
	
	@Override
	public String toString() {
		return "\nCashier Name Name: " + name + "\nServing Customer: " + currentCustomer.getName() + "\nCash in Register: " + register;
	}
}
