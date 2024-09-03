package edu.PIP.IT.java.Condition;
/**
 * Using if/else statement as conditional to assign the right grade appropriate to the score. 
 * With input from Class Scanner
 * 30/7/24
 */
import java.util.Scanner;	//Import class Scanner for input
/*
 * Precondition: Input you numerical score to through grade assignment conditional
 * Postcondition: Return your score and appropriate grade as output 
 */
public class Grader {

	public static void main(String[] args) {
		//Variables to store score in number and grade in character
		int score;
		char grade;
		
		//Prompt user to enter their score value
		System.out.println("Enter your score: ");
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		//Assign values of variable as the int input value
		score=keyboard.nextInt();
		
		//if/else condition for categorizing the grade based in the score value
		if(score>=90)
			grade='A';
		else if(score>=80)
			grade='B';
		else if(score>=70)
			grade='C';
		else if(score>=60)
			grade='D';
		else 
			grade='F';
		
		//Display Score and Grade
		System.out.println("Score = "+score);
		System.out.println("Grade = "+grade);

	}

}
