package edu.PIP.IT.java.String;
/**
 * Demonstrating String function .equal() and .equalsIgnoreCase() to compare strings. 
 * With input using Class Scanner
 * 30/7/24
 */
import java.util.Scanner;	//Import class Scanner for input
/*
 * Precondition: Input 2 lines of text to compare with each other
 * Postcondition: Return result of comparing the 2 lines in 3 different ways
 */
public class StringEquality {

	public static void main(String[] args) {
		//Variable to store text
		String s1,s2;
		
		//Prompt user to input 2 lines of text
		System.out.println("Enter two lines of text: ");
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		
		//Assign values of variable as the next line of input
		s1=keyboard.nextLine();
		s2=keyboard.nextLine();
		
		//if/else statement for conditional output
		//.equal() compare 2 strings letter by letter
		if(s1.equals(s2))
			System.out.println("The two lines are equal"); //Display if condition is true
		else
			System.out.println("The two lines are not equal");	//Display if condition is false
		
		//Just like the statement above, with the 2 strings swapped in position
		if(s2.equals(s1))
			System.out.println("The two lines are equal");	//Display if condition is true
		else
			System.out.println("The two lines are not equal");	//Display if condition is false
		
		//.equalsIgnoreCase() compares 2 string letter by letter while ignoring the difference in lower and uppercase
		if(s1.equalsIgnoreCase(s2))
			System.out.println("But the lines are equal, ignoring case.");	//Display if condition is true
		else
			System.out.println("Lines are not equal, even ignoring case.");	//Display if condition is false
	}

}
