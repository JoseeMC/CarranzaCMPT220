/**
* File: finance.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
* Once the program is given an amount it is able to find out how many 
* Nickles, dimes, quarters, dollars, pennies it contains
*/

import java.util.Scanner;

public class finance{
	public static void main (String[] args){
		//Input that the user provides
		Scanner input = new Scanner (System.in);

		// The amount is received
		System.out.print("Enter an amount in double, ie. 11.56: ");
		String amt = input.next();
		int numDollars = Integer.parseInt(amt.substring(0, amt.indexOf('.')));
		int numCents = Integer.parseInt(amt.substring(amt.indexOf('.') + 1));

		//in order to find the number of quarters (remaining)
		int numQuarters = numCents / 25;
		numCents = numCents  % 25;
		//Find remaining dimes
		int numDimes = numCents / 10;
		numCents = numCents % 10;
		//num nickles
		int numNickles = numCents / 5;
		numCents = numCents % 5;

		//remaining pennies

		int numPennies = numCents;

		//SHow the result
		System.out.println("Your amount" + amt + "consists of");
		System.out.println("	" + numDollars + " dollars");
		System.out.println("	" + numQuarters + "quarters");
		System.out.println("	" + numDimes + "dimes");
		System.out.println("	" + numNickles + "nickles");
		System.out.println("	" + numPennies + "pennies"); 



	}
}