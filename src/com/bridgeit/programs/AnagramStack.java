/******************************************************************************
 *  Purpose:Extend the Prime Number Program and store only the numbers in that range that are Anagrams using stack.
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   09-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class AnagramStack {

public static void main(String[] args) 
	{
		Utility utility = new Utility();
		LinkedStack linkedstack = new LinkedStack();  
		
		ArrayList<Integer> primeArray = utility.primeNumbers(0, 1000);
		ArrayList<Integer> anagarmArray = new ArrayList<Integer>(); 
		System.out.println();
		anagarmArray =utility.findAnagram(primeArray,anagarmArray);
		ArrayList<Integer> arrayd=utility.printArrayElement(primeArray, anagarmArray);
	
		for(int element:arrayd)
		{
			linkedstack.push(element);
			
		}
		linkedstack.display();
		
	}

}