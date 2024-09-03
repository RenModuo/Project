package edu.PIP.IT.java.Bank;

/**
 * Using BankAccount class and showcasing local variables
 */

public class LocalVariableDemo {

	public static void main(String[] args) {
		//Creating new object of class BankAccount
		BankAccount myAccount=new BankAccount();
		
		//Assigning values to variables of the object
		myAccount.amount=100;
		myAccount.rate=5;
		
		//Local variable for demonstration
		double newAmount=800;
		//calling method from class BankAccount to display a variable of the method with the same name as the local variable
		myAccount.showNewBalance();
		//Displaying local variables
		System.out.println("I wish my new amount were $"+newAmount);
	}

}
