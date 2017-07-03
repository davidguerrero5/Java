package Lab1;

public class Iris extends Flower{
	
	// the color of the Iris
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
	 * @param color of the Iris
	 */
	public Iris (String color) {
		super("Iris");
	}
	
	/**
	 * Sets the color of the Iris to purple
	 */
	public Iris () {
		setFlowerColor("Purple");
	}
	
	/**
	 * Prints that cauliflowers are edible
	 * @return a statement indicating that cauliflowers are edible
	 */
	public String isEdible() {
		return "Irises are not edible!";
	}
}
