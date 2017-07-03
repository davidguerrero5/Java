package extracredit;

// David Guerrero

public class SearchInsert {
	public static int searchInsert(int[] arraynumbers, int position) {
	    int i = 0; //sets initial value of i
	    int j = arraynumbers.length-1; // takes into account that the array starts at 0
	 
	    while(i <= j) {
	        int middle = (i + j) / 2; // middle of array 
	 
	        // checks if value is in the array 
	        
	        if(position > arraynumbers[middle]) {
	            i = middle + 1;
	        }
	        else if(position < arraynumbers[middle]) {
	            j = middle - 1;
	        }
	        // returns middle value if other conditions are not met
	        else {
	            return middle;
	        }
	    }
	    return i;
	}
	public static void main(String[]args) {
		int[] a = {1,2,3,4,5,6,7,8};
		
		System.out.println(searchInsert(a,3));
	}
}
