package com.bridgeit.programs;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgeit.utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) 
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
		int date=0;
		
		Queue weekday  = new LinkedList<>();
		int numberOfObject;
		
		for(int i = 0; i <6;i++)
		{
			weekday.add(new LinkedList<>());
		}
		
		Queue queue=new LinkedList<>();
		System.out.println("SUN"+"\t"+"M"+"\t"+"TU"+"\t"+"WED"+"\t"+"TH"+"\t"+"FRI"+"\t"+"SAt");
		

		System.out.println();
		try
		{
			
		for (int k = 0; k <result; k++) 
		{
			System.out.print("\t ");
		}
			
			for (int j = 1; j <column; j++)
			{
				
				System.out.print(j+"\t");
				
				if(((j+result)%7==0)||(j==column))
				{
					System.out.println();
				}
			}
			
	
		}
		catch(Exception e)
		{
			System.out.println(" ");
		}
		}
}
		