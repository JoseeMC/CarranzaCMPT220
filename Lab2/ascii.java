/**
* File: ascii.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*The program allows the user to enter a ASCII code and then print out the character.
*
*/
import java.util.Scanner;

public class ascii{

  public static void main (String[] args) {
		Scanner input = new Scanner (System.in);

		// allows for the program to obtain index
		System.out.print("Enter an ASCII Code: ");

		//Enter any ASCII value

		int a = input.nextInt();

		System.out.print("The character for ASCII code " + a + " is " + (char) a);
		
	}
}