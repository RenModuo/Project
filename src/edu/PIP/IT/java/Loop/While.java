package edu.PIP.IT.java.Loop;
/**
 * Showcasing while loop with input. By counting up to a certain number
 */
import java.util.Scanner;
/*
 * Precondition: Input a number, which the program will count up to
 * Postcondition: Counting from 1 to the input number
 */
public class While {

	public static void main(String[] args)
	{
		//Variables to store numbers
		int count,number;
		//Prompt
		System.out.println("Enter a number: ");
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		//Assign values of variable as the int input value
		number=keyboard.nextInt();
		
		//Loop variable
		count=1;
		while(count<=number)	//Loop control expression, the loop ends when the expression is false
		{
			System.out.print(count+", ");	//Print out every iteration of the loop
			count++;	//Incrementing loop variable value every iteration)
			
			
		}
		
		//Display after the loop ends
		System.out.println();
		System.out.println("Buckle my shoe.");

	}

}
