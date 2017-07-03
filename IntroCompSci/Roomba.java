
// David Guerrero
// 12/13/2016
// Roomba Robot simulator

import edu.princeton.cs.introcs.StdDraw;

public class Roomba {

	// sets height and width of canvas
	private static int windowWidth = 200;
	private static int windowHeight = 200;

	// defines initial position and velocity for the ball
	private static double x = 100;
	private static double y = 100;
	private static double vx = (Math.random() - 0.5) * 4;
	private static double vy = (Math.random() - 0.5) * 6;
	private static int radius = 3;

	// empty tiles
	private static boolean tile1 = false;
	private static boolean tile2 = false;
	private static boolean tile3 = false;
	private static boolean tile4 = false;
	private static boolean tile5 = false;
	private static boolean tile6 = false;
	private static boolean tile7 = false;
	private static boolean tile8 = false;
	private static boolean tile9 = false;
	private static boolean tile10 = false;
	private static boolean tile11 = false;
	private static boolean tile12 = false;
	private static boolean tile13 = false;
	private static boolean tile14 = false;
	private static boolean tile15 = false;
	private static boolean tile16 = false;
	private static boolean tile17 = false;
	private static boolean tile18 = false;
	private static boolean tile19 = false;
	private static boolean tile20 = false;
	private static boolean tile21 = false;
	private static boolean tile22 = false;
	private static boolean tile23 = false;
	private static boolean tile24 = false;
	private static boolean tile25 = false;

	// at first, you are in the game
	private static boolean inGame = true;

	// variable for counting the seconds that have passed
	private static double seconds = 0;

	// updates the location of x and y using their velocities
	public static void updateLocations() {
		x += vx;
		y += vy;
	}

	// updates the velocity of the ball when it strikes a vertical or horizontal boundary
	public static void updateVelocities() {

		if (y + radius >= windowHeight) {
			vy = -vy;
		} else if (y - radius <= 0) {
			vy = -vy;
		}

		if (x >= 194 || x <= 6) {
			vx = -vx;
		}

	}

	// method which defines the clean and dirty tiles
	public static void drawSquares() {

		// size of tile
		int squareSize = 20;

		// if the tile has not been passed over, draw a grey square
		if (tile1 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize, squareSize);

			// black border
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize, squareSize);
		}

		// if the tile has been passed over, draw a white sqauare
		if ((x < 40 && y > 160) || tile1 == true) {

			// changes color to white
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize, squareSize);

			// black border
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize, squareSize);

			// marks the tile as being passed over
			tile1 = true;

			// counts the number of milliseconds where the ball is over the tile
			seconds = seconds + 1;
		}

		if (tile2 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize, squareSize);
		}

		if (((x > 40 && x < 80) && y > 180) || tile2 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize, squareSize);

			tile2 = true;

			seconds = seconds + 1;
		}

		if (tile3 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize, squareSize);
		}

		if (((x > 80 && x < 120) && y > 180) || tile3 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize, squareSize);

			tile3 = true;

			seconds = seconds + 1;
		}

		if (tile4 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize, squareSize);
		}

		if (((x > 120 && x < 160) && y > 180) || tile4 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize, squareSize);

			tile4 = true;

			seconds = seconds + 1;
		}

		if (tile5 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize, squareSize);
		}

		if (((x > 160 && x < 200) && y > 180) || tile5 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize, squareSize);

			tile5 = true;

			seconds = seconds + 1;
		}

		if (tile6 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 40, squareSize);
		}

		if ((x < 40 && y < 160 && y > 120) || tile6 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 40, squareSize);

			tile6 = true;

			seconds = seconds + 1;
		}

		if (tile7 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 40, squareSize);
		}

		if ((x > 40 && x < 80 && y < 160 && y > 120) || tile7 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 40, squareSize);

			tile7 = true;

			seconds = seconds + 1;
		}

		if (tile8 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 40, squareSize);
		}

		if ((x > 80 && x < 120 && y < 160 && y > 120) || tile8 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 40, squareSize);

			tile8 = true;

			seconds = seconds + 1;
		}

		if (tile9 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 40, squareSize);
		}

		if ((x > 120 && x < 160 && y < 160 && y > 120) || tile9 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 40, squareSize);

			tile9 = true;

			seconds = seconds + 1;
		}

		if (tile10 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 40, squareSize);
		}

		if ((x > 160 && x < 200 && y < 160 && y > 120) || tile10 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 40, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 40, squareSize);

			tile10 = true;

			seconds = seconds + 1;
		}

		if (tile11 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 80, squareSize);
		}

		if ((x < 40 && y < 120 && y > 80) || tile11 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 80, squareSize);

			tile11 = true;

			seconds = seconds + 1;
		}

		if (tile12 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 80, squareSize);
		}

		if ((x < 80 && x > 40 && y < 120 && y > 80) || tile12 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 80, squareSize);

			tile12 = true;

			seconds = seconds + 1;
		}

		if (tile13 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 80, squareSize);
		}

		if ((x < 120 && x > 80 && y < 120 && y > 80) || tile13 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 80, squareSize);

			tile13 = true;

			seconds = seconds + 1;
		}

		if (tile14 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 80, squareSize);
		}

		if ((x < 160 && x > 120 && y < 120 && y > 80) || tile14 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 80, squareSize);

			tile14 = true;

			seconds = seconds + 1;
		}

		if (tile15 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 80, squareSize);
		}

		if ((x < 200 && x > 160 && y < 120 && y > 80) || tile15 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 80, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 80, squareSize);

			tile15 = true;

			seconds = seconds + 1;
		}

		if (tile16 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 120, squareSize);
		}

		if ((x < 40 && y < 80 && y > 40) || tile16 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 120, squareSize);

			tile16 = true;

			seconds = seconds + 1;
		}

		if (tile17 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 120, squareSize);
		}

		if ((x < 80 && x > 40 && y < 80 && y > 40) || tile17 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 120, squareSize);

			tile17 = true;

			seconds = seconds + 1;
		}

		if (tile18 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 120, squareSize);
		}

		if ((x < 120 && x > 80 && y < 80 && y > 40) || tile18 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 120, squareSize);

			tile18 = true;

			seconds = seconds + 1;
		}

		if (tile19 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 120, squareSize);
		}

		if ((x < 160 && x > 120 && y < 80 && y > 40) || tile19 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 120, squareSize);

			tile19 = true;

			seconds = seconds + 1;
		}

		if (tile20 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 120, squareSize);
		}

		if ((x < 200 && x > 160 && y < 80 && y > 40) || tile20 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 120, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 120, squareSize);

			tile20 = true;

			seconds = seconds + 1;
		}

		if (tile21 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 160, squareSize);
		}

		if ((x < 40 && y < 40 && y > 0) || tile21 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize, windowHeight - squareSize - 160, squareSize);

			tile21 = true;

			seconds = seconds + 1;
		}

		if (tile22 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 160, squareSize);
		}

		if ((x < 80 && x > 40 && y < 40 && y > 0) || tile22 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 40, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 40, windowHeight - squareSize - 160, squareSize);

			tile22 = true;

			seconds = seconds + 1;
		}

		if (tile23 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 160, squareSize);
		}

		if ((x < 120 && x > 80 && y < 40 && y > 0) || tile23 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 80, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 80, windowHeight - squareSize - 160, squareSize);

			tile23 = true;

			seconds = seconds + 1;
		}

		if (tile24 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 160, squareSize);
		}

		if ((x < 160 && x > 120 && y < 40 && y > 0) || tile24 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 120, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 120, windowHeight - squareSize - 160, squareSize);

			tile24 = true;

			seconds = seconds + 1;
		}

		if (tile25 == false) {
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 160, squareSize);
		}

		if ((x < 200 && x > 160 && y < 40 && y > 0) || tile25 == true) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(squareSize + 160, windowHeight - squareSize - 160, squareSize);

			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.square(squareSize + 160, windowHeight - squareSize - 160, squareSize);

			tile25 = true;

			seconds = seconds + 1;
		}

	}

	// draws the ball
	public static void drawBall() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);
	}

	// draws the tiles as well as the ball
	public static void draw() {
		drawSquares();
		drawBall();
	}

	public static void main(String[] args) {

		// 800x800 canvas
		StdDraw.setCanvasSize(600, 600);

		StdDraw.setXscale(0, windowWidth);
		StdDraw.setYscale(0, windowHeight);

		while (true) {
			// if in game, execute the draw, update velocities, and update
			// locations methods
			if (inGame) {
				draw();
				updateVelocities();
				updateLocations();
			} else {
				StdDraw.text(100, 100, "It took you " + seconds / 1000 + " seconds to finish cleaning the room!");
				StdDraw.text(100, 90, "To restart the Roomba simulation, press R.");
			}

			// if all tiles have been cleaned, stop the game
			if (tile1 == true && tile2 == true && tile3 == true && tile4 == true && tile5 == true && tile6 == true
					&& tile7 == true && tile8 == true && tile9 == true && tile10 == true && tile11 == true
					&& tile12 == true && tile13 == true && tile14 == true && tile15 == true && tile16 == true
					&& tile17 == true && tile18 == true && tile19 == true && tile20 == true && tile21 == true
					&& tile22 == true && tile23 == true && tile24 == true && tile25 == true) {
				inGame = false;
			}

			// restarts the simulation after pressing R
			if (StdDraw.isKeyPressed(82)) {

				// sets all tiles equal to false to make the board dirty again
				tile1 = false;
				tile2 = false;
				tile3 = false;
				tile4 = false;
				tile5 = false;
				tile6 = false;
				tile7 = false;
				tile8 = false;
				tile9 = false;
				tile10 = false;
				tile11 = false;
				tile12 = false;
				tile13 = false;
				tile14 = false;
				tile15 = false;
				tile16 = false;
				tile17 = false;
				tile18 = false;
				tile19 = false;
				tile20 = false;
				tile21 = false;
				tile22 = false;
				tile23 = false;
				tile24 = false;
				tile25 = false;

				// x and y positions
				x = 100;
				y = 100;

				// random x and y velocities
				vx = (Math.random() - 0.5) * 4;
				vy = (Math.random() - 0.5) * 6;

				// changes inGame to true
				inGame = true;
			}
			// frames per second
			StdDraw.show(20 );
		}
	}
}