package GuerreroDavidHomework1;

public class Weapon extends Item{

	// defines all weapon attributes
	private static String itemName = "Sword";
	private static int itemDamage = 45;
	private static int weight = 10;
	private static int quantity = 1;
	
	// weapon constructor takes all information related to weapons
	public Weapon (String name) {
		super(name, weight, itemDamage, 0, 0, quantity);
	}
	
	// returns the damage bonus of the weapon
	public int getDamage() {
		return itemDamage;
	}

	// sets the damage bonus of a weapon to something else
	public void setDamage(int damage) {
		Weapon.itemDamage = damage;
	}
	
	// returns the weight of the weapon
	public int getWeight() {
		return quantity*weight; 
	}
	
	// returns the name of the weapon
	public String getName() {
		return itemName;
	}
}
