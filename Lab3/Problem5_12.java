/**
* File: Problem5_12.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab3
* Due Date: September 22
* Version: 1.8
*
*
*Finds the smallest integer
*
*/
import java.util.Scanner;

public class Problem5_12{
  public static void main(String[] args){

    int n = 1; 
    while (Math.pow(n,2) <= 12000){
    	n++;
    }

    System.out.println("The n is " + n);
    System.out.println("The n^2 is " + Math.pow(n,2));


	}
}