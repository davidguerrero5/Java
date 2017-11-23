package edu.albany.dg643867.main;

import edu.albany.dg643867.setup.Cash;
import edu.albany.dg643867.setup.Lemonade;
import edu.albany.dg643867.setup.LemonadeStandCreator;
import edu.albany.dg643867.setup.Water;

public class LemonadeStand {
	private Water water;
	private Lemonade lemonade;
	private Cash<?> cash;
	
	// All of the contents of the lemonade stand. This includes the liquids as well as the cash of the seller
	public LemonadeStand(LemonadeStandCreator contents){
		water = contents.getWater();
		lemonade = contents.getLemonade();
		cash = contents.getCash();
	}
	
	// Formats how the lemonade stands are printed
	@Override
	public String toString() {
		return String.format("%s, %s, %s", water, lemonade, cash);
	}
}
