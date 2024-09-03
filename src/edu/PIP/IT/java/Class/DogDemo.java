package edu.PIP.IT.java.Class;

/**
 * Using the class Dog
 */
public class DogDemo {

	public static void main(String[] args) {
		//Creating an object of the class Dog, which is another public class in the same package
		Dog balto=new Dog();
		//Assigning value of the variables of the object
		balto.name="Balto";
		balto.age=8;
		balto.breed="Siberian Husky";
		//calling a method of the class to display the attribute of the object
		balto.writeOutput();
		
		//Creating an object of the class Dog
		Dog scoobydoo=new Dog();
		//Assigning value of the variables of the object
		scoobydoo.name="ScoobyDoo";
		scoobydoo.age=13;
		scoobydoo.breed="Great Dane";
		
		//Display the attribute of the object
		System.out.println(scoobydoo.name+" is a "+scoobydoo.breed+".");
		System.out.println("He is "+scoobydoo.age+" years old, or");
		
		//calling a method of the class to convert dog year into human year
		int humanYears=scoobydoo.getAgeInHumanYears();
		
		System.out.println(humanYears+" in human years.");
	}

}
