package GuerreroDavidHomework1;

public class Item {

	// defines all item attributes
	private String itemName;
	private int quantity;
	private int itemWeight;
	private int itemDamage;
	// total item weight equals each item multiplied by the weight of those items
	private int totalItemWeight = itemWeight * quantity;
	private int healthBoost; 
	private int itemDefense;

	// Item constructor, takes everything related to an item
	public Item(String name, int weight, int damage, int health, int defense, int quantity) {
		this.itemName = name;
		this.itemWeight = weight;
		this.itemDamage = damage;
		this.healthBoost = health;
		this.itemDefense = defense;
		this.quantity = quantity;
	}

	// returns the name of an item
	public String getItemName() {
		return itemName;
	}

	// sets the name of an item to something else
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// returns the weight of all items
	public int getItemWeight() {
		return totalItemWeight;
	}
	
	// returns information about each item including their weight and name
	public String examine() {
		return "Item: " + this.itemName + "   Weight: " + this.itemWeight + "kg" + "   Damage: " + this.itemDamage
				+ "   Health Boost: " + this.healthBoost + "   Defense Bonus: " + this.itemDefense + "   Quantity: " + 
				this.quantity;
	}
	
}
