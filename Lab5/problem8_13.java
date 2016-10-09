/**
* File: problem8_13.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab5
* Due Date: October 4
* Version: 1.8
*
*The progam asks for the dimension of the array; in this case it would be 3 4 
*the purpose of the program is that it would combine the numbers and find the 
*location.
*/

import java.util.Scanner;

public class problem8_13{

	public static void main (String[] args){
	  java.util.Scanner input = new Scanner(System.in);

	  System.out.print("Enter the number of rows and columns of the array: ");
	  
	  int j = input.nextInt();
	  int k = input.nextInt();
	  int[] intResult;

	  System.out.println("Enter the Array:");
	  	double [][] dv = new double [j][k];
	  	for(int s = 0; s < j; s++){
	  	  for(int sn = 0; sn < k; sn++){
	  	    dv[s][sn] = input.nextDouble();
	  	  }
	  	}

	  	intResult = locLargest(dv);
	  	System.out.println("The location of the largest element is at(" + 
	  		intResult [0] + "," + intResult[1] + ")");
	  }

	  public static int[] locLargest(double[][] a) {
	  	double dMax = 0;
	  	int[] intReturn = new int[2];

	  	for (int s = 0; s < a.length; s++) {
	  	  for (int sn = 0; sn < a[s].length; sn++){
	  	  	if(a[s][sn] > dMax){
	  	  	  dMax = a[s][sn];
	  	  	  intReturn[0] = s;
	  	  	  intReturn[1] = sn;
	  	  	}
	  	  }
	  	}
	  	return intReturn;
	}
}