package edu.albany.hw2.car;

public class Main {

	public static void main(String[] args) {
		// creates fuel object
		FuelGauge fuel = new FuelGauge();

		// creates odometer object with 999,950 of mileage
		Odometer odometer = new Odometer(999950, fuel);

		// fills the car up with gas
		for (int i = 0; i < fuel.MAX_GALLONS; i++) {
			fuel.incrementGallons();
		}

		// drives the car until it runs out of gas.
		while (fuel.getGallons() > 0) {
			// drive a mile
			odometer.incrementMileage();

			// display the mileage
			System.out.println("Current Mileage: " + odometer.getMileage());

			// display the amount of fuel
			System.out.println("Current Fuel: " + fuel.getGallons() + " gallons");
			System.out.println();
		}
		System.out.println("Car is out of gas. Please re-fuel.");
	}
}
