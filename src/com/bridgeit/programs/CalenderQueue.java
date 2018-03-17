/******************************************************************************
 *  Purpose:   takes the month and year as input and prints the Calendar of the month.
 *  		 Store the Calendar in an 2D Array using queue.
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter the month");
		int month = utility.inputInteger();
		System.out.println("Enter the year");
		int year = utility.inputInteger();
		utility.calenderQueue(month, year);
	}

}
