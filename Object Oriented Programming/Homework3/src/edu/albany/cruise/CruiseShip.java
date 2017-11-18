package edu.albany.cruise;

public class CruiseShip extends Ship {
	int maxPassengers;

	public CruiseShip(String ship, int year, int maxPassengers) {
		super(ship, year);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public String toString() {
		return "\nShip Name: " + getShipName() + "\nMaximum Number of passengers: " + getMaxPassengers();
	}
}
