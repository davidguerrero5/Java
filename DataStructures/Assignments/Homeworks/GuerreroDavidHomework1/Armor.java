package GuerreroDavidHomework1;

public class Armor extends Item {

	// defines all armor item attributes
	private static String itemName = "Dragon Platebody";
	private static int defenseBonus = 45;
	private static int weight = 30;	
	private static int quantity = 1;
	
	// armor constructor takes information about the specific piece of armor
	public Armor (String name) {
		super(itemName, weight, 0, 0, defenseBonus, quantity);
		
	}
	
	// returns the defense bonus of the armor
	public int getDefenseBonus() {
		return defenseBonus;
	}

	// sets the defense bonus of the armor to something different
	public void setDefenseBonus(int defenseBonus) {
		Armor.defenseBonus = defenseBonus;
	}
	
	// returns the weight of the armor
	public int getWeight() {
		return quantity*weight; 
	}

	// returns the name of the armor
	public String getName() {
		return itemName;
	}
}
