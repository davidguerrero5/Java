package edu.albany.dg643867.bob;

import edu.albany.dg643867.setup.Cash;
import edu.albany.dg643867.setup.Lemonade;
import edu.albany.dg643867.setup.LemonadeStandCreator;
import edu.albany.dg643867.setup.Water;

public class BobLemonadeStand extends LemonadeStandCreator {

	@Override
	public Lemonade getLemonade() {
		return new PinkLemonade();
	}

	@Override
	public Water getWater() {
		return new SparklingWater();
	}

	// Any type of number can be used when assigning a value to cash (double, float, int)
	@Override
	public Cash<?> getCash() {
		return new Cash(100);
	}

}
