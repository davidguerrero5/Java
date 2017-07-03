/*
 * David Guerrero
 * Code refactored from http://www.cis.upenn.edu/~cis110/13fa/lectures/examples/FractalTree.java
 * 11/7/2016
 * 
 */



import edu.princeton.cs.introcs.StdDraw;

public class Tree {

    public static void main(String[] args) {
    	// used to shorten the amount of time it takes to render
    	StdDraw.enableDoubleBuffering();
        setup();
        // drawing loop
        while(true) {
            draw();
            StdDraw.show(20);
        }
    }
    
    static double scale = 1.8;
    static double leftDeltaAngle = 30;
    static double rightDeltaAngle = 30;
    static int recursiveDepth = 10;
    
    // sets canvas size to 800x800, called at the beginning 
    public static void setup() {
    	StdDraw.setCanvasSize(800,800);
        StdDraw.setXscale(0,100);
        StdDraw.setYscale(0,100);
    }
    
    // draws animation 
    public static void draw() {
        drawTree(50, 0, 90, recursiveDepth, 0);
    }


    static void drawTree(int x, int y, double angle, int depth, int counter) {
        // base case
        if (depth == 0) return;
        
        // compute end coordinate
        double angleRadians = Math.toRadians(angle);
        int x2 = x + (int) (Math.cos(angleRadians) * depth * scale);
        int y2 = y + (int) (Math.sin(angleRadians) * depth * scale);
        
        // increases after the loop runs
        counter = counter + 1;
        
        // changes the pen color to green after the loop iterates 4 or more times, else it's brown
        if (counter > 4) {
        	StdDraw.setPenColor(StdDraw.GREEN);
        }
        else {
        	StdDraw.setPenColor(153,76,0);
        }
        
        StdDraw.setPenRadius(0.01);
        
        //draws beginning trunk
        StdDraw.line(x, y, x2, y2);
        
        // draws all 7 trees
        drawTree(x2, y2, angle - leftDeltaAngle, depth - 1, 0 + counter);
        drawTree(x2, y2, angle - (leftDeltaAngle - 10), depth - 1, 0 + counter);
        drawTree(x2, y2, angle - (leftDeltaAngle - 20), depth - 1, 0 + counter);
        drawTree(x2, y2, angle, depth - 1, 0 + counter);
        drawTree(x2, y2, angle + rightDeltaAngle, depth - 1, 0 + counter);
        drawTree(x2, y2, angle + (rightDeltaAngle - 10), depth - 1, 0 + counter);
        drawTree(x2, y2, angle + (rightDeltaAngle - 20), depth - 1, 0 + counter);


    }
    
}



