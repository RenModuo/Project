package edu.PIP.IT.java.Encap;
/**
 * Class containing private variables, and methods to try and change those variable values
 * 23/07/24
 */

public class DemoSpecies {
	private String name;
	private int population;
	private double growthRate;
	
	//Set the private variables of the object
	public void setSpecies(String Name,int Population,double GrowthRate)
	{
		this.name=Name;
		this.population=Population;
		this.growthRate=GrowthRate;
	}
	
	//Tries to set intVariable equal to the population of this object. 
	//But arguments of a primitive type cannot be changed.
	public void tryToChange (int intVariable)
	{
		intVariable = this.population;
	}
	
	//Tries to make otherObject reference this object. 
	//But arguments of a class type cannot be replaced.
	public void tryToReplace (DemoSpecies otherObject)
	{
		otherObject = this;
	}

	//Changes the data in otherObject to the data in this object.
	public void change (DemoSpecies otherObject)
	{
		otherObject.name = this.name;
		otherObject.population = this.population;
		otherObject.growthRate = this.growthRate;
	}

	//Display all variables of object
	public void writeOutput()
	{
		System.out.println("Name = "+this.name+
							"\nPopulation = "+this.population+
							"\nGrowth Rate = "+this.growthRate+"%");
	}
}
