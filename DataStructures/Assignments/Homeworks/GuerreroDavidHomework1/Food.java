package GuerreroDavidHomework1;

public class Food extends Item{
	
	// defines all food attributes
	private static String itemName = "Apple"; 
	private static int healthBoost = 5;
	private static int quantity = 2;
	private static int weight = 1;
	
	// food constructor takes information about each food object
	public Food (String name, int quantity) {
		super(itemName, weight*quantity, 0, healthBoost, 0, quantity);
	}
	
	// returns the health boost of each piece of food
	public int getNutrition() {
		return healthBoost;
	}
	
	// returns the quantity of food
	public int getquantity() {
		return quantity;
	}
	
	// returns the weight of all food objects
	public int getWeight() {
		return quantity*weight; 
	}
	
	// sets the quantity of food objects
	public void setQuantity(int quantity) {
		Food.quantity = quantity; 
	}
	
	// returns the name of the food
	public String getName() {
		return itemName;
	}

}
