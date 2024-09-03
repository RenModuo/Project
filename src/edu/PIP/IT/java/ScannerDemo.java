package edu.PIP.IT.java;
/**
 * Showcase method .nextInt(), .nextDouble(), .next(), and .nextLine() form class Scanner
 */
import java.util.Scanner;	//Import class Scanner for input

public class ScannerDemo {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);

		//Prompt user to input 2 numbers
		System.out.println("Enter two whole numbers");
		System.out.println("seperated by two or more spaces: ");

		//Initialize variables to store the numbers
		int n1, n2;
		//Scan and grab only one int input
		//Assign values of variable as the int input value
		n1=keyboard.nextInt();
		n2=keyboard.nextInt();

		//Display the input
		System.out.println("You entered " + n1 + " and " + n2);
		//Prompt user to input 2 more numbers, but as decimal
		System.out.println("Next enter two numbers.");
		System.out.println("A decimal point is OK");

		//Initialize variables to store the decimal numbers
		double d1, d2;
		//Scan and grab only one number input
		//Assign values of variable as the double input value
		d1=keyboard.nextDouble();
		d2=keyboard.nextDouble();

		//Display the input
		System.out.println("You entered " + d1 + " and " + d2);
		//Prompt user to input 2 words
		System.out.println("Next enter two words: ");

		//Initialize variables to store the words as string
		String s1, s2;
		//Scan and grab only one character input
		//Assign values of variable as the input value
		s1=keyboard.next();
		s2=keyboard.next();

		//Display the input
		System.out.println("You entered \"" + s1 +"\" and \"" + s2 + "\"");

		//.nextLine() scans the current line and grabs all of the input until it hits a newline
		s1=keyboard.nextLine();	//To get rid of '\n'

		//Prompt user to input a line of text
		System.out.println("Next enter a line of text: ");

		//Scans that input line and assigns it to the string variable
		s1=keyboard.nextLine();

		//Display the input
		System.out.println("You entered \"" + s1 +"\"");
	}
}
