/**
* File: Jose.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab3 problem 5.1
* Due Date: September 22
* Version: 1.8
*
*
*Integer java
*
*/
import java.util.Scanner;


public class Jose{
  public static void main (String[] args) {
  	Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer, the input ends if it is 0:" ); 
    
    int p = 0 ;
  	int np = 0;
  	int nn = 0;
  	int sumn = 0;
    double total = 0;
  	double avgn = 0;

  	do{
  	  if (p > 0)
  	  	np++;
  	  else
  	  	nn++;

  	  sumn += p;

      total++; 

  	  p = input.nextInt();


  	}  while((p = input.nextInt()) != 0);
  	avgn = sumn / total;
   
    
    System.out.println("The number of positives is " + np);
    System.out.println("The number of negative is " + nn);
    System.out.println("The total is " + total);
    System.out.println("The average is " + avgn);



    //after //(np++nn); (before) // in order to convert to a double you cast

  	
  }
}