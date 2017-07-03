package GuerreroDavidHomework5;

import java.util.Random;
import java.util.*;
import java.util.Arrays;


public class LinkedList {
	public Node head;
	public int listCount;

	// constructor
	public LinkedList(){
		head = new Node(0);
		listCount = 0;
	}

	// displays the linked list
	public void show(){
		Node current = head;
		while(current.next!=null){
			System.out.print(current.data + ", ");
			current = current.next;
		}
		System.out.println(current.data);
	}

	// adds node to linked list
    public boolean add(int d){
    	Node end = new Node(d);
    	Node current = head;

    	while(current.next != null){
    		current = current.next;
    	}
    	current.next = end;
    	listCount++;
        return true;
    }
    
    // populates list with integers
    public static void populateAndSortList(LinkedList L) {
    	Random random = new Random();
		int numbers[] = new int[10];
		
		// populates list with random integers between 1 and 100
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(100);
			numbers[i] = number;
			// adds each random number to the linked list
			L.add(number);
		}
		System.out.println("Linked List before sorting: ");
		L.show();
		
		System.out.println("Linked List after sorting: ");
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
    }
    
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


    public static void main(String[] args) {

    	// creates new linked list
    	LinkedList list = new LinkedList();
    	
    	// populates list and sorts numbers
    	populateAndSortList(list);
    	
    }

}