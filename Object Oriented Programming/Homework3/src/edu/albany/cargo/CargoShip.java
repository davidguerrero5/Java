package edu.albany.cargo;

import edu.albany.cruise.Ship;

public class CargoShip extends Ship {
	int numberOfTons;

	public CargoShip(String name, int year, int num) {
		super(name, year);
		this.numberOfTons = num;
	}

	public int getNumberOfTons() {
		return numberOfTons;
	}

	@Override
	public String toString() {
		return "\nShip name: "  + getShipName() + "\nShip Capacity: " + getNumberOfTons() + " tons";
	}
}
