package edu.PIP.IT.java.Bank;

/**
 * Simulating a bank account with increasing balance with a show new balance method
 */

public class BankAccount {
	//Declaring variables to store values of object
	public double amount;
	public double rate;
	
	//Calculate new balance after interest and display it
	public void showNewBalance()
	{
		//Calculating new balance after interest
		double newAmount=amount+(rate/100)*amount;
		//Display new balance
		System.out.println("With interest added, the new amount is $"+newAmount);
	}
}
