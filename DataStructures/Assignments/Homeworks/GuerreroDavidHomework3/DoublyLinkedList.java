/*
 * David Guerrero 3/26/2017
 * 
 */

package GuerreroDavidHomework3;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	// constructs a new DoublyLinkedList object with head and tail as null
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	// returns true if the list is empty, it returns false if it's not empty
	public boolean isEmpty() {
		return head == null;
	}

	// adds char c to end of linked list
	public void addChar(char c) {
		Node n = new Node(tail, c, null);
		if (isEmpty()) {
			head = tail = n;
		} else {
			tail.setNext(n);
			tail = n;
		}
	}

	// deletes entire doubly linked list
	public void deleteList() {
		while (!isEmpty()) {
			if (!isEmpty()) {
				if (head == tail) {
					head = tail = null;
				} else {
					head = head.getNext();
					head.setPrev(null);
				}
			}
		}
	}

	// counts the number of nodes in the list
	public int countNodes() {
		Node cn = head;
		int count = 0;
		while (cn != null) {
			count++;
			cn = cn.getNext();
		}
		return count;
	}

	// finds and deletes a specific node that matches a string
	public boolean deleteChar(char c) {
		Node cn = head;
		while (cn.getC() != c) {
			cn = cn.getNext();
		}

		if (cn != null) {
			if (cn.getPrev() == null) {
				head = cn.getNext();
				if (!isEmpty()) {
					head.setPrev(null);
				}
			} else if (cn.getNext() == null) {
				tail = cn.getPrev();
				if (!isEmpty()) {
					tail.setNext(null);
				}
			} else {
				cn.getPrev().setNext(cn.getNext());
				cn.getNext().setPrev(cn.getPrev());
			}
		}
		return cn != null;
	}

	// returns the list as a string
	public String toString() {
		Node cn = head;
		String str = "";
		while (cn != null) {
			str += cn.getC();
			cn = cn.getNext();
		}
		return str;
	}

	// reverses the list
	public void reverse() {
		Node cn = head;
		Node tmp = null;
		while (cn != null) {
			tmp = cn.getNext();
			cn.setNext(cn.getPrev());
			cn.setPrev(tmp);
			cn = cn.getPrev();
		}
		tmp = head;
		head = tail;
		tail = tmp;
		head.setPrev(null);
		tail.setNext(null);
	}

	// testing
	public static void main(String a[]) {

		// creates doubly linked list
		DoublyLinkedList list = new DoublyLinkedList();

		// adds characters to the list
		list.addChar('d');
		list.addChar('a');
		list.addChar('v');
		list.addChar('i');
		list.addChar('d');
		list.addChar('r');
		list.addChar('u');
		list.addChar('l');
		list.addChar('e');
		list.addChar('s');
		
		// traverses the list forwards and prints
		System.out.println("Traversing the list forwards and printing: ");
		System.out.println(list);

		// returns the amount of nodes in the list
		System.out.println("The amount of nodes in the list are: " + list.countNodes());

		// finds and deletes a specific node that matches a string
		System.out.println("Deleting i from the list...");
		list.deleteChar('i');
		System.out.println(list);

		// returns the amount of nodes in the list
		System.out.println("The amount of nodes in the list are: " + list.countNodes());

		// reversing the list
		System.out.println("Reversing the list...");
		list.reverse();
		System.out.println(list);

		// deleting the entire list
		System.out.println("Deleting list...");
		list.deleteList();

		// returns the amount of nodes in the list after deletion
		System.out.println("The amount of nodes in the list are: " + list.countNodes());

	}

}
