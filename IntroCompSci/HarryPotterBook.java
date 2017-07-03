// David Guerrero
// September 2, 2016
// CSI 201 
// The cover of my favorite book 
// book.java
// Idea inspired by Frank Fitzpatrick http://bulldogs.fjfitz.com/231/2015/04/22/minimalist-book-covers/

package homework;
import edu.princeton.cs.introcs.StdDraw;

public class HarryPotterBook {
	public static void main(String[]args) {
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		StdDraw.clear(StdDraw.BLUE);
		StdDraw.text(100, 190, "Harry Potter and the Chamber of Secrets");
		StdDraw.circle(50, 100, 30);
		StdDraw.circle(150, 100, 30);
		StdDraw.filledRectangle(100, 100, 20, 5);
		StdDraw.filledRectangle(5, 100, 15, 5);
		StdDraw.filledRectangle(195, 100, 15, 5);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(100, 100, 7.5, 5);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(40, 160, 45, 135);
		StdDraw.line(40, 160, 55, 150);
		StdDraw.line(40, 160, 55, 150);
		StdDraw.line(45, 180, 55, 150);
		StdDraw.text(50, 50, "David Guerrero");
		StdDraw.show();
	}
}
