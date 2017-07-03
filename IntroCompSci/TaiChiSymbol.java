import edu.princeton.cs.introcs.StdDraw;
public class TaiChiSymbol {

	public static void main(String[] args) {
		StdDraw.setXscale(0,200); // set how big the canvas is horizontally
		StdDraw.setYscale(0,200); // set how big the canvas is vertically 
		
		StdDraw.filledCircle(100, 100, 50); // draw a black circle at 100,100 with radius 50 since half of the tai chi symbol is black 
		
		StdDraw.setPenColor(StdDraw.WHITE); // set the pen color to white
		StdDraw.filledRectangle(75, 100, 25, 50); // white rectangle that covers half of the circle drawn at 75,100 with half-width 25 and half-height of 50
		StdDraw.filledCircle(100, 125, 25); // upper white circle of the tai chi symbol drawn at 100,125 with radius 25
		
		StdDraw.setPenColor(StdDraw.BLACK); // set the pen color to black
		StdDraw.filledCircle(100, 75, 25); // lower black circle of the tai chi symbol drawn at 100,75 with radius 25
		StdDraw.filledCircle(100, 125, 8); // small black circle in the center of the upper white circle at 100,125 with radius 8
		
		StdDraw.setPenColor(StdDraw.WHITE); // set the pen color to white
		StdDraw.filledCircle(100, 75, 8); // small white circle in the center of the lower black circle drawn at 100,75 with radius 8
		
		StdDraw.setPenColor(StdDraw.BLACK); // set the pen color to black
		StdDraw.circle(100, 100, 50); // draw the black outline of the tai chi symbol
	}

}
