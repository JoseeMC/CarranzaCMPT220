/**
* File: problem2_pt2.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab1
* Due Date: September 7
* Version: 1.8
*
*
*Temperature converter from fahrenheit to celsius
*
*/
import java.util.Scanner;

public class Problem2_pt2{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter Celsius Value");
		double celsius = input.nextDouble();

		double fahrenheit = (9.0 / 5.0)* (celsius + 32.0);

		System.out.println(" fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
	}
}