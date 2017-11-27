package edu.albany.homework3;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	private int red;
	private int green;
	private int blue;

	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public RGBColor operator(RGBColor color) {
		RGBColor averagedColors;
		int red, green, blue;

		// calculates the average of red, green and blue
		red = ((color.getRed() + this.red)/2);
		green = ((color.getGreen() + this.green)/2);
		blue = ((color.getBlue() + this.blue)/2);
		
		// prints the new RGB color
		averagedColors = new RGBColor(red, green, blue);

		return averagedColors;
	}
	
	public RGBColor complement() {
		return new RGBColor(255-red, 255-green, 255-blue);
	}
}
