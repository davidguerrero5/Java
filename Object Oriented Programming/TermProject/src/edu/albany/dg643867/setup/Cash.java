package edu.albany.dg643867.setup;

public class Cash<T extends Number> {
	
	public T cash;
	
	public Cash(T cash) {
		this.cash = cash;
	}
	
	@Override
	public String toString() {
		return "Cash: " + cash;
	}
	
	// prints the cash of the seller, any number type can be passed through this method
	public static <T> void printCash(T cash) {
		System.out.println(cash);
	}

}
