/******************************************************************************
 *  Purpose: 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
				
		ArrayList<Integer> array =utility.primeNumbers(0, 1000);
		utility.print2DArray(array);
	}
}

		
				
	


