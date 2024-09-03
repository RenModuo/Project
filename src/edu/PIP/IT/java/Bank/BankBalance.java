package edu.PIP.IT.java.Bank;
/**
 * Calculating Bank Account Balance after a month of usage 
 * with increase through interest and fees as penalty for overdraw
 * 23/07/24
 */
import java.util.Scanner; //Import class Scanner for input
/*
 Precondition: Input numerical value representing the amount of money in a bank account
 */
public class BankBalance {
	//Constant Variables
	public static final double OVERDRAWN_PENALTY = 8.00;
	public static final double INTEREST_RATE = 0.02; // 2% annually
	
	public static void main (String [] args)
	{
		//Variable to store balance
		double balance;
		//Prompt user to enter account amount
		System.out.print ("Enter your checking account balance: $");
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard = new Scanner (System.in);
		//Assign values of variable as the double input value
		balance = keyboard.nextDouble ();
		
		//Displaying balance
		System.out.println ("Original balance $" + balance);
		
		//Condition for calculating new balance amount
		if (balance >= 0) 
			balance = balance + (INTEREST_RATE * balance) / 12;  //Positive balance
		else  
			balance = balance - OVERDRAWN_PENALTY;		//Negative balance
		
		//Display new balance
		System.out.print ("After adjusting for one month ");
		System.out.println ("of interest and penalties,");
		System.out.println ("your new balance is $" + balance);
	}
}
/*
  Postcondition: Return new Balance of account after going through some conditional expression and operation
 */
