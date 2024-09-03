package edu.PIP.IT.java;
/**
 * Calculate area of circle with input
 */
import java.util.Scanner;

public class CircleCalculation {
	
	//A constant global variable
	public static final double PI=3.14159;
	
	public static void main(String[] args) {
		//Declaring the variables for storing values of the circle
		double radius;	//in inches
		double area;	//in square inches
		
		@SuppressWarnings("resource")
		//Create object of class Scanner for input
		Scanner keyboard=new Scanner(System.in);
		
		//Prompt user to input the value of the radius of a circle
		System.out.println("Enter the radis of a circle in inches: ");
		//Assigns the input value as the value of the variable
		radius=keyboard.nextDouble();
		
		//Formula for calculating the area of a circle
		area=PI*radius*radius;
		
		//Display final calculation
		System.out.println("A circle of radis "+radius+" inches");
		System.out.println("has an area of "+area+" square inches");
	}

}
