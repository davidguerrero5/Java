package edu.albany.dg643867.david;

import edu.albany.dg643867.setup.Cash;
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
	
	@Override
	public Cash<?> getCash() {
		return new Cash(4000);
	}
	
//	@Override
//	public Cash<?> getCash() {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
