//David Guerrero

package pong;

//I refactored and improved a working pong program for this assignment. It can be found here: http://www.cs.bc.edu/~muller/teaching/cs101/f11/dist/code/Pong.java

// This code is not fully functional

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class PongGameExtraCredit {
	public static final double PADDLEWIDTH = 0.04;
	public static final double PADDLEHEIGHT = 0.2;
	public static final double PADDLEMOVE = 0.05;

	public static double paddleY = 0.8; // starting position of paddle 1
	public static double paddleY2 = -0.8; // starting position of paddle 2

	public static void main(String[] args) {
		// set the scale of the coordinate system
		//
		StdDraw.setXscale(-1.0, 1.0); // x scale of coordinate system
		StdDraw.setYscale(-1.0, 1.0); // y scale of coordinate system
		pong(); // calls pong method
	}

	public static void pong() {

		double paddleX = -0.96; // x position of first paddle
		double paddleX2 = 0.96; // x position of second paddle

		// colors of ball and paddle
		java.awt.Color ballColor = StdDraw.BLACK, paddleColor = StdDraw.BLUE; 

		// initial values for the ball.
		//
		double positionX = 0, positionY = 0; // position
		double velocityX = -0.009, velocityY = 0.007; // velocity
		double radius = 0.05; // radius

		int score = 0;
		// main animation loop
		//
		while (true) {
			// when a user quits the game
			if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
				StdDraw.text(0, 0, "You have quit the game. Your score is " + score + ".");
				StdDraw.show();
				break;
			}
			
			if (positionY > 0.96 || positionY < -0.96) {
				velocityY = -velocityY;
			}
			if (positionX > 0.96 || positionX < -0.96) {
				break;
			}

			// Are we at the height of the paddles?
			//
			if (positionY < paddleY + PADDLEHEIGHT || positionY > paddleY2 + PADDLEHEIGHT) {
				if (ballHitsPaddle(positionX, velocityX, paddleX, PADDLEWIDTH)) {
					score++;
					velocityX = -velocityX;
					
					// increases velocity of ball based on score
                    velocityY = velocityY * (1 + score / 100.0);
                    velocityX = velocityX * (1 + score / 100.0);
				}
				if (ballHitsPaddle(positionX, velocityX, paddleX2, PADDLEWIDTH)) {
					score++;
					velocityX = -velocityX;
					
					// increases velocity of ball based on score
                    velocityY = velocityY * (1 + score / 100.0);
                    velocityX = velocityX * (1 + score / 100.0);
				}
			} else if (positionX > 0.96 || positionX < -0.96) { // ends game when ball hits vertical boundary
				StdDraw.text(0, 0, "Your score is " + score);
				StdDraw.show();
				break;
			}
			// update position of the ball.
			//
			positionX = positionX + velocityX;
			positionY = positionY + velocityY;
			StdDraw.show();

			// keys move paddles up or down
			if (StdDraw.isKeyPressed(KeyEvent.VK_Z)) {
				paddleY = paddleY - PADDLEMOVE;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
				paddleY = paddleY + PADDLEMOVE;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_K)) {
				paddleY2 = paddleY2 + PADDLEMOVE;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_M)) {
				paddleY2 = paddleY2 - PADDLEMOVE;
			}
			// update position of paddle
			//

			// ensures that paddles do not leave canvas area
			paddleY = Math.min(1.0 - PADDLEHEIGHT, Math.max(-1 + PADDLEHEIGHT, paddleY));
			paddleY2 = Math.min(1.0 - PADDLEHEIGHT, Math.max(-1 + PADDLEHEIGHT, paddleY2));

			// clear the background
			clear();

			// render the ball and the paddle.
			//
			renderBall(positionX, positionY, radius, ballColor);
			renderPaddle1(paddleX, PADDLEWIDTH, PADDLEHEIGHT, paddleColor);
			renderPaddle2(paddleX2, PADDLEWIDTH, PADDLEHEIGHT, paddleColor);

			// display and pause for 20 ms
			StdDraw.show(20);
		}
	}

	public static boolean ballHitsPaddle(double positionX, double velocityX, double px, double pw) {

		return (positionX + velocityX > px - pw) && (positionX + velocityX < px + pw);
	}

	public static void renderBall(double x, double y, double radius, java.awt.Color color) {

		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(StdDraw.WHITE); // color of the outline of the ball
		StdDraw.circle(x, y, radius);
	}

	public static void renderPaddle1(double x, double width, double height, java.awt.Color color) {

		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(x, paddleY, width, height);
		StdDraw.setPenColor(StdDraw.BLACK); // color of the outline of the
											// paddle
		StdDraw.rectangle(x, paddleY, width, height);
	}

	public static void renderPaddle2(double x, double width, double height, java.awt.Color color) {

		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(x, paddleY2, width, height);
		StdDraw.setPenColor(StdDraw.BLACK); // color of the outline of the
											// paddle
		StdDraw.rectangle(x, paddleY2, width, height);
	}

	public static void clear() {
		StdDraw.clear(StdDraw.WHITE); // white background
	}

}
