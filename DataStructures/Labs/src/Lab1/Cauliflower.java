package Lab1;

public class Cauliflower extends Flower {

	// the color of the Cauliflower
	private String flowerColor;
	
	/**
	 * Sets the color of a flower
	 * @param the color the flower is being changed to
	 */
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	
	/**
	 * Returns the color of a flower
	 * @return the color of the flower
	 */
	public String getFlowerColor() {
		return flowerColor;
	}
	
	/**
	 * Calls the super class
	 * @param color of the cauliflower
	 */
	public Cauliflower (String color) {
		super("Cauliflower");
	}
	
	/**
	 * Sets the color of the cauliflower to white
	 */
	public Cauliflower() {
		setFlowerColor("White");
	}
	
	/**
	 * Prints that cauliflowers are edible
	 * @return a statement indicating that cauliflowers are edible
	 */
	public String isEdible() {
		return "Cauliflowers are edible!";
	}
}
