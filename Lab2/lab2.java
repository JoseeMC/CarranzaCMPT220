/**
* File: lab2.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 12
* Version: 1.8
*
*
* Random month generator
*
*/

import java.util.Scanner;
import java.util.Random;
	
public class lab2{
	public static void main (String[] strings){
		  // The variable random is given any generated number between 0-11
		//Since the statement begins is given "+1" it will ignore the 0 and go from 1-12
		int random = (int) ( Math.random() * 12) + 1;
		System.out.println(random);

		for (int p = 0; p < 1000; p++){
			int random1 = (int) ( Math.random() * 12) + 1;

			System.out.println(getMonthName(random1) + "" + random1);
		}

		System.out.println(random);
	}

	// This switch statement allow you to get the name for the month
	public static String getMonthName(int month){
		String monthName= "";
		switch (month){
			
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;


			default:
					monthName= "The range is invalid";
		} 
			return monthName;
	}
}