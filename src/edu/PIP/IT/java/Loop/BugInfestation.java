package edu.PIP.IT.java.Loop;
/**
 * Calculation the amount of weeks it takes for a certain population of roaches to overrun a house of a certain volume
 * and displaying the final population count, their total volume, and the amount of weeks it took 
 */
import java.util.Scanner;
/*
 * Precondition: Inputting volume of house and starting roach population
 * Postcondition: Output final population count, their total volume, and the amount of weeks it took
 */
public class BugInfestation {
	//Constant variables
	public static final double ONE_BUG_VOLUME = 0.002;
	public static final double GROWTH_RATE = 0.95;

	public static void main(String[] args) {
		//Variable
		double houseVolume, totalBugVolume, totalBug;
		int startingBug, weekCount;
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard = new Scanner(System.in);
		
		//Input volume of your house
		System.out.println("Enter the total volume of your house\nin cubic feet: ");
		houseVolume = keyboard.nextDouble();
		//Input the starting number of roaches
		System.out.println("Enter the estimated number of\nroaches in your house: ");
		startingBug = keyboard.nextInt();
		
		//Assigning initial values
		totalBug = startingBug;
		totalBugVolume = 0;
		
		//Starting week count
		weekCount = 0;
		//While loop to calculate the population growth each week
		while(totalBugVolume<houseVolume)
		{
			totalBug += totalBug * GROWTH_RATE;
			totalBugVolume = totalBug * ONE_BUG_VOLUME;
			weekCount += 1;
		}
		
		//Display startingBug, houseVolume, totalBug, totalBugVolume, and the amount of weeks it took
		System.out.println("Starting with a roach population of " + startingBug);
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
		System.out.println("after " + weekCount + " weeks,");
		System.out.println("the house will be filled with " + (int)totalBug + " roaches,");
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
	}

}
