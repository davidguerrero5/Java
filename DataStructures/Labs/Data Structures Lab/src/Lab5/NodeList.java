package Lab5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NodeList {
	private int size = 0;
	private Node root = null;

	/*
	 * It has to take a new Node and add that to the next address of previous
	 * Node. If the list is empty, assign it as the "root"
	 * 
	 * @Param - Node
	 */
	public void add(Node node) {
		if (root == null) {

			root = node;

		} else {

			Node currentNode = root;

			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);


		}

	}

	/*
	 * It has to return the size of the NodeList
	 * 
	 * @return size
	 */
	public int size() {
		int counter = 0;
		Node currentNode = root;

		while (currentNode != null) {

			currentNode = currentNode.getNext();
			counter++;

		}

		return counter;

	}

	/*
	 * It has to take a Node and checks if the node is in the list. If it finds
	 * the node, it returns true, otherwise false
	 * 
	 * @param - Node
	 * 
	 * @return boolean true/false
	 */
	public boolean findNode(Node node) {

		if (root.getNext() == node) {
			return true;
		} else {
			return false;
		}

	}

}
