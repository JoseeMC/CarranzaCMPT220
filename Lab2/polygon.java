/**
* File: polygon.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*Calculates the area of any given polygon
*
*/
import java.util.Scanner;

public class polygon{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of sides: ");
		int p = input.nextInt();

		System.out.print("Enter the side: ");
		double a = input.nextDouble(); 

		System.out.println("The area of the polygon is " + area(p,a));

	}

	public static double area(int p, double side){

		return p * Math.pow(side, 2) / (4 * Math.tan(Math.PI / p)); 
	}
}