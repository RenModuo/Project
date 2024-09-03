package edu.PIP.IT.java.Condition;
/**
 * Using if/else statement as conditional to assign the correct rate based on power used and calculate total bill. 
 * With input from Class Scanner
 * 30/
 */
import java.util.Scanner;
/*
 * Precondition: Input the amount of power you used in kw in order to assign the correct rate and calculate the total bill
 * Postcondition: Return amount of power used, rates according to the power used, and total bill amount
 */
public class ElectricityBill {

	public static void main(String[] args) {
		//Variables to store values of power used, cost rate, and total bill
		double powerUsed,bill;
		int rate;
		
		//Prompt user to enter their score value
		System.out.println("Enter the amount of power you used: ");

		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		//Assign values of variable as the int input value
		powerUsed=keyboard.nextInt();
		
		//if/else condition for categorizing the rate for calculating the bill based on the amount of power used
		if(powerUsed<1)
			rate=0;
		else if(powerUsed<=50)
			rate=750;
		else if(powerUsed<=100)
			rate=550;
		else if(powerUsed<=200)
			rate=450;
		else 
			rate=350;
		
		//Calculating total bill amount
		bill=powerUsed*rate;
		
		//Display amount of power used, rate, and total bill
		System.out.println("Power Used = "+powerUsed+"kw");
		System.out.println("Rate = "+rate+" Riel/kw");
		System.out.println("You Total Bill is "+bill+" Riel");
	}

}
