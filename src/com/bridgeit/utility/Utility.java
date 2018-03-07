/******************************************************************************
 *  Purpose: Data Structure programs utility
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.utility;
import java.util.*;

import com.bridgeit.programs.Stack1;

public class Utility {

		Scanner scanner;
		public Utility()
		{
			scanner=new Scanner(System.in);
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
		 * @return
		 * Determine that search word is found or not
		 */
		public static <T> void searchWord(List<T> list,T search)
		{
			
			if(list.contains((T)search))
			{
				System.out.println("element is found in list and delete it");
				list.remove(search);
				System.out.println(list);
			}
			else
			{
				System.out.println("element is not found in list and add it");
				list.add(search);
				System.out.println(list);
			}
			}
		
		
		/**
		 * @param year
		 * @return true or false
		 * determine year is leap or not
		 */
		public boolean isLeapYear(int year)
		{
			if((year%4==0)&&(year%100!=0 || year%400==0))
				return true;
			else
				return false;
					
		}

		
		/**
		 * @param m
		 * @param d
		 * @param y
		 * @return
		 * find the day of weeks value
		 */
		public static int dayOfWeek(int m,int d,int y)
		{	
			int y0,x,m0,d0;
			y0 = (int)(y-(14-m)/ 12);
			x = (int)(y0 + (y0/4)-(y0/100)+(y0/400));
			m0 = (int)(m + 12*((14-m) / 12)-2);
			d0 =(int)((d+ x +((31*m0)/12))%7);
			return d0;
		}


		/**
		 * @param string
		 * @return boolean
		 * checking expression is valid or not
		 */
		public boolean checkValidExpression(String string)
	{
		int count = 0;
		Stack1 stack = new Stack1();
		for (int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='(')
			{
				stack.push(string.charAt(i));
				count++;
			}
			
			if(string.charAt(i)==')')
			{
				if(stack.isEmpty())
				{
					count--;
				}
				else
				{
					stack.pop();
					count--;
				}
			}
		}
		if(stack.isEmpty() && count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		/**
		 * @param array from user as list of elements
		 * to perform insertion sorting
		 */
		public  <T extends Comparable> void printInsertion(T[] array)
	     {                              
		
			T key;
				int i,j;
				for(i=1;i<array.length;i++)
				{
					key=array[i];
					for(j=i-1;j>=0 &&(key.compareTo(array[j]))<0;j--)
						array[j+1]=array[j];
						array[j+1]=key;
				}
				for(i=0;i<array.length;i++)
				{
					System.out.println(array[i]);
				}
	     }
		
		/**
		 * @param start
		 * @param limit
		 * @return
		 * Find the prime numbers
		 */
		public ArrayList<Integer> primeNumbers(int start, int limit)
		{
				ArrayList<Integer> primeNumbersList=new ArrayList<Integer>();
				for (int i=2;i<=limit;i++)
				{
					boolean prime = true;
					for(int j=2;j<i;j++)
					{
						if(i%j==0)
						{
							prime=false;
							break;
						}
					}
					if(prime==true)
					{
						primeNumbersList.add(i);
					}
				}
				return primeNumbersList;
			}


	/**
	 * @param array
	 * To store arraylist in 2D format 
	 */
	public <T> void print2DArray(ArrayList<T> array)
			{
				int[][] array1=new int[10][25];
				int check=0;
				int i=0;
				int j=0;
				Iterator<Integer> iterator=(Iterator<Integer>) array.iterator();
				while(iterator.hasNext())
				{
					int element = iterator.next();
					int quotient= element/100;
					if(quotient!=check)
					{
						check=quotient;
						i++;
						j=0;
					}
					array1[i][j++]=element;
				}
			    for(int m=0;m<array1.length;m++)
			    {
			    	for (int n=0;n<array1[m].length;n++)
			    	{
			    		if(array1[m][n]==0)
			    		{
			    			System.out.print(" ");
			    		}
			    		else
			    		{
			    			System.out.print(array1[m][n]+" ");
			    		}
			    	}
			    	System.out.println();
			    }
			}
	
	
	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @param primenumbers
	 * @return
	 * to find anagram number from prime numbers
	 */
	public ArrayList<Integer> findAnagram(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray, ArrayList<Integer> primenumbers) 
	{
		System.out.println("Anagram numbers");
		for (Integer element : primeArray)
		{
			String string = Integer.toString(element);
			int last = string.length(); 
			anagarmArray=permute(anagarmArray,string,0,last-1);
		}
		for (Integer element : primeArray)
		{	
			String string = Integer.toString(element);
			if(anagarmArray.contains(string))
			{
				anagarmArray.remove(string);
			}
		}
		
		for (Integer element : primenumbers)
		{	
			String string = Integer.toString(element);
			if(anagarmArray.contains(string))
			{
				anagarmArray.remove(string);
			}
		}
		return anagarmArray;
	}

	
	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @return
	 * to print array element
	 */
	public ArrayList<Integer> printArrayElement(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray) 
	{
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		
		for (Integer element : primeArray)
		{	
			String string = Integer.toString(element);
			if(anagarmArray.contains(string))
			{
				anagram.add(Integer.parseInt((String)string));
			}
		}
		return anagram;
		
	}
	

	/**
	 * @param anagarmArray
	 * @param string
	 * @param start
	 * @param last
	 * @return
	 */
	public static  <T> ArrayList<Integer> permute(ArrayList anagarmArray,T string, int start, int last)
	{	
    	if (start == last)
    	{
    		anagarmArray.add(string);
    	}
    	else
    	{	
    		for (int i = start; i <= last; i++)
    		{
    			string = (T) swap(string,start,i);
        		permute(anagarmArray, string, start+1, last);
        		string = (T) swap(string,start,i);
    		}
    	}
		return anagarmArray;
    	
	}

	// function to swap charactor in string
	
	/**
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static <T> String swap(T string1, int first, int second)
	{
		char temp;
		char[] charArray = ((String) string1).toCharArray();
		temp = charArray[first] ;
		charArray[first] = charArray[second];
		charArray[second] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param array
	 * @return
	 */
	public static ArrayList palindromNumber(Integer[] array)
	{
		ArrayList primenumbers = new ArrayList();
		System.out.println("palindrome prime numbers are:");
        for(int i=0;i<array.length;i++)
        {
        	int num = array[i];
        	int temp = num;
        	int sum=0;
        	while (temp!=0)
        	{
        		int rem = temp%10;
        		sum = (sum*10)+rem;
        		temp = temp/10;
        	}
        	if (num == sum)
        	{
        		primenumbers.add(num);
        	}
        }
		return primenumbers;
	}
	
	public<T> void extened(Integer number)
	{
		int reminder=0,sum=0;
		int temp=number;
		
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			sum=sum*10+reminder;
		}
		
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
		
	}
	
	
	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @return
	 */
	public ArrayList<Integer> findAnagram(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray) 
	{
		System.out.println("Anagram numbers");
		for (Integer element : primeArray)
		{
			String string = Integer.toString(element);
			int l = string.length(); 
			anagarmArray=permute(anagarmArray,string,0,l-1);
		}
		for (Integer element : primeArray)
		{	
			String string = Integer.toString(element);
			if(anagarmArray.contains(string))
			{
				anagarmArray.remove(string);
			}
		}
		
		return anagarmArray;
	}
	
	/**
	 * @param string
	 * @param array
	 * insert character in arrayDeque
	 */
	public void insertChar(String string,ArrayDeque array)
	{
		for (int i=0 ; i<string.length() ;i++ )
		{
			array.addLast(string.charAt(i));
		}
	}
		
		/**
		 * @param array
		 * @param reverse
		 * @return
		 * poping each charcter from quque from rare end and append to rev string
		 */
		public static String popChar(ArrayDeque<Character>array,String reverse)
		{
			while(!array.isEmpty())
			{
				reverse+=array.removeLast();
			}
			return reverse;
		}
		
		
		/**
		 * @param string
		 * @param reverse
		 * checking given string is palindrom or not
		 */
		public static void checkPalindrom(String string,String reverse)
		{
			if(string.equals(reverse))
			{
				System.out.println("Given string is palindrome.");
			}
			else
			{
				System.out.println("Given string is not palindome");
			}
		}

}
