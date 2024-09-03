package edu.PIP.IT.java;
/**
 * Showing Enumeration data type
 */
import java.util.Scanner;

public class Enum {
	//enum is a data type that contains a set of predefined constant, 
	//you use it with values that aren't required to change
	enum Days{SUN,MON,TUE,WED,THU,FRI,SAT};

	public static void main(String[] args) {
		
		Days a;
		System.out.println("What's your favorite day?");
		@SuppressWarnings("resource")
		Scanner keyboard=new Scanner(System.in);
		a=Days.valueOf(keyboard.next());

		System.out.println("Your favorite day is "+a);
	}

}
