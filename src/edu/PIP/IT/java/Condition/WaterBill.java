package edu.PIP.IT.java.Condition;
/**
 * Using if/else statement as conditional to assign the correct rate based on water used and calculate total bill. 
 * With input from Class Scanner
 * 30/
 */
import java.util.Scanner;
/*
 * Precondition: Input the amount of water you used in m3 in order to assign the correct rate and calculate the total bill
 * Postcondition: Return amount of water used, rates according to the water used, and total bill amount
 */
public class WaterBill {

	public static void main(String[] args) {
		//Variables to store values of water used, cost rate, and total bill
		double waterUsed,bill;
		int rate;

		//Prompt user to enter their score value
		System.out.println("Enter the amount of water you used: ");

		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		//Assign values of variable as the int input value
		waterUsed=keyboard.nextInt();

		//if/else condition for categorizing the rate for calculating the bill based on the amount of water used
		if(waterUsed<1)
			rate=0;
		else if(waterUsed<=50)
			rate=350;
		else if(waterUsed<=100)
			rate=550;
		else if(waterUsed<=300)
			rate=650;
		else 
			rate=750;

		//Calculating total bill amount
		bill=waterUsed*rate;

		//Display amount of water used, rate, and total bill
		System.out.println("Water Used = "+waterUsed+" m3");
		System.out.println("Rate = "+rate+" Riel/m3");
		System.out.println("You Total Bill is "+bill+" Riel");
	}

}
