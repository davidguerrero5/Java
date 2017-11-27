package edu.albany.homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String binaryNum;
		BinaryWord word, comp;
		
		PositiveInteger posInt1, posInt2, posInt3, posIntSum;
		int number1, number2, number3;
		
		RGBColor color1, color2, color3, combinedColors;
		int red1, green1, blue1, red2, green2, blue2, red3, green3, blue3;

		Collection<RGBColor> colorList = new ArrayList<RGBColor>();
		Collection<PositiveInteger> positiveIntegerList = new ArrayList<PositiveInteger>();

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Enter a binary number: ");
		binaryNum = keyboard.next();
		word = new BinaryWord(binaryNum);
		comp = word.complement();

		System.out.printf("\n %10s %s\n", "Original", word);
		System.out.printf("%10s %s\n", "Complement", comp);

		System.out.printf("\nEnter value of red for color 1: ");
		red1 = keyboard.nextInt();
		System.out.printf("Enter value of green for color 1: ");
		green1 = keyboard.nextInt();
		System.out.printf("Enter value of blue for color 1: ");
		blue1 = keyboard.nextInt();
		System.out.printf("Enter value of red for color 2: ");
		red2 = keyboard.nextInt();
		System.out.printf("Enter value of green for color 2: ");
		green2 = keyboard.nextInt();
		System.out.printf("Enter value of blue for color 2: ");
		blue2 = keyboard.nextInt();

		color1 = new RGBColor(red1, green1, blue1);
		color2 = new RGBColor(red2, green2, blue2);
		color3 = color1.operator(color2);

		System.out.printf("\nAverage of first and second set of colors: Red: %d Green: %d Blue: %d\n", color3.getRed(),
				color3.getGreen(), color3.getBlue());

		System.out.printf("\nEnter value of red for color 3: ");
		red3 = keyboard.nextInt();
		System.out.printf("Enter value of green for color 3: ");
		green3 = keyboard.nextInt();
		System.out.printf("Enter value of blue for color 3: ");
		blue3 = keyboard.nextInt();

		color3 = new RGBColor(red3, green3, blue3);
		colorList.add(color1);
		colorList.add(color2);
		colorList.add(color3);
		combinedColors = RGBColor.combine(colorList);

		System.out.printf("\nAverage of second and third set of colors: Red: %d Green: %d Blue: %d\n",
				combinedColors.getRed(), combinedColors.getGreen(), combinedColors.getBlue());

		System.out.printf("\nEnter positive integer 1: ");
		number1 = keyboard.nextInt();
		System.out.printf("Enter positive integer 2: ");
		number2 = keyboard.nextInt();
		System.out.printf("Enter positive integer 3: ");
		number3 = keyboard.nextInt();

		posInt1 = new PositiveInteger(number1);
		posInt2 = new PositiveInteger(number2);
		posInt3 = new PositiveInteger(number3);
		positiveIntegerList.add(posInt1);
		positiveIntegerList.add(posInt2);
		positiveIntegerList.add(posInt3);
		posIntSum = PositiveInteger.combine(positiveIntegerList);

		System.out.printf("\nSum of all three positive integers: %d", posIntSum.getInt());

		keyboard.close();
		System.exit(0);
	}
}
