// David Guerrero
// 10/15/17
package com.ualbany.hw1.problem2;

public class HW1Problem2 {

	// returns true if the first number is divisible by the second number,
	// otherwise it returns false
	public static boolean multiple(int firstNum, int secondNum) {
		if (firstNum % secondNum == 0) {
			return true;
		} else {
			return false;
		}
	}

	// returns the remainder of the number divided by 7
	public static double remainder(int num) {
		return num % 7;
	}

	// calculates the total distance between x1,y1 and x2,y2
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.hypot(x2 - x1, y2 - y1);

	}

	// tossing a coin amountOfTosses times, prints how many times it lands on heads and tails
	public static String coinToss(int amountOfTosses) {

		double hcount = 0;
		double tcount = 0;

		for (int i = 1; i <= amountOfTosses; i++) {
			if (Math.random() < 0.5) {
				hcount++;
			} else {
				tcount++;
			}
		}
		return "The coin was flipped " + amountOfTosses + " times and landed on heads " + hcount + " times and tails "
				+ tcount + " times";
	}

}
