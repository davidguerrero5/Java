package edu.albany.cruise;

import edu.albany.cargo.CargoShip;

public class Main {
	public static void main(String[] args) {

		Ship[] ships = new Ship[4];

		ships[0] = new Ship("David's Ship", 1996);
		ships[1] = new CruiseShip("Umang's Ship", 1930, 3200);
		ships[2] = new CargoShip("Tank", 232, 9999);
		ships[3] = new Ship("Future Ship", 3017);
		
		for (Ship ship : ships) {
			System.out.println(ship);
		}
	}
}
