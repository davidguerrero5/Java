/*
 * David Guerrero 3/26/2017
 * 
 */

package GuerreroDavidHomework3;

public class Node {
	private Node prev;
	private Node next;
	private char c;

	// constructor
	public Node() {
		this(null, '\0', null);
	}

	public Node(char ch) {
		this(null, ch, null);
	}

	public Node(Node p, char ch, Node n) {
		prev = p;
		next = n;
		c = ch;
	}

	// returns current node
	public char getC() {
		return c;
	}

	// pointer to next node
	public Node getNext() {
		return next;
	}

	// previous node
	public Node getPrev() {
		return prev;
	}

	// changes value of current node
	public void setC(char ch) {
		c = ch;
	}

	// sets the next value of current node
	public void setNext(Node n) {
		next = n;
	}

	// sets previous value of current node
	public void setPrev(Node p) {
		prev = p;
	}

	// converts the character to a string
	public String toString() {
		return Character.toString(c);
	}
}