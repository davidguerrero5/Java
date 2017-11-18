package edu.albany.shop;

public class SandwichMaker {
	private String name; 

	private Cashier cashier; 

	public SandwichMaker(String name, Cashier cashier) {
		this.name = name;
		this.cashier = cashier;
	}
	
	// sandwich maker makes the sandwich
	public boolean makeSandwich() {
		System.out.println();
		System.out.println("TRANSACTION SUCCESSFUL!");
		return true;
	}

}
