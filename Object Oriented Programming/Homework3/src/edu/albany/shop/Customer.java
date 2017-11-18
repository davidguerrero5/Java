package edu.albany.shop;

public class Customer {
	private String name; // customer's name
	private double cash; // price of the sandwich the customer wants to buy
	private String desiredSandwich; // customer's desired sandwich


	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public void setDesiredSandwich(String desiredSandwich) {
		this.desiredSandwich = desiredSandwich;
	}

	public String getName() {
		return name;
	}

	public Customer(String name, double cash, String desiredSandwich) {
		this.name = name;
		this.cash = cash;
		this.desiredSandwich = desiredSandwich;
	}

	public boolean givePayment(double total) {
		boolean answer = false;

		// given the customer has enough to pay, he will pay the cashier
		if (cash >= total) {
			cash -= total;
			answer = true;
		}

		return answer;
	}
	
	public String getDesiredSandwich() {
		return desiredSandwich;
	}

	@Override
	public String toString() {
		return "\nCustomer Name: " + name + "\nAccount Balance: " + cash + "\nSandwich: " + desiredSandwich;
	}
}
