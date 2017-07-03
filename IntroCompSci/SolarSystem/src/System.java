
/* 
 * 
 * David Guerrero
 * 11/1/2016
 * 
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class System {
	// canvas size
	public static int WINDOW_WIDTH = 200; // sets window width
	public static int WINDOW_HEIGHT = 200;

	// spring constant, higher = less elastic
	public static double SPRING_CONSTANT = 1.0;
	public static double PIXEL_PER_METER = 5.0;

	// framerate, higher = smoother, timestep = 1 frame
	public static int FRAMERATE = 50;
	public static double TIMESTEP = 1.0 / FRAMERATE;

	// x and y values of the sun
	public static int sunX = 20;
	public static int sunY = 20;

	public Body b;
	public Body post;

	// creates system constructor, sets mass of sun and creates instance of the sun
	public System(double ballx, double bally, double ballVx, double ballVy, double ballRadius, int ballR, int ballG,
			int ballB, double ballMass) {
		b = new Body(ballx, bally, ballVx, ballVy, ballRadius, ballR, ballG, ballB);
		b.setMass(ballMass);
		post = new Body(sunX, sunY, 0, 0, 5, 255, 255, 0);
	}

	public void draw() {
		StdDraw.clear(StdDraw.BLACK); // black background
		b.draw(PIXEL_PER_METER);

		// draws sun
		post.draw(PIXEL_PER_METER);
		
		StdDraw.show((int) (1000 * TIMESTEP));
	}

	// calculates distance of bodies
	public double distance() {
		double dx = b.x - post.x;
		double dy = b.y - post.y;

		return Math.sqrt(dx * dx + dy * dy);
	}

	// calculates spring force
	public double springForce(double k) {
		return distance() * k;
	}
	
	// calculates acceleration due to gravity of the sun 
	public double computeAccleration(double k) {
		double a;
		a = springForce(k) / b.mass;
		return a;
	}

	// computes the acceleration on the horizontal axis
	public double computeAx(double a) {
		double dx = post.x - b.x;
		return a * dx / distance();
	}
	
	// computes the acceleration on the vertical axis
	public double computeAy(double a) {
		double dy = post.y - b.y;
		return a * dy / distance();
	}

	// updates the position after each timestep (1 frame) 
	public void update(double k, double timestep) {

		b.updatePosition(timestep);
		double a = computeAccleration(SPRING_CONSTANT);
		double ax = computeAx(a);
		double ay = computeAy(a);

		b.updateVelocity(ax, ay, timestep);

	}
}
