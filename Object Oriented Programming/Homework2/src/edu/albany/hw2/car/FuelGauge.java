package edu.albany.hw2.car;

public class FuelGauge {
	private int gallons;
	public final int MAX_GALLONS = 15;

	public FuelGauge() {
		gallons = 0;
	}

	public FuelGauge(int g) {
		gallons = g;
	}

	// returns current amount of fuel in car
	public int getGallons() {
		return gallons;
	}

	// increments the gallons in the tank by 1
	public void incrementGallons() {
		if (gallons < MAX_GALLONS)
			gallons += 1;
	}

	// increments the gallons in the tank by 1
	public void decrementGallons() {
		if (gallons > 0)
			gallons -= 1;
	}

}
