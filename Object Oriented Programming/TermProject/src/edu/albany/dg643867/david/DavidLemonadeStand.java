package edu.albany.dg643867.david;

import edu.albany.dg643867.setup.Lemonade;
import edu.albany.dg643867.setup.LemonadeStandCreator;
import edu.albany.dg643867.setup.Water;

public class DavidLemonadeStand extends LemonadeStandCreator{

	@Override
	public Lemonade getLemonade() {
		return new YellowLemonade();
	}

	@Override
	public Water getWater() {
		return new BubblyWater();
	}

}
