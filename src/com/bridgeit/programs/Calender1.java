/******************************************************************************
 *  Purpose:   Reads in integers prints them in sorted order using Bubble Sort
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import java.io.IOException;
import com.bridgeit.utility.Utility;

public class Calender1 {

	public static void main(String[] args)throws IOException
	{
	Utility utility=new Utility();
	String months[]= {"","January","Febuary","March","April","May","June","July","August",
			   "September","October","November","December"};
	int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	System.out.println("Enter the month");
	int month=utility.inputInteger();
	System.out.println("Enter the year");
	int year=utility.inputInteger();
	
	if(month==2 && utility.isLeapYear(year))
	{
		days[month]=29;
	}
	System.out.println("      "+months[month]+"     "+year);
	int result=(Utility.dayOfWeek(month, 1, year));
	int mont=days[month];
	int column=mont+1;
	int rows=8;
	String array[][]=new String[rows][column];
	
	
	for (int i = 0; i <7; i++)
	{
		for (int j = 0; j <7; j++)
		{
			array[i][j]="  ";
		}
		
	}
	array[0][0]="s";array[0][1]="m";array[0][2]="t";array[0][3]="w";array[0][4]="th";array[0][5]="f";array[0][6]="sa";
	for (int i = 0; i <7; i++)
	{
		for (int j = 0; j <7; j++)
		{
			System.out.print("\t "+ array[i][j]);
			
		}
		
	}
	System.out.println();
	try
	{
		for(int i=0;i<result;i++)
		{
	for (int k = 0; k <result; k++) 
	{
		System.out.print("\t ");
	}
		for (int j = 1; j <=column; j++)
		{
			array[i][j]=Integer.toString(j);
			System.out.print("\t "+array[i][j]);
			
			if(((j+result)%7==0)||(j==column))
			{
				System.out.println();
			}
		}
	}	
		
	
	}
	
	catch(Exception e)
	{
		System.out.println(" ");
	}
	}
	
}
