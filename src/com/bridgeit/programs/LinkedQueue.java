/******************************************************************************
 *  Purpose:   Implementing linkedQueue
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

public class LinkedQueue {

	protected Node front, rear;
	public int size;

	/* Constructor */
	public void linkedQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == null;
	}

	/* Function to insert an element to the queue */
	public void insert(int data) {
		Node nodepoint = new Node(data, null);
		if (rear == null) {
			front = nodepoint;
			rear = nodepoint;
		} else {
			rear.setLink(nodepoint);
			rear = rear.getLink();
		}
		size++;
	}

	/* Function to remove front element from the queue */
	public Object remove() {
		if (isEmpty())
			System.out.println(" ");
		Node point = front;
		front = point.getLink();
		if (front == null)
			rear = null;
		size--;
		return point.getData();
	}

	/* Function to display the status of the queue */
	public void display() {
		System.out.print("\nQueue = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node point = front;
		while (point != rear.getLink()) {
			System.out.print(point.getData() + " ");
			point = point.getLink();
		}
		System.out.println();
	}
}
