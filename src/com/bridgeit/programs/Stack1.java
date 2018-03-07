package com.bridgeit.programs;

public class Stack1
{

	int top=0;
	
	Character stk[]=new Character[5];
	public void push(char data)
	{
		stk[top]=data;
		top++;
		
	}
	public void pop()
	{
		top--;
		char temp=stk[top];
		stk[top]=0;
		
		//System.out.println(temp);
		
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public void show()
	{
		for(int n:stk)
		{
			System.out.println(n+ " ");
		}
	}
}
