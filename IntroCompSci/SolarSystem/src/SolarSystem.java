
/* 
 * 
 * David Guerrero
 * 11/1/2016
 * 
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class SolarSystem {
	//canvas size
	public static int WINDOW_WIDTH = 200; //sets window width 
	public static int WINDOW_HEIGHT = 200;

	//spring constant, higher = less elastic
	public static double SPRING_CONSTANT = 1.0;
	public static double PIXEL_PER_METER = 5.0;

	//framerate, higher = smoother, timestep = 1 frame 
	public static int FRAMERATE = 50;
	public static double TIMESTEP = 1.0 / FRAMERATE;

	public static void main(String[] args) {
		// set canvas size
		StdDraw.setXscale(0, WINDOW_WIDTH);
		StdDraw.setYscale(0, WINDOW_HEIGHT);
		
		// set mercury position, radius, mass, x and y velocity
		double mercuryX = 17, mercuryY = 21;
		double mercuryRadius = 1;
		double mercuryMass = 0.1;
		double mercuryv_x = 16, mercuryv_y = 10.0;
		
		// set venus position, radius, mass, x and y velocity
		double venusX = 13, venusY = 23;
		double venusRadius = 2.5;
		double venusMass = 0.15;
		double venusv_x = 16, venusv_y = 13.0;
		
		// set earth position, radius, mass, x and y velocity
		double earthX = 9, earthY = 25;
		double earthRadius = 3.5;
		double earthMass = 0.2;
		double earthv_x = 16, earthv_y = 13.0;
		
		// set mars position, radius, mass, x and y velocity
		double marsX = 5, marsY = 27;
		double marsRadius = 3.5;
		double marsMass = 0.25;
		double marsv_x = 16, marsv_y = 13.0;

		// call system method to create instances
		System mercury = new System(mercuryX, mercuryY, mercuryv_x, mercuryv_y, mercuryRadius, 255, 0, 0, mercuryMass);
		System venus = new System(venusX, venusY, venusv_x, venusv_y, venusRadius, 204, 102, 0, venusMass);
		System earth = new System(earthX, earthY, earthv_x, earthv_y, earthRadius, 0, 255, 0, earthMass);
		System mars = new System(marsX, marsY, marsv_x, marsv_y, marsRadius, 255, 204, 153, marsMass);

		// draws all planets
		while (true) {

			// draws the planets and updates their positions as per the timestep 
			mercury.draw();
			mercury.update(SPRING_CONSTANT, TIMESTEP);
			
			venus.draw();
			venus.update(SPRING_CONSTANT, TIMESTEP);
			
			earth.draw();
			earth.update(SPRING_CONSTANT, TIMESTEP);
			
			mars.draw();
			mars.update(SPRING_CONSTANT, TIMESTEP);

		}
	}
}
