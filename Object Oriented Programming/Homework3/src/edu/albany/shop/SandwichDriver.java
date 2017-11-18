package edu.albany.shop;

public class SandwichDriver {
	public static void main(String[] args) {

		// Customer: Joe, Price of sandwich he wants to buy: 200, Wants: Grilled
		// Cheese Sandwich
		Customer customer = new Customer("Joe", 10, "Grilled Cheese");

		// Cashier : Synthia, Money in register: 10,000
		Cashier cashier = new Cashier("Synthia", 10000.0, customer);

		// Sandwich Maker: Dave, Gives sandwich to Synthia to initiate transaction process
		SandwichMaker sandwichMaker = new SandwichMaker("Dave", cashier);

		// prints customer info
		System.out.println(customer);

		// prints cashier info
		System.out.println(cashier);

		// sandwich maker makes sandwich and transaction goes through
		if (sandwichMaker.makeSandwich()) {
			cashier.computeTotal();
		}

		// prints the cashier to show the new register total
		System.out.println(cashier);
		
		// prints the customer to show his new balance
		System.out.println(customer);

	}
}