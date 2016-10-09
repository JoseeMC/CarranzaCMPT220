/**
* File: Problem6_8.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab4
* Due Date: September 26
* Version: 1.8
*
*
* Temperature converter
*
*/

import java.util.Scanner;

public class problem6_8{
  public static void main (String[] args) {

    double degCel = 40;
    double degFar = 120;

    System.out.format("%-10s%-10s | %15s%12s \n",
                      "Celsius", "Farenheit", "Farenheit", "Celsius");

    for (degCel = 40, degFar = 120; degCel > 30; degCel --, degFar =degFar -10){
   	  System.out.format("%-10.1f%-10.1f | %-15.1f%12.2f\n",
   	                    degCel, Cel2Far(degCel), degFar, Far2Cel(degFar));
    }
  }

  public static double Cel2Far(double celsius){
    double conFar = (9.0/5.0 * celsius + 32);
    return conFar;
  }
  public static double Far2Cel (double far){
    return (5.0/9.0) * far - 32;
  }
}