/**
* File: monthDay.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*Gets the month and days
*
*/
import java.util.Scanner;

public class monthDay{
	public static void main (String[] args){
		System.out.println ("Enter a month number: ");
		Scanner input = new Scanner(System.in);


		int month = input.nextInt();
		System.out.println(" Please enter a year: ");

		int year = input.nextInt();
		int numberDays = 0;
		String monthName = null;
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); 

		switch(month){

			case 1: numberDays = 31;
			  monthName = "January";
			  break;

			case 2: numberDays = 28;
			  monthName = "February";
			  break;

			  if (isLeapYear == true);{
			  	numberDays = 29;
			  } break;

			case 3: numberDays = 31;
			  monthName = "March";
			  break;

			case 4: numberDays = 30;
			monthName = "April";
			break;

			case 5: numberDays = 31;
			monthName = "May";
			break;

			case 6: numberDays = 30;
			monthName = "June";
			break;

			case 7: numberDays = 31;
			monthName = "July";
			break;

			case 8: numberDays = 31;
			monthName = "August";
			break;

			case 9: numberDays = 30;
			monthName = "September";
			break;

			case 10: numberDays = 31;
			monthName = "October";
			break;

			case 11: numberDays = 30;
			monthName = "November";
			break;

			case 12: numberDays = 31;
			monthName = "December";
			break;

			default: System.out.println("Invalid month number ");
			return;

		}		
		System.out.println("The month " + monthName + " , " + year + " had " + numberDays + "days.");
	}
}