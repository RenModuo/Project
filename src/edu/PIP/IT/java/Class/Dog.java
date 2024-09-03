package edu.PIP.IT.java.Class;
/**
 * class for Dog with display method and calculating human years
 */
public class Dog
{
	//Class member/variable
	public String name;
	public String breed;
	public int age;
	
	//Method to display the data of the object
	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age in calendar years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears()); //calling another method within the class 
		System.out.println();
	}
	
	//Method to convert dog year into human years
	public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2) {
			humanYears = age * 11;
		} 
		else {
			humanYears = 22 + ((age-2) * 5);
		}
		return humanYears;
	}
}