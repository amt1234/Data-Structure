/******************************************************************************
 *  Purpose: Node for queue mantain
 
 *  @author  Poonam
 *  @version 1.0
 *  @since   07-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class Node
{
	 protected Object data;
	 protected Node link;
		 
		/*  Constructor  */
	public Node()
	{
		   link = null;
		   data = 0;
	}    
		 /*  Constructor  */
	public Node(Object data2,Node n)
	{
		   data = data2;
		   link = n;
	}    
	/*  Function to set link to next Node  */
	public void setLink(Node n)
	{
		   link = n;
	}    
	/*  Function to set data to current Node  */
	public void setData(int d)
	{
		    data = d;
	}    
	 /*  Function to get link to next node  */
	public Node getLink()
	{
		    return link;
	}    
	/*  Function to get data from current Node  */
	 public <T> int getData()
	{
		    return (int) data;
	}
}
