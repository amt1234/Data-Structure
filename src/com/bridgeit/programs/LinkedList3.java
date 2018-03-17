/******************************************************************************
 *  Purpose:   Implementing linkedlist
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;


class Node2<T>
{
	T data;
	Node2 reference;
	Node2(T data)
	{
		this.data = data;
	}
}
public class LinkedList3
{
	Node2 first;
	Node2 last;
	private int length;
	public <T> void add(T data)
	{
		Node2 element = new Node2(data);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.reference = element;
		}
		last = element;
	}
	public void show()
	{
		Node2 node=first;
		while(node.reference!=null)
		{
			System.out.println(node.data);
			node=node.reference;
		}
		System.out.println(node.data);
	}
	
	public <T> boolean remove(T targrt)
	{
		boolean status = false;
		if((first.data).equals(targrt))
		{
			first = first.reference;
			status = true;
		}
		else if((last.data).equals(targrt))
		{
			Node2 prev= null;
			Node2 current = first;
			while(current.reference != null)
			{
				prev = current;
				current = current.reference;
			}
			last = prev;
			last.reference = null;
			status = true;
		}
		else
		{
			Node2 prev= null;
			Node2 current = first;
			while(current != null && !(status = (current.data.equals(targrt))))
			{
				prev = current;
				current = current.reference;
			}
			if(status)
			{
				prev.reference = current.reference;
			}
		}
		return status;
}
	public  <T> boolean search(T targrt)
	{
		Node2 node=first;
		
		while(node !=null)
		{
		if((node.data).equals(targrt))
		{
			
			return true;
		}
		node=node.reference;
		
		}
		return false;
	}
	
	public void sort(String[][] array) {
		Node2 temp=first;
		
		int i,j;
		
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				
			}
		}
	}
	/*public <T> void sort(T mylist)
	{
		T key;
		int i,j;
		T[] array;
		for(i=1;i<this.length;i++)
		{
			key=array[i];
			for(j=i-1;j>=0 && (((T)key.compareTo (array[j]));j--)
				array[j+1]=array[j];
				array[j+1]=key;
		}
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	*/
	
	
	
}