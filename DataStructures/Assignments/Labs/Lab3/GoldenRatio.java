package Lab3;

public class GoldenRatio {
	
	public static int exp(int pow, int num) {
	    if (pow < 1) 
	        return 1; 
	    else
	        return num * exp(pow-1, num);
	}

	public static double golden(int n) {
		if (n == 0)
			return 1;

		return 1.0 + 1.0 / golden(n - 1);
	}

	public static boolean member(int num, int A[]) {
		if (num == A[0]) {
			return true;
		}
		else {
			if (A.length == 1) {
				return false;
			}
			int B[] = new int[A.length - 1];
			System.arraycopy(A, 1, B, 0, B.length);
			return member(num, B);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(exp(2,5));
		
		int n = 100;
		System.out.println("The golden ratio of " + n + " is: " + golden(n));

		int x[] = { 5, 6, 7, 8, 11, 25, 135, 256, 1875, 1254 };

		System.out.println("Testing if 25 is a member: " + member(25,x));

		System.out.println("Testing if 109 is a member:  " + member(109,x));
	}

}
