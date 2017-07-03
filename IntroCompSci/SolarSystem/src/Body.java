
/* 
 * 
 * David Guerrero
 * 11/1/2016
 * 
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class Body {
	
	// defines initial variables for the bodies (planets) 
	public double x;
	public double y;
	public double vx;
	public double vy;
	public double radius;
	public double mass;

	public int R;
	public int G;
	public int B;

	// creates constructor for each body (planet) 
	public Body(double px, double py, double ivx, double ivy, double pradius, int r, int g, int b) {
		x = px;
		y = py;
		vx = ivx;
		vy = ivy;
		radius = pradius;

		R = r;
		G = g;
		B = b;
	}

	// sets mass of the body
	public void setMass(double m) {
		mass = m;
	}

	// draws a body 
	public void draw(double PIXEL_PER_METER) {
		StdDraw.setPenColor(R, G, B);
		StdDraw.filledCircle(x * PIXEL_PER_METER, y * PIXEL_PER_METER, radius);

	}

	// updates the position of each body based on x and y velocities
	public void updatePosition(double timestep) {
		x = x + vx * timestep;
		y = y + vy * timestep;
	}

	// updates the velocity of each body 
	public void updateVelocity(double ax, double ay, double timestep) {
		vx = vx + ax * timestep;
		vy = vy + ay * timestep;
	}
}
