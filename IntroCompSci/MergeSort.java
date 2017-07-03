// David Guerrero
// Merge Sort
package gwat;

import java.util.Arrays;

public class MergeSort {
	  public static int count(int[] a) {
	      int n = a.length;
	      int count = 0;
	      for (int i = 0; i < n; i++) {
	          for (int j = i+1; j < n; j++) {
	              if (a[i] + a[j] == 0) {
	                  count++;
	              }
	          }
	      }
	      return count;
	  } 
	  public static void main(String[] args) {
	    int[] a = {3, 81, -16, -65, 17, 68, -45, 71, 16, 78, 74, 98, 64, -17, 30, 45}; 
	    int count = count(a);
	    System.out.println(count);
	  }
	}

