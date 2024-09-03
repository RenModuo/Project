package edu.PIP.IT.java.String;
/**
 * Learning phase: 
 * String method; indexOf(), substring(), toUpperCase()
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring and defining string variable
		String sentence="Text processing is hard!";
		//int variable to store index position of the word 'hard' in the string
		int position=sentence.indexOf("hard");
		
		//Displaying string
		System.out.println(sentence);
		System.out.println("\n012345678901234567890123");
		System.out.println("\nThe word \"hard\" starts at index " + position);
		
		//.substring() takes a certain part of the string as specified in the parentheses
		//Assigns new value of the string, cutting out the string on 'hard!' and replacing with 'easy!'
		sentence=sentence.substring(0,position)+"easy!";
		//Makes the characters in the string all upper case
		sentence=sentence.toUpperCase();
		
		//Display the changes to the string
		System.out.println("\nThis changed string is: ");
		System.out.println(sentence);
		
	}

}
