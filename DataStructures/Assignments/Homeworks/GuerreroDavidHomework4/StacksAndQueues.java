/*
 * David Guerrero 4/9/2017
 */

package GuerreroDavidHomework4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {

	// views first item in a stack
	public static void peekStack(Stack st) {
		String a = (String) st.peek();
		System.out.println("Peek: " + a);
	}
	
	// views first item in a queue
	public static void peekQueue(Queue queue) {
		String a = (String) queue.peek();
		System.out.println("Peek: " + a);
	}
	
	// adds item to stack
	public static void push(Stack st, String a) {
		st.push(new String(a));
		System.out.println("Push: " + a);
	}

	// removes top item from stack
	public static String pop(Stack st) {
		System.out.print("Pop: ");
		String a = (String) st.pop();
		System.out.println(a);

		return a;
	}

	// adds item to queue
	public static void enqueue(Queue queue, String word) {
		queue.add(word);
		System.out.println("Enqueue: " + word);
	}

	// removes the next string element in the queue
	public static String dequeue(Queue queue) {
		String removed = (String) queue.remove();
		System.out.println("Dequeue: " + removed);

		return removed;
	}

	/*
	 * Enqueues each item from the stack to a queue such that if I were to pop
	 * and print all of the items from the stack and dequeue and print all the
	 * items from the queue it would print the same thing.
	 */
	public static void stackToQueue(Stack<String> stack, Queue<String> queue) {

		while (!stack.isEmpty()) {
			enqueue(queue, pop(stack));
		}
	}

	/*
	 * Moves all the contents of a queue to a stack. Maintains order such that
	 * if I were to pop and print of the items from the stack and dequeue and
	 * print all the items from the queue it would print the same thing.
	 */
	public static void queueToStack(Stack<String> stack, Queue<String> queue) {

		// temporary stack
		Stack<String> tempstack = new Stack<String>();

		// iterates through the queue and adds each item to a temporary stack
		while (!queue.isEmpty()) {
			push(tempstack, queue.peek());
			dequeue(queue);
		}

		// transfers the items from the temporary stack to the destination stack
		while (!tempstack.isEmpty()) {
			push(stack, pop(tempstack));
		}

	}

	/*
	 * Moves the contents of a stack to another stack. Maintains order such that
	 * if I were to pop and print the items of both stacks, they would print the
	 * same thing.
	 */
	public static void stackToStack(Stack<String> stack, Stack<String> stack2) {

		// temporary stack
		Stack<String> tempstack = new Stack<String>();

		// transfers all item from the first stack to a temporary stack
		while (!stack.isEmpty()) {
			push(tempstack, pop(stack));
		}

		// transfers all of the items from the temporary stack to the second
		// stack
		while (!tempstack.isEmpty()) {
			push(stack2, pop(tempstack));
		}

	}

	// testing
	public static void main(String a[]) {

		// QUESTION 1
		System.out.println("-------------------------------------");
		System.out.println("Question 1 Below: ");
		System.out.println("-------------------------------------");

		// creates a new stack and queue
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();

		// adds 3 items to stack
		push(stack, "1");
		push(stack, "2");
		push(stack, "3");
		
		// starting stack
		System.out.println("Starting Stack: " + stack);

		// transfers a stack to a queue while maintaining the same order
		stackToQueue(stack, queue);

		/*
		 * If I were to pop and print all of the items from the stack and
		 * dequeue and print all the items from the queue it would print the
		 * same thing.
		 */
		System.out.println("Ending Queue: " + queue.toString());
		System.out.println("Ending Stack: " + stack.toString());
		System.out.println("-------------------------------------");

		// QUESTION 2
		System.out.println("Question 2 Below: ");
		System.out.println("-------------------------------------");
		Queue<String> queueToTransfer = new LinkedList<String>();
		Stack<String> queueTransferStack = new Stack<String>();

		// adding three items to the queue
		enqueue(queueToTransfer, "100");
		enqueue(queueToTransfer, "101");
		enqueue(queueToTransfer, "102");

		// starting queue
		System.out.println("Starting Queue: " + queueToTransfer.toString());

		// transfers a queue to a stack while maintaining the same order
		queueToStack(queueTransferStack, queueToTransfer);

		/*
		 * If I were to pop and print of the items from the stack and dequeue
		 * and print all the items from the queue it would print the same thing.
		 */
		System.out.println("Ending Stack: " + queueTransferStack);
		System.out.println("Ending Queue: " + queueToTransfer);
		System.out.println("-------------------------------------");

		// QUESTION 3
		System.out.println("Question 3 Below: ");
		System.out.println("-------------------------------------");

		// creates two stacks, a primary stack and a secondary stack
		// the secondary stack needs to be identical to the first one
		Stack<String> primarystack = new Stack<String>();
		Stack<String> secondarystack = new Stack<String>();

		// adding items to primary stack
		push(primarystack, "First");
		push(primarystack, "Second");
		push(primarystack, "Third");

		// primary stack
		System.out.println("Starting Primary Stack: " + primarystack);

		// transfers a stack to another stack while maintaining the same order
		// (they will end up being identical)
		stackToStack(primarystack, secondarystack);

		/*
		 * I were to pop and print the items of both stacks, they would print
		 * the same thing.
		 */
		System.out.println("Ending Secondary Stack: " + secondarystack);
		System.out.println("Ending Primary Stack: " + primarystack);
		System.out.println("-------------------------------------");

	}

}
