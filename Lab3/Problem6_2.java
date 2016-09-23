/**
* File: Problem6_2.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab3
* Due Date: September 22
* Version: 1.8
*
*
*
*it adds two integers together
*/

import java.util.Scanner;

public class Problem6_2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		long n = input.nextLong();

		System.out.println("The sum is " + sumDigits(n));
	}

	public static int sumDigits(long n){
		int sum = 0;
		do{
			sum += n % 10;
		} while((n = n / 10) != 0 );
		return sum;
	}
}