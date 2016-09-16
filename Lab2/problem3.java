/**
* File: problem3.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab2
* Due Date: September 14
* Version: 1.8
*
*
* asks for three different integers and then combines them one by one
*
*/
import java.util.Scanner;

public class problem3{
	public static void main (String[] strings){


		int num1;
		int num2;
		int num3;


		// Scanner should grab the input that the user placed

		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter three integers:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.close();

		//

		if (num1 > num2){
			num1 ^= num2;
			num2 ^= num1;
			num1 ^= num3;
		}
		if (num2 > num3) {
			num2 ^= num3;
			num3 ^= num2;
			num2 ^= num3;
		}
		if( num1 > num2){
			num1 ^= num2;
			num2 ^= num1;
			num1 ^= num2;
		}

		System.out.println("Sorted Numbers: " + num1 + "" + num2 + "" + num3);

	}
}