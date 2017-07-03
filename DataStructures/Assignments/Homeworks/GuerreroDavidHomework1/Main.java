package GuerreroDavidHomework1;

public class Main {

	public static void main(String[] args) {
		// creates weapon named Sword
		Weapon Sword = new Weapon("Sword");
		// examines weapon
		System.out.println(Sword.examine());
		// prints the weapon's name
		System.out.println(Sword.getName());
		// prints the weapon's damage
		System.out.println(Sword.getDamage() + " damage");
		// sets the attack bonus of the sword to 150
		Sword.setDamage(100);
		// prints the new attack bonus of the sword
		System.out.println(Sword.getDamage() + " damage");
		// prints the weapon's weight
		System.out.println(Sword.getWeight() + "kg");

		
		// creates a new food named Apple with a quantity of 2
		Food Apple = new Food("Apple", 2);
		// examines food
		System.out.println(Apple.examine());
		// prints the name of the food
		System.out.println(Apple.getName());
		// prints the nutrition of each individual piece of food
		System.out.println(Apple.getNutrition() + " health each");
		// prints the quantity of the food
		System.out.println(Apple.getquantity() + " apples");
		// sets the quantity of apples to 3
		Apple.setQuantity(3);
		// prints the new quantity of apples
		System.out.println(Apple.getquantity() + " apples");
		// prints the weight of all of the apples combined
		System.out.println(Apple.getWeight() + "kg");
		
		// creates a new armor object named Armor
		Armor dragPlate = new Armor("Dragon Platebody");
		// examines armor
		System.out.println(dragPlate.examine());
		// prints the name of the armor
		System.out.println(dragPlate.getName());
		// prints the defense bonus of the armor
		System.out.println(dragPlate.getDefenseBonus() + " defense bonus");
		// sets the defense bonus of the armor to 100
		dragPlate.setDefenseBonus(100);
		// prints the new defense bonus of the armor
		System.out.println(dragPlate.getDefenseBonus() + " defense bonus");
		// prints the weight of the armor
		System.out.println(dragPlate.getWeight() + "kg");


	}

}
