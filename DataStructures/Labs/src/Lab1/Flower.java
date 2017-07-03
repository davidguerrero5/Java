package Lab1;

public class Flower {

	// the name of the flower
	private String flowerName;

	/**
	 * Accessor method to get the name of the flower
	 * @return the name of the flower
	 */
	public String getName() {
		return flowerName;
	}

	/**
	 * Sets the name of a flower
	 * @param the name the flower is being changed to
	 */
	public void setName(String name) {
		flowerName = name;
	}

	/**
	 * Constructor to initialize the flowerName
	 * @param name
	 */
	public Flower(String name) {
		flowerName = name;
	}

	public Flower() {

	}
	
}
