/**
* File: Problem7_18.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab5
* Due Date: October 6, 2016
* Version: 1.8
*
*
*The program ask for 10 different integers. The program would output 
*the numbers back at in chronological order sorted with bubblesort.
*/
import java.util.Scanner;


public class Problem7_18{
  public static void main (String[] args){
  	Scanner input = new Scanner(System.in);

  	double[] numbers = new double[10];

  	System.out.print("Enter ten numbers:");

  	for (int j=0; j < numbers.length; j++){
  		numbers[j] = input.nextDouble();
  	}

  	bublesort(numbers);

  	System.out.println("The array after sort is: ");
    for (int j = 0; j < numbers.length; j++){
      System.out.println(numbers[j]);
    }

  }

    public static void bublesort(double[] list){

      int n = list.length - 1;
      while(n != 0){
        int j;
        for (j=0; j<n; j++){
          if (list[j] > list[j+1]){
            double temp = list[j];
            list[j] = list[j+1];
            list[j+1] = temp;
          }

        }
        n = j -1;
      }

  }
}