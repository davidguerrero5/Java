package edu.albany.homework3;

import java.util.BitSet;

public class BinaryWord implements Complementable<BinaryWord> {
	private BitSet bits;
	private int length;

	public BinaryWord(String bits) {
		this.length = bits.length();
		this.bits = new BitSet(length); // length of BitSet = length of input
										// strength

		for (int i = 0; i < length; i++) { // for each character in the input
											// string
			if (bits.charAt(i) == '1') { // if it's a 1
				this.bits.set(i); // set the same bit in the BitSet to 1
			}
		}
	}

	public BinaryWord complement() {
		BitSet bitsComp; // container for complement
		BinaryWord wordComp; // container for output

		bitsComp = new BitSet(length);
		bitsComp.or(bits); // copy the original BitSet
		bitsComp.flip(0, length); // flip each bit

		wordComp = new BinaryWord(BitSetToString(bitsComp));

		return wordComp;
	}

	public String toString() {
		return BitSetToString(bits);
	}

	private String BitSetToString(BitSet bits) {
		String string = "";

		for (int i = 0; i < length; i++) { // for each bit in BitSet
			if (bits.get(i)) { // if it's a 1
				string += "1"; // add 1 to the output string
			} else { // if it's a 0
				string += "0"; // add 0 to the output string
			}
		}

		return string;
	}
}