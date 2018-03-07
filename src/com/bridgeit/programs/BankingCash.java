/******************************************************************************
 *  Purpose:Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. 
 * 			 Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. 
 *  		 Maintain the Cash Balance.
 
 *  @author  Poonam
 *  @version 1.0
 *  @since   07-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import com.bridgeit.utility.Utility;
public class BankingCash 
{ 
		public static void main(String args[])
		{ 
			Utility utility=new Utility();
			QueueLogic queuelogic=new QueueLogic();
			int ch = 0;
			do
			{ 
				System.out.println();
				System.out.println("-Banking Cash Counter--");
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Number of people in the Queue ");
				System.out.println("4.Display Balacne");
				System.out.println("5.Exit");
				System.out.println();
				int choice=utility.inputInteger();
				switch (choice) 
				{
				   	case 1:
					   		System.out.println("Enter the amount you want to Deposit");
					   		queuelogic.insert(utility.inputInteger()); 
					   		queuelogic.display();
					   		break;
				   	case 2:
					   		System.out.println("Enter the amount you want to Withdraw ");
					   		utility.inputInteger();
					   		queuelogic.remove();
					   		System.out.println(" Your Available Balance is: "); 
					   		queuelogic.display();
					   		break;
					case 3:
							int count=queuelogic.getSize();
							System.out.println("The Number of People in Queue is: "+count);	
							break;
					case 4: System.out.println(" Your Available Balance is: "); 
							queuelogic.display();
			   				break;
				 
				   	default: 
					   		System.out.println("You entered wrong choice");
					   		return;
				   	}
			   	}
				while(ch<5);
			}		
	

	

}
