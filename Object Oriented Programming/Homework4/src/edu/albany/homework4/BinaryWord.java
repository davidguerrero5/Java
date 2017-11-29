package edu.albany.homework4;

import java.util.BitSet;

public class BinaryWord implements Complementable<BinaryWord> {
	private BitSet bits;
	private int length;

	public BinaryWord(String bits) {
		this.length = bits.length();
		this.bits = new BitSet(length);

		for (int i = 0; i < length; i++) {
			if (bits.charAt(i) == '1') {
				this.bits.set(i);
			}
		}
	}

	// responsible for determining the compliments of the bits
	public BinaryWord complement() {
		BinaryWord wordComplement;
		BitSet bitsComplement;

		bitsComplement = new BitSet(length);

		// copies the original BitSet
		bitsComplement.or(bits);

		// flips each bit
		bitsComplement.flip(0, length);

		wordComplement = new BinaryWord(BitSetToString(bitsComplement));

		return wordComplement;
	}

	public String toString() {
		return BitSetToString(bits);
	}

	private String BitSetToString(BitSet bits) {
		String string = "";

		// adds a 1 or 0 to the output
		for (int i = 0; i < length; i++) {
			if (bits.get(i)) {
				string += "1";
			} else {
				string += "0";
			}
		}
		return string;
	}
}