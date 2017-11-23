package edu.albany.dg643867.main;

import edu.albany.dg643867.setup.Lemonade;
import edu.albany.dg643867.setup.LemonadeStandCreator;
import edu.albany.dg643867.setup.Water;

public class LemonadeStand {
	private Water water;
	private Lemonade lemonade;
	
	public LemonadeStand(LemonadeStandCreator phoneFactory){
		water = phoneFactory.getWater();
		lemonade = phoneFactory.getLemonade();
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", water, lemonade);
	}
}
