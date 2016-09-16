/**
* File: Pentagon.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*The program is able to calculate the area of the pentagon
*
*/
import java.util.Scanner;

public class Pentagon{
	public static void main (String[] args){
		// what this part does is it finds out distance between the origin and any vertex
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter the length from the center to a vertex: ");

		double j= input.nextDouble();
		double c= 2 * j * Math.sin(Math.PI / 5);
		
		double area = 5 * Math.pow(c,2) / (4 * Math.tan(Math.PI / 5));

		area = Math.round(area * 100) / 100.0;
		System.out.println("The area of the pentagon is " + area);
	}
}