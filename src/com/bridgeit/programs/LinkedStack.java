/******************************************************************************
 *  Purpose:   Implementing linkedstack
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

public class LinkedStack {
	protected Node top;
	protected int size;

	/* Constructor */
	public void linkedStack() {
		top = null;
		size = 0;
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return top == null;
	}

	/* Function to push an element to the stack */
	public <T> void push(T days) {
		Node nodepoint = new Node(days, null);
		if (top == null)
			top = nodepoint;
		else {
			nodepoint.setLink(top);
			top = nodepoint;
		}
		size++;
	}

	/* Function to pop an element from the stack */
	public Object pop() {
		if (isEmpty())
			System.out.println("");
		Node point = top;
		top = point.getLink();
		size--;
		return point.getData();
	}

	/* Function to display the status of the stack */
	public <T> void display() {
		System.out.print("\nStack = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node point = top;
		while (point != null) {
			System.out.print(point.getData() + " ");
			point = point.getLink();
		}
		System.out.println();
	}

}
