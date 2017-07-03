package Lab7;

import Lab7.Node;

public class NodeList {
	private int size = 0;
	private Node root = null;

	/*
	 * It has to take a new Node and add that to the beginning of the linked
	 * list. If the list is empty, assign it as the "root".
	 * 
	 * @Param - Node
	 */
	public void insertAtBeginning(Node newNode) {

		if (root == null) {
			root = newNode;

		} else {
			Node oldRoot = root;
			root = newNode; 
			root.setNext(oldRoot);

		}
		size++;
	}

	/*
	 * It has to take a Node and remove that node if you find it in the list
	 * from the existing nodes otherwise don't do anything.
	 * 
	 * @return void (if the list is empty, throw an error)
	 */
	public void removeFromBeginning() {

		if (root != null) {
			root = root.getNext();
			size = size - 1;
		}

	}

	/*
	 * It has to return the size of the NodeList
	 * 
	 * @return size 
	 */
	public int size() {
		return size;
	}

	/**
	 * Start with the head and traverse, print till you reach null.
	 */
	public void iterate() {

		Node currentNode = root;

		while (currentNode != null) {
			System.out.println(currentNode);
			currentNode = currentNode.getNext();
		}

	}

}