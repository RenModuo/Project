package edu.PIP.IT.java;

import java.util.Scanner;
/**
 * Learning phase:
 * Used for calculating number of eggs.
 * With Scanner Class for input.
 */
public class Basic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variable
		int numOfBaskets, eggsPerBasket, totalEggs;
		
		//Get rid of warning sign
		@SuppressWarnings("resource")
		//Create new object of class Scanner for inputting value
		Scanner keyboard = new Scanner(System.in);
		
		//Define/Assign value of variables
		numOfBaskets=10;
		eggsPerBasket=6;
		
		//Calculate total eggs
		totalEggs=numOfBaskets*eggsPerBasket;
		
		//Print out lines to display
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numOfBaskets + " baskerts, then");
		System.out.println("the total number of eggs is " + totalEggs);
		
		//Inputting value via Scanner
		System.out.println("\nEnter the number of eggs in each basket: ");
		eggsPerBasket=keyboard.nextInt();
		System.out.println("\nEnter the number of baskets: ");
		numOfBaskets=keyboard.nextInt();
		
		//Calculate new total eggs
		totalEggs=numOfBaskets*eggsPerBasket;
		
		System.out.println("\nIf you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numOfBaskets + " baskerts, then");
		System.out.println("the total number of eggs is " + totalEggs);
		
		//Subtract 2 from eggsPerBasket
		System.out.println("\nNow we take 2 eggs out of each basket.");
		eggsPerBasket=eggsPerBasket-2;
		
		//Calculate new total eggs again
		totalEggs=numOfBaskets*eggsPerBasket;
		
		//Print new eggs total
		System.out.println("\nYou now have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numOfBaskets + " baskerts, then");
		System.out.println("the new total number of eggs is " + totalEggs);
	}

}
