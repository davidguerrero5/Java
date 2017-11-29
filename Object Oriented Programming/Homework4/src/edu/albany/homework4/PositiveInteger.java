package edu.albany.homework4;

public class PositiveInteger extends Semigroup<PositiveInteger> {
	private int positiveInteger;

	public PositiveInteger() {
		this(0);
	}

	public PositiveInteger(int positiveInt) {
		if (positiveInt >= 0) {
			this.positiveInteger = positiveInt;
		} else {
			throw new IllegalArgumentException();
		}
	}

	// acts as a toString method
	public int getInt() {
		return positiveInteger;
	}

	public PositiveInteger operator(PositiveInteger posInt) {
		PositiveInteger newPositiveInt;
		int sum;

		sum = posInt.getInt() + this.positiveInteger;
		newPositiveInt = new PositiveInteger(sum);

		return newPositiveInt;
	}

}