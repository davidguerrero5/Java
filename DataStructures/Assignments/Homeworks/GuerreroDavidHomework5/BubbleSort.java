package GuerreroDavidHomework5;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	// bubble sort method
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		
		// iterates through the array 
		for (int i = 0; i < n; i++) {
			// for every time j is less than the length of the array minus the amount of times it has iterated 
			for (int j = 1; j < (n - i); j++) {
				// compares each pair of adjacent items and swaps them if they are in the wrong order
				if (arr[j - 1] > arr[j]) {
					// performs the swap 
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// main method
	public static void main(String[] args) {
		Random random = new Random();
		int numbers[] = new int[10];
		
		// populates list with random integers between 1 and 100
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(100);
			numbers[i] = number;
		}

		// prints the array before the sort has been applied
		System.out.println("Array before sort: " + Arrays.toString(numbers));

		bubbleSort(numbers);

		System.out.println("Array after sort: " + Arrays.toString(numbers));
	}
}
