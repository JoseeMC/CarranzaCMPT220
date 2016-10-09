/**
* File: Problem7_9.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab4
* Due Date: September 28
* Version: 1.8
*
*Make and array and it pulls the smallest double
*
*
*/
import java.util.Scanner;

public class Problem7_9{
  public static void main (String[] args){
  
  System.out.print("Enter Ten Numbers: ");

  Scanner input =  new Scanner (System.in);

  double [] numbers = new double [10];

  for (int i = 0; i < numbers.length; i++){
    numbers [i] = input.nextDouble();
  }

  System.out.println("The minimum number is: " + min(numbers));
}
  public static double min (double[] array){

    double min = array[0];

    for(int i = 1; i < array.length; i++){
      if(min > array[i]){
      	min = array[i];
      }
    }
  
 	return min;

   }
  }