/******************************************************************************
 *  Purpose:Extend the Prime Number Program and store only the numbers in that range that are Anagrams.
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.util.ArrayList;
import com.bridgeit.utility.Utility;

public class AnagramPrime
{
	public static void main(String[] args) 
	{
		
			Utility utility = new Utility();
			
			ArrayList<Integer> primeArray = utility.primeNumbers(0, 1000);
			ArrayList<Integer> anagarmArray = new ArrayList<Integer>(); 
			System.out.println();
			anagarmArray =utility.findAnagram(primeArray,anagarmArray);
			ArrayList<Integer> arrayd=utility.printArrayElement(primeArray, anagarmArray);
			utility.print2DArray(arrayd);
	}
	
}
