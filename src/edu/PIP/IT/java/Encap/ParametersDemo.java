package edu.PIP.IT.java.Encap;
/**
 * Showing way to modify the private variables of object
 * 23/07/24
 */
/*
 * Precondition: Class DemoSpecies and 2 objects with values
 */
public class ParametersDemo
{
	public static void main(String [] args)
	{
		//Create object
		DemoSpecies s1 = new DemoSpecies (), s2 = new DemoSpecies ();
		
		//set object variables
		s1.setSpecies("Klingon ox", 10, 15);
		
		//Variable
		int aPopulation = 42;
		
		System.out.println("aPopulation BEFORE calling tryToChange: " + aPopulation);
		//Try to change value of variable with a variable value of the object
		s1.tryToChange(aPopulation);
		
		System.out.println("aPopulation AFTER calling tryToChange: " + aPopulation);
		//set object variables
		s2.setSpecies("Ferengie Fur Ball", 90, 56);
		
		System.out.println ("s2 BEFORE calling tryToReplace: ");
		//Display data
		s2.writeOutput();
		
		//Try to change the values of the variables in one object with another directly
		s1.tryToReplace(s2);
		System.out.println("s2 AFTER calling tryToReplace: ");
		//Display data
		s2.writeOutput ();
		
		//Changing the values of each variables one by one with another variables' value
		s1.change(s2);
		System.out.println("s2 AFTER calling change: ");
		//Display data
		s2.writeOutput ();
	}
}
/*
 * Postcondition: Values of those 2 objects' variables changing
 */