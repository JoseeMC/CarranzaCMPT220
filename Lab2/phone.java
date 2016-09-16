/**
* File: phone.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*the program ia basically a virtual phone
*
*/

import java.util.Scanner;
public class phone{
	public static void main (String[] args) {
		System.out.print ("Enter any letter: ");
		Scanner input = new Scanner (System.in);
		String a = input.next();

		char c = a.toLowerCase().charAt(0);
		int b;

		switch (c){
			case 'a':
			case 'b':
			case 'c':
			  b = 2;
			  break;

			case 'd':
			case 'e':
			case 'f':
			  b = 3;
			  break;

			case 'g':
			case 'h':
			case 'i':
			  b = 4;
			  break;

			case 'j':
			case 'k':
			case 'l':
			  b = 5;
			  break;

			case 'm':
			case 'n':
			case 'o':
			  b = 6;
			  break;

			case 'p':
			case 'q':
			case 'r':
			case 's':
			  b = 7;
			  break;

			case 't':
			case 'u':
			case 'v':
			
			  b = 8;
			  break;

			case 'w':
			case 'x':
			case 'y':
			case 'z':
			  b = 9;
			  break; 

			default:
			  b = 0;
			  break;
			}
			if (b != 0){
			  System.out.print("The corresponding number is " + b );
			  System.exit(0);
			}
			System.out.print( a + " is an invalid input ");

		}

}