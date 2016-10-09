/**
* File: Problem7_20.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab5
* Due Date: October 6, 2016
* Version: 1.8
*
*
*The program ask for 10 different integers. The program would output 
*the numbers back at in chronological order.
*/

import java.util.Scanner;

public class Problem7_20 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int [10];

    System.out.print("Enter ten numbers:");

    for (int j=0; j < numbers.length; j++) {
    	numbers[j] = input.nextInt();
    }

    System.out.print("The sorted numbers are:");

    selectSort(numbers);
    for (int j = 0; j < numbers.length; j++){
   	  System.out.print(numbers[j] + " ");
    }
}


  public static void selectSort(int[] list){
  	for (int j = list.length-1; j > 0; j--){
  		int cMax = list[j]; 
  		int cMaxIndex = j;

  		for (int k = 0; k < j; k++){
  			if (cMax < list[k]){
  				cMax = list[k];
  				cMaxIndex = k;
  			}
  		}

  		if (cMaxIndex != j){
  			list[cMaxIndex] = list [j];
  			list[j] = cMax;
  		}
  	}
  }
 }