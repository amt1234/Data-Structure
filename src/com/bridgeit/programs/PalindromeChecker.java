/******************************************************************************
 *  Purpose: A palindrome is a string that reads the same forward and backward 
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.programs;

import java.util.ArrayDeque;
import com.bridgeit.utility.Utility;

public class PalindromeChecker {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the string");
		String string = utility.inputString();
		String reverse = "";
		ArrayDeque<Character> array = new ArrayDeque<Character>();
		utility.insertChar(string, array);
		reverse = Utility.popChar(array, reverse);
		Utility.checkPalindrom(string, reverse);
	}
}
