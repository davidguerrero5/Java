package edu.albany.dg643867.main;
import edu.albany.dg643867.bob.BobLemonadeStand;
import edu.albany.dg643867.david.DavidLemonadeStand;
import edu.albany.dg643867.setup.LemonadeStandCreator;
import edu.albany.dg643867.setup.*;

public class Main {
	public static void main(String[] args) {
		
		LemonadeStandCreator bobSetup = new BobLemonadeStand();
		LemonadeStand bobLemonadeStand = new LemonadeStand(bobSetup);
		System.out.println("______________Bob's Lemonade Stand______________");
		System.out.println(bobLemonadeStand);
		
		System.out.println();
	
		LemonadeStandCreator davidSetup = new DavidLemonadeStand();
		LemonadeStand davidLemonadeStand = new LemonadeStand(davidSetup);
		System.out.println("______________David's Lemonade Stand____________");
		System.out.println(davidLemonadeStand);
		
	}
}
