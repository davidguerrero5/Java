package GuerreroDavidHomework2;

/*
 * David Guerrero 2/18/2017
 * Babylonian Square Root 
 */
 
public class BabyRoot {
	// the number that is being changed in the method
	private static double testnum = 0;
	// the number that is being square rooted
	private static double targetnum = 0;
	// the amount of error that is tolerated 
	private static double error = 0;
	
	// babylonian square root method
	public static void babyRoot(double num , double err) {
	    testnum = 0.5 * (testnum + (targetnum / testnum));
	    System.out.println("Test number equals: " + testnum);
	    
	    // tests if the number that is being changed lies within the allocated error range
	    if ((testnum >= (Math.sqrt(targetnum) - err)) && (testnum <= (Math.sqrt(targetnum) + err)))
	            System.out.println("The correct square root with accordance to your error equals: " + testnum);
	    else
	        babyRoot(testnum, error);
	}

	public static void main(String[] args) {
		// defining variables
		error = 0.1;
		testnum = 17;
		targetnum = testnum;
		
		// runs recursive method
		babyRoot(testnum, error);
	}

}
