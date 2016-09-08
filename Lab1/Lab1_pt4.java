/**
* File: Lab1_pt4.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab1
* Due Date: September 7
* Version: 1.8
*
*
*
*/

import java.util.Scanner;

	public class Lab1_pt4 {
		public static void main (String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number between 0 and 1000:");
			int num= input.nextInt();


			if(num >= 1000 || num < 0){
				System.out.println("You can't use the number because its out of range");
			}
			else{
				int extOne = num%(10);
				int extTwo = num/(10);
				int extThree = extTwo%(10);
				int extFoe = extTwo/(10);
				int ans = extOne+ extThree + extFoe;

				System.out.println("The sum is:" + ans);
			}

	}

}