package edu.albany.hw2.car;

public class Odometer {
	private int mileage;
	private int setPoint;
	private FuelGauge fuelGauge;

	private final int MAX_MILEAGE = 999999;
	private final int MILES_PER_GALLON = 22;

	public Odometer(int m, FuelGauge fg) {
		fuelGauge = fg;
		mileage = m;
	}

	// returns current mileage
	public int getMileage() {
		return mileage;
	}

	// increments mileage
	public void incrementMileage() {
		mileage += 1;
		// resets if mileage hits max
		mileage = mileage % (MAX_MILEAGE + 1);

		setPoint += 1; 
		while (setPoint >= MILES_PER_GALLON) {
			fuelGauge.decrementGallons();
			setPoint = setPoint - MILES_PER_GALLON;
		}
	}
}
