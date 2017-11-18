package edu.albany.shop;

public class SandwichDriver {
	public static void main(String[] args) {
		
		// Customer: Joe, Price of sandwich he wants to buy: 200, Wants: Grilled Cheese Sandwich
		Customer customer = new Customer("Joe", 10, "Grilled Cheese");
		
		// prints customer
		System.out.println(customer);
		
		// Cashier : Synthia, Money in register: 10,000
		Cashier cashier = new Cashier("Synthia", 10000.0, customer); 
		
		// Sandwich Maker: Dave, Gives sandwich to Synthia
		SandwichMaker sandwichMaker = new SandwichMaker("Dave", cashier);

		System.out.println(customer);
		
		System.out.println(cashier);
		
		cashier.computeTotal();

		System.out.println(cashier);
		
	}
}