/**
* File: vehicle.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*The program generates a random license plate
*
*/
public class vehicle{
	public static void main (String[] args){

	  char letter1 = (char)((int) (Math.random()*26+65));
	  char letter2 = (char)((int) (Math.random()*26+65));
	  char letter3 = (char)((int) (Math.random()*26+65));

	  int num = (int)(Math.random() *10000);

	  String plate = String.format("%04d", num );
// What this command does is creates a plate number within the range of the alphabet
	  System.out.println("The plate number is " + letter1 + letter2 + letter3 + plate); 
	}
}