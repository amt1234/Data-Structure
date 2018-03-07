package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
public class Parantheses2
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility(); 
		boolean result=false;
		System.out.println("Enter arithmatic expression");
		String str =utility.inputString(); 
		if(str.length()==0) 
		{
			System.out.println("Please Enter the expression.");
		}
		else
		{	
			result =utility.checkValidExpression(str);
			if(result == true) 
			{
				System.out.println("True!! It is valid expression.");
			}
			else
			{
				System.out.println("False!! it is not valid expression");
			
			}
		}
	
	}
	
}
