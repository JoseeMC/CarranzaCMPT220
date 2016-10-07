/**
 * file: driver_proj1.java
 * author: Jose Carranza
 * course: CMPT 220
 * assignment: project 1
 * due date: October 3, 2016
 * version: 1.3
 * 
 * This file uses two vectors which then uses the vectors and conlves them
 * 
 */


import java.util.Scanner;
import java.io.*;

public class driver_proj1 {
  public static void main(String[] args) {
    Scanner scanFile = new Scanner(System.in);
    // write 
    int vFirst = scanFile.nextInt();
    int vSecond = scanFile.nextInt();

    double[] firstArray1 = new double[vFirst];
    double[] secArray2 = new double[vSecond];

    for(int j= 0; j < vFirst; j++){
    	firstArray1[j] = scanFile.nextDouble();
    }

    for(int j=0; j< vSecond; j++){
    	secArray2[j] =scanFile.nextDouble();
    }
    double[] vResult = convolveVectors(firstArray1,secArray2);

    for(int k=0; k <(vResult.length - 1); k++){
    	System.out.printf("%d ", Math.round(vResult[k]));
    }

    System.out.printf("%d\n", Math.round(vResult[vResult.length-1]));
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    for(int k=0; k < vResult.length; k++){
      vResult[k]=0.0;

      for(int slide = 0; slide < vSecond.length; slide++){
      	if((k - slide >= 0) && (k - slide< vFirst.length)){
      		vResult[k] += vFirst[(k - slide)] * vSecond[slide];
      	}
      }
    }

    return vResult;  
  }

}