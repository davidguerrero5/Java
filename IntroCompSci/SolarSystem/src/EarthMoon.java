
/* 
 * 
 * David Guerrero
 * 11/1/2016
 * 
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class EarthMoon {
	// canvas size
	public static int WINDOW_WIDTH = 200; // sets window width
	public static int WINDOW_HEIGHT = 200;

	// spring constant, higher = less elastic
	public static double SPRING_CONSTANT = 1.0;
	public static double PIXEL_PER_METER = 5.0;

	// framerate, higher = smoother, timestep = 1 frame
	public static int FRAMERATE = 50;
	public static double TIMESTEP = 1.0 / FRAMERATE;

	public static void main(String[] args) {
		
		// initial x and y postions of moon
		double x = 25, y = 10;

		// initial horizontal and vertical velocity of moon
		double v_x = 10.75, v_y = 10.0;

		// set canvas size
		StdDraw.setXscale(0, WINDOW_WIDTH);
		StdDraw.setYscale(0, WINDOW_HEIGHT);

		// creates an instance of the system class (moon) 
		System moon = new System(x, y, v_x, v_y, 2.5, 255, 255, 255, 1);

		// System.out.println(3 / 4 * 8 > 5);

		while (true) {

			// draws moon and updates position as per the timestep 
			moon.draw();
			moon.update(SPRING_CONSTANT, TIMESTEP);

		}
	}
}
