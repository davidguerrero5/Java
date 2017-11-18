package edu.albany.cruise;

public class Ship {
	String ship;
	int year;

	public Ship(String ship, int year) {
		this.ship = ship;
		this.year = year;
	}

	public String getShipName() {
		return ship;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "\nShip Name: " + getShipName() + "\nBuilt in: " + getYear();
	}
}
