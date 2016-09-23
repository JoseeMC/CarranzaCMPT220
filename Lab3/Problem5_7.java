/**
* File: Problem5_7.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab3
* Due Date: September 22
* Version: 1.8
*
*
*Tuition fee calculatot
*
*/

import java.util.Scanner;

public class Problem5_7{
  public static void main (String[] args){
    int collegeFeeYear = 10000;
	int totalFee = 0;

	for (int i = 1; i <= 14; i++) {
	  collegeFeeYear += collegeFeeYear * .05;
	 
	if ( i == 10){
	  System.out.println("The tuition fee in ten year is $" + collegeFeeYear);
	}
	if (i > 10){
		totalFee = totalFee + collegeFeeYear;
	}
   }
	System.out.println("The total cost of 4 years tuition after the tenth year is $"
	  	+ totalFee);
  }
}



