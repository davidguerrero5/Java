//David Guerrero
// insertion sort
public class InsertionSort {
	public static void insertionSort (int[] a) {
		int i = 1;
		int j = 0; 
		int key = 0; 
		while (i < a.length) {
			key = a [i];
			j = i - 1; 
			while (j >= 0) {
				if (a[j] > key) {
					a[j+1] = a[j];
				}
				else {
					a[j+1] = key;
					break;
				}
				j-=1;
			}
			i +=1;
		}
	}

	
	public static void main(String[] args) {
		int[] a = {4, 1, 5, 2, 9, 9, 10, 22, 3, 5, 7, 8, 2, 0, 33, 98, 6};
		insertionSort(a);
		for (int i = 0; i < a.length ; i++) {
			System.out.print(a[i] + ", ");
		}

	}
}
