/**
* File: Lab1_pt3.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab1
* Due Date: September 7
* Version: 1.8
*
*
*The program calculates the tip and adds it to the total. The program also singles both results out
*
*/

import java.util.Scanner;

public class Lab1_pt3 {
// == you are using tabs!!!
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter the Subtotal and a gratuity rate: ");

	//Enter the subtotal
	// it will ask you for both tip and subtotal
	
	
	
	
		double subtotal = input.nextDouble();


	
// == what is this? this is not what you are supposed to output! read the
// problem, Jose.
		System.out.println("If your subtotal is $" + subtotal + ",would you like to leave a tip?");
	    double gratuity = input.nextDouble();
	    
		double tip = subtotal * (gratuity / 100); 
     	double total = (subtotal + tip);

		System.out.println("Your tip would be: $" + tip);

		System.out.println( "Your total would be $" + total);



	}
}
