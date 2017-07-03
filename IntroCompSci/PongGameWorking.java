package pong;

import edu.princeton.cs.introcs.StdDraw;

public class PongGameWorking {
	
	private static int paddleWidth = 10;
	private static int paddleHeight = 40;
	
	private static int windowWidth = 200;
	private static int windowHeight = 200;
	
	private static double x = 100;
	private static double y = 100;
	private static double vx = 2;
	private static double vy = 4;
	private static int radius = 10;
	
	private static int leftPaddle = 100;
	private static int rightPaddle = 100;
	
	private static boolean inGame = true;
	
	public static void drawPaddle(int xLocation, int yLocation) {
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledRectangle(xLocation, yLocation, paddleWidth / 2, paddleHeight / 2);
	}
	
	public static void updateLocations() {
		x += vx;
		y += vy;
	}
	
	public static void updateVelocities() {
		
		
		if (x + vx + radius >= windowWidth - paddleWidth && vx > 0 && (y >= rightPaddle - paddleHeight/2 && y <= rightPaddle + paddleHeight/2)) {		
			vx = - vx;
		} else if (x + vx - radius <= paddleWidth && vx < 0 && (y >= leftPaddle - paddleHeight/2 && y <= leftPaddle + paddleHeight/2)) {
			vx = - vx;
		}
		
		if (y + radius >= windowHeight) {
			vy = - vy;
		} else if (y - radius <= 0) {
			vy = - vy;
		}
		
	}
	
	public static void setBackground() {
		StdDraw.clear(StdDraw.YELLOW);
	}
	
	public static void drawBall() {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, radius);
		
	}
	
	public static void drawPaddles() {
		drawPaddle(paddleWidth/2, leftPaddle);
		drawPaddle(windowWidth - paddleWidth/2, rightPaddle);
	}
	
	public static void draw() {
		setBackground();
		drawBall();
		drawPaddles();
	}
	
	public static void main(String[] args) {
		StdDraw.setCanvasSize(800, 800);
		
		StdDraw.setXscale(0, windowWidth);
		StdDraw.setYscale(0, windowHeight);
		
		
		while (true) {
			if (inGame) {
				draw();

				updateVelocities();
				updateLocations();
			} else {
				StdDraw.text(100, 100, "Game Over");
			}
			
			if (x + radius > windowWidth || x - radius < 0) {
				inGame = false;
			}
			
			if (StdDraw.isKeyPressed(65) && leftPaddle < windowHeight - paddleHeight/2) {
				leftPaddle += 10;
			}
			if (StdDraw.isKeyPressed(90) && leftPaddle > paddleHeight/2) {
				leftPaddle -= 10;
			}
			if (StdDraw.isKeyPressed(75) && rightPaddle < windowHeight - paddleHeight/2) {
				rightPaddle += 10;
			}
			if (StdDraw.isKeyPressed(77) && rightPaddle > paddleHeight/2) {
				rightPaddle -= 10;
			}
			if (StdDraw.isKeyPressed(82)) {
				x = 100;
				y = 100;
				vx = (Math.random() - 0.5) * 4;
				vy = (Math.random() - 0.5) * 6;
				inGame = true;
			}
			StdDraw.show(20);
		}
	}
}