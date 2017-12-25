package edu.albany.hw2.morse;

import java.util.Scanner;

public class MorseCode {

	/*
	 * I used this method of storing the letters and morse code symbols because
	 * I found it to be most intuitive for the problem that needed to be solved.
	 * The letters are stored as a long string, and the morse code symbols are
	 * stored as an array. When parsing through the array, the letters are used
	 * as an index for each symbol. Although this system is not as fast as using
	 * a HashMap or HashTable, it is easier to read and requires less lines of
	 * code to create.
	 */
	private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String[] MORSESYMBOLS = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--.." };

	// converts a string to morse code
	public static String toMorseString(String phrase) {
		String result = "";
		phrase = phrase.toUpperCase();
		for (int i = 0; i < phrase.length(); i++) {
			int index = LETTERS.indexOf(phrase.charAt(i));
			result += (index >= 0 ? MORSESYMBOLS[index] : " ") + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String phrase;

		System.out.print("Enter your phrase in English: ");
		phrase = keyboard.nextLine();

		System.out.println("'" + phrase + "' converts to: " + MorseCode.toMorseString(phrase) + "in morse code");

	}
}
