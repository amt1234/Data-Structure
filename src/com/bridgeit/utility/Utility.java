/******************************************************************************
 *  Purpose: Data Structure programs utility
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import com.bridgeit.programs.LinkedStack;
import com.bridgeit.programs.Stack1;

public class Utility {

	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @param list
	 * @param search
	 * @return Determine that search word is found or not
	 */
	public static <T> void searchWord(List<T> list, T search) {

		if (list.contains((T) search)) {
			System.out.println("element is found in list and delete it");
			list.remove(search);
			System.out.println(list);
		} else {
			System.out.println("element is not found in list and add it");
			list.add(search);
			System.out.println(list);
		}
	}

	/**
	 * @param year
	 * @return true or false determine year is leap or not
	 */
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;

	}

	/**
	 * @param m
	 * @param d
	 * @param y
	 * @return find the day of weeks value
	 */
	public int dayOfWeek(int m, int d, int y) {
		int y0, x, m0, d0;
		y0 = (int) (y - (14 - m) / 12);
		x = (int) (y0 + (y0 / 4) - (y0 / 100) + (y0 / 400));
		m0 = (int) (m + 12 * ((14 - m) / 12) - 2);
		d0 = (int) ((d + x + ((31 * m0) / 12)) % 7);
		return d0;
	}

	/**
	 * @param string
	 * @return boolean checking expression is valid or not
	 */
	public boolean checkValidExpression(String string) {
		int count = 0;
		Stack1 stack = new Stack1();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(') {
				stack.push(string.charAt(i));
				count++;
			}

			if (string.charAt(i) == ')') {
				if (stack.isEmpty()) {
					count--;
				} else {
					stack.pop();
					count--;
				}
			}
		}
		if (stack.isEmpty() && count == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param array
	 *            from user as list of elements to perform insertion sorting
	 */
	public <T extends Comparable> void printInsertion(T[] array) {

		T key;
		int i, j;
		for (i = 1; i < array.length; i++) {
			key = array[i];
			for (j = i - 1; j >= 0 && (key.compareTo(array[j])) < 0; j--)
				array[j + 1] = array[j];
			array[j + 1] = key;
		}
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * @param start
	 * @param limit
	 * @return Find the prime numbers
	 */
	public ArrayList<Integer> primeNumbers(int start, int limit) {
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 2; i <= limit; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primeNumbersList.add(i);
			}
		}
		return primeNumbersList;
	}

	/**
	 * @param array
	 *            To store arraylist in 2D format
	 */
	public <T> void print2DArray(ArrayList<T> array) {
		int[][] array1 = new int[10][25];
		int check = 0;
		int i = 0;
		int j = 0;
		Iterator<Integer> iterator = (Iterator<Integer>) array.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			int quotient = element / 100;
			if (quotient != check) {
				check = quotient;
				i++;
				j = 0;
			}
			array1[i][j++] = element;
		}
		for (int m = 0; m < array1.length; m++) {
			for (int n = 0; n < array1[m].length; n++) {
				if (array1[m][n] == 0) {
					System.out.print(" ");
				} else {
					System.out.print(array1[m][n] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @param primenumbers
	 * @return to find anagram number from prime numbers
	 */
	public ArrayList<Integer> findAnagram(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray,
			ArrayList<Integer> primenumbers) {
		System.out.println("Anagram numbers");
		for (Integer element : primeArray) {
			String string = Integer.toString(element);
			int last = string.length();
			anagarmArray = permute(anagarmArray, string, 0, last - 1);
		}
		for (Integer element : primeArray) {
			String string = Integer.toString(element);
			if (anagarmArray.contains(string)) {
				anagarmArray.remove(string);
			}
		}

		for (Integer element : primenumbers) {
			String string = Integer.toString(element);
			if (anagarmArray.contains(string)) {
				anagarmArray.remove(string);
			}
		}
		return anagarmArray;
	}

	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @return to print array element
	 */
	public ArrayList<Integer> printArrayElement(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray) {
		ArrayList<Integer> anagram = new ArrayList<Integer>();

		for (Integer element : primeArray) {
			String string = Integer.toString(element);
			if (anagarmArray.contains(string)) {
				anagram.add(Integer.parseInt((String) string));
			}
		}
		return anagram;

	}

	/**
	 * @param anagarmArray
	 * @param string
	 * @param start
	 * @param last
	 * @return permutation
	 */
	public static <T> ArrayList<Integer> permute(ArrayList anagarmArray, T string, int start, int last) {
		if (start == last) {
			anagarmArray.add(string);
		} else {
			for (int i = start; i <= last; i++) {
				string = (T) swap(string, start, i);
				permute(anagarmArray, string, start + 1, last);
				string = (T) swap(string, start, i);
			}
		}
		return anagarmArray;

	}

	/**
	 * @param string1
	 * @param first
	 * @param second
	 * @return function to swap charactor in string
	 */
	public static <T> String swap(T string1, int first, int second) {
		char temp;
		char[] charArray = ((String) string1).toCharArray();
		temp = charArray[first];
		charArray[first] = charArray[second];
		charArray[second] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param array
	 * @return palindrom number
	 */
	public static ArrayList palindromNumber(Integer[] array) {
		ArrayList primenumbers = new ArrayList();
		System.out.println("palindrome prime numbers are:");
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			int temp = num;
			int sum = 0;
			while (temp != 0) {
				int rem = temp % 10;
				sum = (sum * 10) + rem;
				temp = temp / 10;
			}
			if (num == sum) {
				primenumbers.add(num);
			}
		}
		return primenumbers;
	}

	/**
	 * @param number
	 * @return extend Palindrome
	 */
	public <T> void extened(Integer number) {
		int reminder = 0, sum = 0;
		int temp = number;

		while (number > 0) {
			reminder = number % 10;
			number = number / 10;
			sum = sum * 10 + reminder;
		}

		if (temp == sum) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrom");
		}

	}

	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @return find Anagram
	 */
	public ArrayList<Integer> findAnagram(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray) {
		System.out.println("Anagram numbers");
		for (Integer element : primeArray) {
			String string = Integer.toString(element);
			int l = string.length();
			anagarmArray = permute(anagarmArray, string, 0, l - 1);
		}
		for (Integer element : primeArray) {
			String string = Integer.toString(element);
			if (anagarmArray.contains(string)) {
				anagarmArray.remove(string);
			}
		}

		return anagarmArray;
	}

	/**
	 * @param string
	 * @param array
	 *            insert character in arrayDeque
	 */
	public void insertChar(String string, ArrayDeque array) {
		for (int i = 0; i < string.length(); i++) {
			array.addLast(string.charAt(i));
		}
	}

	/**
	 * @param array
	 * @param reverse
	 * @return poping each charcter from quque from rare end and append to rev
	 *         string
	 */
	public static String popChar(ArrayDeque<Character> array, String reverse) {
		while (!array.isEmpty()) {
			reverse += array.removeLast();
		}
		return reverse;
	}

	/**
	 * @param string
	 * @param reverse
	 *            checking given string is palindrom or not
	 */
	public static void checkPalindrom(String string, String reverse) {
		if (string.equals(reverse)) {
			System.out.println("Given string is palindrome.");
		} else {
			System.out.println("Given string is not palindome");
		}
	}

	/**
	 * @param month
	 * @param year
	 *            calender in 2D
	 */
	public void calender(int month, int year) {
		String months[] = { "", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println("      " + months[month] + "     " + year);
		int result = (dayOfWeek(month, 1, year));
		int mont = days[month];
		int column = mont + 1;
		int rows = 8;
		String array[][] = new String[rows][column];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				array[i][j] = "  ";
			}

		}
		array[0][0] = "s";
		array[0][1] = "m";
		array[0][2] = "t";
		array[0][3] = "w";
		array[0][4] = "th";
		array[0][5] = "f";
		array[0][6] = "sa";
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("\t " + array[i][j]);

			}

		}
		System.out.println();
		try {
			for (int i = 0; i < result; i++) {
				for (int k = 0; k < result; k++) {
					System.out.print("\t ");
				}
				for (int j = 1; j <= column; j++) {
					array[i][j] = Integer.toString(j);
					System.out.print("\t " + array[i][j]);

					if (((j + result) % 7 == 0) || (j == column)) {
						System.out.println();
					}
				}
			}

		}

		catch (Exception e) {
			System.out.println(" ");
		}
	}

	/**
	 * @param month
	 * @param year
	 *            calender using queue
	 */
	public void calenderQueue(int month, int year) {

		Queue weekday = new LinkedList<>();

		String months[] = { "", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println("      " + months[month] + "     " + year);
		int result = (dayOfWeek(month, 1, year));
		int mont = days[month];
		int column = mont + 1;
		int numberOfObject;
		int date = 0;
		if (days[month] + result > 35) {
			numberOfObject = 6;
		} else {
			numberOfObject = 5;
		}
		for (int i = 0; i < numberOfObject; i++) {
			weekday.add(new LinkedList<>());
		}
		for (int i = 0; i < numberOfObject; i++) {
			Queue queue = (Queue) weekday.poll();
			if (i == 0) {
				for (int j = 0; j < result; j++) {
					queue.add(" ");
				}
				for (int j = result; j < 7; j++) {
					queue.add(++date);
				}
			} else {
				for (int j = 0; j < 7; j++) {
					queue.add(++date);
					if (date == days[month]) {
						break;
					}
				}

			}
			weekday.add(queue);
		}

		System.out.println("SUN" + "\t" + "M" + "\t" + "TU" + "\t" + "WED" + "\t" + "TH" + "\t" + "FRI" + "\t" + "SAt");

		System.out.println();
		try {

			for (int k = 0; k < result; k++) {
				System.out.print("\t ");
			}

			for (int j = 1; j < column; j++) {

				System.out.print(j + "\t");

				if (((j + result) % 7 == 0) || (j == column)) {
					System.out.println();
				}
			}

		} catch (Exception e) {
			System.out.println(" ");
		}
	}

	/**
	 * @param month
	 * @param year
	 *            calender using stack
	 */
	public void calenderStack(int month, int year) {

		LinkedStack monthstack = new LinkedStack();
		LinkedStack day = new LinkedStack();
		Utility utility = new Utility();

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 0; i < months.length; i++) {
			monthstack.push(months[i]);
		}
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && isLeapYear(year)) {
			days[month] = 29;
		}
		for (int i = 0; i < days.length; i++) {
			day.push(days[i]);
		}
		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");
		int d = dayOfWeek(month, 1, year);
		for (int i = 0; i < d; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))
				System.out.println();
		}

	}

	/**
	 * @throws FileNotFoundException
	 * @ hashing for search slot elements
	 */
	public void hashingSearchSlot() throws Exception {
		File file = new File("Hashing");
		scanner = new Scanner(file);

		LinkedList<Integer> list = new LinkedList<>();
		while (scanner.hasNext()) {
			Integer string = scanner.nextInt();
			list.add(string);
		}

		list.sort(null);
		HashMap<Integer, LinkedList> hashmap = new HashMap<>();
		int slot = 0;
		int data = 0;
		for (int i = 0; i < list.size(); i++) {
			data = list.get(i);

			slot = data % 11;
			if (hashmap.containsKey(slot)) {
				hashmap.get(slot).add(data);
			} else {
				hashmap.put(slot, new LinkedList<>());

				hashmap.get(slot).add(data);
			}

		}

		Iterator itr = (Iterator) hashmap.keySet().iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.print(key);
			System.out.println(hashmap.get(key));

		}
		try {
			System.out.println("enter target to search");
			int target1 = inputInteger();
			if (hashmap.containsValue(target1)) {
				for (int i = 0; i < list.size(); i++) {
					data = list.get(i);

					slot = data % 11;
					if (hashmap.containsKey(slot)) {
						hashmap.get(slot).add(data);
					} else {
						hashmap.put(slot, new LinkedList<>());

						hashmap.get(slot).add(data);
					}

				}

			} else {
				if (hashmap.containsKey(slot)) {
					hashmap.remove(data);
				}
			}
			if (list.contains(target1)) {
				System.out.println("element is found and delete it");
				list.remove(target1);
			} else {
				System.out.println("element is not found and add it");

			}
			list.iterator();

			while (itr.hasNext()) {
				Object key = itr.next();
				System.out.print(key);
				System.out.println(hashmap.get(key));

			}

		} catch (Exception e) {
			System.out.println("exception");
		}
	}

	/**
	 * @param node
	 * @return sum 
	 * finding node
	 */
	public long find(int node) {
		long sum = 0;

		if (node <= 1)
			return 1;
		else {

			for (int i = 1; i <= node; i++) {
				sum = sum + (find(i - 1) * find(node - i));
			}
		}
		return sum;

	}

}
