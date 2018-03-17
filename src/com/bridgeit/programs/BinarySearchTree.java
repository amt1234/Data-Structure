/******************************************************************************
 *  Purpose: A palindrome is a string that reads the same forward and backward 
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {

		try {
			Utility utility = new Utility();
			System.out.println("Enter the number of test case.");
			int testcase = utility.inputInteger();
			for (int i = 1; i <= testcase; i++) {
				System.out.println("Enter the number of node.");
				long node = utility.inputInteger();
				long count = utility.find((int) node);
				System.out.println(count);
			}
		} catch (Exception e) {
			System.out.println("exception");
		}
	}

}
