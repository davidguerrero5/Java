package edu.albany.shop;

import java.util.ArrayList;

public class Cashier {
	// cashier's name
	private String name;
	// customer that is ordering
	private Customer currentCustomer;
	// total amount of money in the register
	private double register;

	public Cashier(String name, double register, Customer customer) {
		this.name = name;
		this.register = register;
		this.currentCustomer = customer;
	}

	public void sandwichRequest(Customer customer) {
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
		return "\nCashier Name Name: " + name + "\nServing Customer: " + currentCustomer.getName()
				+ "\nCash in Register: " + register;
	}
}
