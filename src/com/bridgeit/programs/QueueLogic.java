/******************************************************************************
 *  Purpose: create Queue implementation
 
 *  @author  Poonam
 *  @version 1.0
 *  @since   07-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import java.util.NoSuchElementException;

public class QueueLogic 
{
	public Node front, rear;
	public int size;
		 	
	public QueueLogic()
	{
		 front = null;
		 rear = null;
		 size = 0;
	}    
		    
	/*  Function to check if queue is empty */
	public boolean isEmpty()
	{
		   return front == null;
	}   
		    
	/*  Function to get the size of the queue */
	public int getSize()
	{
		    return size;
	}    
		    
	/*  Function to insert an element to the queue */
	public void insert(int data)
	{
		Node node = new Node(data, null);
		if (rear == null)
		{
		         front = node;
		         rear = node;
		}
		else
		{
		         rear.setLink(node);
		         rear = rear.getLink();
		}
		        size++ ;
	}   
		    
		  /*  Function to remove front element from the queue */
	public Object remove()
	{
		    if (isEmpty())
			{
		        throw new NoSuchElementException("Underflow Exception");
			}
		    Node ptr = front;
		    front = ptr.getLink();        
		    if (front == null)
			{
		          rear =null;
			}   
		    size-- ; 
		    return ptr.getData();
	}    
		    
		    /*  Function to check the front element of the queue */
	public Object peek()
	{
		    if (isEmpty())
		    {
		          throw new NoSuchElementException("Underflow Exception");
			}
		        return front.getData();
	}    
		    
		    /*  Function to display the status of the queue */
	public void display()
	{  
			int ptr1=0;
		    System.out.print("Available Balance = ");
		    if (size == 0)
		    {
		          System.out.print("Empty");
		          return ;
		    }
		    Node ptr = front;
		    while (ptr != rear.getLink() )
		    { 
		    	ptr1=ptr1 + ptr.getData();
		       // System.out.println(ptr1);
		        ptr = ptr.getLink();
		    }
		    System.out.println(ptr1);
		    System.out.println();        
		    }

		}

