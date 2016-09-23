/**
* File: Problem5_13.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab3
* Due Date: September 22
* Version: 1.8
*
*
* Doing whille loops (Find the largest n such that n3 6 12,000
*/

import java.util.Scanner;

public class Problem5_13{
	public static void main (String [] args){
	  int n = 1;
	  while (Math.pow(n,3) <= 12000){
	  	n++;
	  }
	  	n--;
	  System.out.println("the n is " + n);
	  System.out.println("The n^3 is " + Math.pow(n,3));

	}
}