/******************************************************************************
 *  Purpose: Read the Text from a file, split it into words and arrange it as Linked List. 
 *  		Take a user input to search a Word in the List.
 *   		If the Word is not found then add it to the list, and if it found then remove the word from the List. 
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.bridgeit.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		File file = new File("OrderedList.txt");
		Scanner scanner = new Scanner(file);

		LinkedList3 mylist = new LinkedList3();
		Integer string = null;
		while (scanner.hasNext()) {
			string = scanner.nextInt();
			mylist.add(string);
		}
		scanner.close();

		mylist.show();
		
		System.out.println("enter target key");
		Integer target = utility.inputInteger();
		mylist.search(target);
		if (mylist.search(target)) {
			System.out.println("element is found and delete it");
			mylist.remove(target);
		} else {
			System.out.println("element is not found and add it");
			mylist.add(target);
		}
		mylist.show();
	}

}
