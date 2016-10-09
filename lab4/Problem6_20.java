/**
* File: Problem6_20.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab4
* Due Date: September 26
* Version: 1.8
*
*
*The program is able to calculate the number of  characters
*
*/

import java.util.Scanner;

public class Problem6_20{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		System.out.println("The number of letters is " + countLetters (s));
	}

	public static int countLetters (String ) {
		int countLetter = 0;

		for (int i = 0; i < s.length(); i++){
			if(isLetter(s.charAt(i))) {
				countLetter++;
			}
		}

		return countLetter;
	}

	public static boolean isLetter(char ch){

		return((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
	}
}