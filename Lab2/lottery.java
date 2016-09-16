/**
* File:lottery.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
*Play the lottery on the program
*
*/

import java.util.Scanner;

public class lottery{
	public static void main(String [] args){
		int lottoNumber = (int)(100 + Math.random() *(999));
		System.out.println("Welcome to the lotter; In order to play please enter a 3 digit number");
		Scanner input = new Scanner(System.in);
		int lottoGuesser = input.nextInt();
		int result;

		//user inputs digits
		int guessDigit1 = lottoGuesser / 100;
		int guessDigit2 = lottoGuesser % 100/10;
		int guessDigit3 = lottoGuesser % 10 ;

		//values of the integer

		int lottoDigit1 = lottoNumber / 100;
		int lottoDigit2 = lottoNumber % 100 / 10;
		int lottoDigit3 = lottoNumber % 10;

		if (lottoNumber == lottoGuesser) {
			result = 1;
			// This would be an exact match
		}
		else if (
			guessDigit1 == lottoDigit2
			&& guessDigit2 == lottoDigit3
			&& guessDigit1 == lottoDigit1){
			result = 2;
		}
		

		else if (guessDigit1 == lottoDigit1
			|| guessDigit1 == lottoDigit2
			|| guessDigit1 == lottoDigit3
			|| guessDigit2 == lottoDigit1
			|| guessDigit2 == lottoDigit2
			|| guessDigit2 == lottoDigit3
			|| guessDigit3 == lottoDigit1
			|| guessDigit3 == lottoDigit2
			|| guessDigit3 == lottoDigit3){
			result = 3;
		}

			
			else{
				result = 0;
			}
			switch (result){
				case 0: System.out.println("Sorry, no luck. Play again. The number was " + lottoNumber); break;
				case 1: System.out.println("Your guess was an exact match! You win $10,000! The number was" + lottoNumber); break;
				case 2: System.out.println("All of your guess's digits were in the lotter number, you win $3,000" + lottoNumber); break;
				case 3: System.out.println("If one digit in the user input matches a digit in the lottery number, the award is $1,000" + lottoNumber); break;
			}
	}
}