// David Guerrero
// Using an array list to randomly print out a deck of cards
package cards;

import java.util.ArrayList;
import java.util.Collections;


public class DeckandCards {

	public static void main(String[] args) {
		ArrayList<String> CardSuits = new ArrayList<String>(); // create arraylist for card suits
		CardSuits.add("Clubs");
		CardSuits.add("Diamonds");
		CardSuits.add("Hearts");
		CardSuits.add("Spades");

		ArrayList<String> CardRanks = new ArrayList<String>(); // create arraylist for card ranks
		CardRanks.add("2");
		CardRanks.add("3");
		CardRanks.add("4");
		CardRanks.add("5");
		CardRanks.add("6");
		CardRanks.add("7");
		CardRanks.add("8");
		CardRanks.add("9");
		CardRanks.add("10");
		CardRanks.add("Jack");
		CardRanks.add("Queen");
		CardRanks.add("King");
		CardRanks.add("Ace");

		// initializing deck
		int n = CardRanks.size() * CardSuits.size();
		Collections.shuffle(CardRanks); //randomize card ranks
		Collections.shuffle(CardSuits); //randomize card suits
		String[] deck = new String[n];
		for (int i = 0; i < CardRanks.size(); i++) {
			for (int j = 0; j < 4; j++) {
				Collections.shuffle(CardRanks);
				Collections.shuffle(CardSuits);
				deck[4 * i + j] = CardRanks.get(i) + " of " + CardSuits.get(j);
			}
		}

		// print deck
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}

	}
}
