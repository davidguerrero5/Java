package GuerreroDavidHomework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.*;

/* 
 * David Guerrero 5/6/17
 * 
 * Much of this class is refactored from BST Code found on Github by John Kurlak 
 * Find the source code here: https://github.com/JohnKurlak/Binary-Search-Tree/blob/master/BST.java
 * 
 */

public class BST<T extends Comparable<? super T>> {

	// This class represents a single node in our Binary Tree.
	public class BinaryNode {
		// Local variables
		public T element;
		BinaryNode left;
		BinaryNode right;

		// binary node constructor
		public BinaryNode(T elem) {
			element = elem;
			left = null;
			right = null;
		}

		// binary node with children
		public BinaryNode(T elem, BinaryNode lt, BinaryNode rt) {
			element = elem;
			left = lt;
			right = rt;
		}
	}

	// Local variables
	public BinaryNode root;
	private boolean removalSuccesful;

	// empty binary search tree
	public BST() {
		root = null;
	}

	// checks if binary search tree is empty
	public boolean isEmpty() {
		return (root == null);
	}

	// inserts element into binary search tree
	public boolean insert(T elem) {
		return insert(root, elem);
	}

	public boolean insert(BinaryNode start, T elem) {
		if (start == null) {
			// inserts element into new node
			root = new BinaryNode(elem, null, null);
			return true;
		}

		// compares the current node's element to the element to be deleted
		int comparison = start.element.compareTo(elem);

		// left tree insertion
		if (comparison > 0) {
			if (start.left == null) {
				start.left = new BinaryNode(elem, null, null);
				return true;
			}

			// keep traversing
			return insert(start.left, elem);
		}
		// right tree insertion
		else if (comparison < 0) {
			if (start.right == null) {
				start.right = new BinaryNode(elem, null, null);
				return true;
			}
			// keep traversing
			return insert(start.right, elem);
		}
		else {
			// does not insert element if the element is already in the tree
			return false;
		}
	}

	// deletes element from binary search tree
	public boolean delete(T elem) {
		removalSuccesful = true;
		root = delete(root, elem);
		return removalSuccesful;
	}

	public BinaryNode delete(BinaryNode start, T elem) {
		if (start == null) {
			removalSuccesful = false;
			return null;
		}

		// compares the current node's element to the element we're looking for
		int comparison = start.element.compareTo(elem);

		// left tree deletion
		if (comparison > 0) {
			start.left = delete(start.left, elem);
		}
		// right tree deletion
		else if (comparison < 0) {
			start.right = delete(start.right, elem);
		}
		else {
			// if the node has two children
			if (start.left != null && start.right != null) {
				BinaryNode left = start.left;
				BinaryNode right = start.right;

				start = removeMin(start.right, start);

				BinaryNode minRight = start.right;

				start.left = left;
				start.right = right;

				if (start.right.element == start.element) {
					start.right = minRight;
				}
			}
			else if (start.left == null && start.right == null) {
				// deletes the current node from the tree
				start = null;
			}
			else if (start.left != null) {
				start = start.left;
			}
			else {
				start = start.right;
			}
		}

		return start;
	}

	//This method removes the minimum node that comes after the given starting node
	public BinaryNode removeMin(BinaryNode start, BinaryNode parent) {
		if (start == null) {
			return null;
		}

		if (start.left == null) {
			if (parent != root) {
				parent.left = start.right; 
			}
			return start;
		}

		// traverse using recursion until we get to the minimum node
		return removeMin(start.left, start);
	}

	// tree = empty state
	public void clear() {
		root = null;
	}

	// prints BST
	public void print() {
		print(root);
	}

	public void print(BinaryNode start) {
		if (start != null) {
			print(start.left);
			System.out.println(start.element);
			print(start.right);
		}
	}
	
	public static void sortAndPrint(HashMap map, Scanner file) {
		while (file.hasNext()) {
		      String word = file.next().toLowerCase();
		      
		      if(map.containsKey(word)) {
		        // if we have already seen this word before,
		        // increment its count by one
		        Integer count = (Integer)map.get(word);
		        map.put(word, new Integer(count.intValue() + 1));
		      } else {
		        // unique word, so add it with count of 1
		        map.put(word, new Integer(1));
		      }
		    }
		
			// creates array list from hash map
		    ArrayList arraylist = new ArrayList(map.keySet());
		    
		    // sorts array list alphabetically 
		    Collections.sort(arraylist);
		    
		    // iterates through array list and prints the count of unique words
		    for (int i = 0; i < arraylist.size(); i++) {
		        String key = (String)arraylist.get(i);
		        Integer count = (Integer)map.get(key);
		        System.out.println(key + " " + count);
		      }
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		// creates new binary search tree
		BST tree = new BST();

		// testing the insert method
		tree.insert(10);
		tree.insert(11);
		tree.insert(12);
		// testing the print method
		tree.print();

		// testing the delete method
		System.out.println("--------After deleting 11--------");
		tree.delete(11);
		tree.print();
		
		System.out.println("--------Traversing the file--------");
		// creates new hash map to pass into sort
		HashMap map = new HashMap(); 

	    // read each word from the file
	    Scanner file = new Scanner(new File("sentence.txt"));
	    
	    // sort and prints file
	    sortAndPrint(map, file);
	}
}
