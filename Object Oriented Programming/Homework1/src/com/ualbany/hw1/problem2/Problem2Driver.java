package com.ualbany.hw1.problem2;

import java.util.Scanner;

public class Problem2Driver extends HW1Problem2{
	
	public static void main(String[] args) {
		
		// new scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int firstNumber = userInput.nextInt();
		System.out.println("Please enter the second number: ");
		int secondNumber = userInput.nextInt();

		// returns true if the first number is divisible by the second number, otherwise it returns false
		System.out.print(HW1Problem2.multiple(firstNumber, secondNumber));
		
		// skips line
		System.out.println("");
		
		System.out.println("Please enter a number. It will be divided by 7 and you will be given the remainder:");
		int numberToBeDivided = userInput.nextInt();
		
		// returns the remainder of the number divided by 7
		System.out.println(HW1Problem2.remainder(numberToBeDivided));
		
		
		System.out.println("Please enter coordinates of two points. The distance will be calculated and printed for you.");
		System.out.println("x1: ");
		int x1 = userInput.nextInt();
		System.out.println("y1: ");
		int y1 = userInput.nextInt();
		System.out.println("x2: ");
		int x2 = userInput.nextInt();
		System.out.println("y2: ");
		int y2 = userInput.nextInt();
		
		// prints the distance between the two points
		System.out.println(HW1Problem2.distance(x1, y1, x2, y2));
		
		// prints the results of a coin being tossed 10 times
		System.out.println(coinToss(10));
		
	}

}
