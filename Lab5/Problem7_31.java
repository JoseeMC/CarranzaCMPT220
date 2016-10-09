/**
* File: Problem7_31.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab5
* Due Date: October 4 2016
* Version: 1.8
*
*
*  From the two different list the program will merge them together and put 
* the numbers in chronological order.
*/

import java.util.Scanner;

public class Problem7_31 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list1:");
    int[] list1 = new int[input.nextInt()];
    for (int j = 0; j < list1.length; j++){
    	list1[j] = input.nextInt();
    }

    System.out.print("Enter list2:");
    int[] list2 = new int[input.nextInt()];
    for (int j = 0; j < list2.length; j++){
      list2[j] = input.nextInt();
    } 

    int[] list3 = merge(list1,list2);

    System.out.print("The merged list is ");

    for( int j=0; j< list3.length; j++){
      System.out.print(list3[j] + " ");
    }
  }

  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];

    int p = 0, k =0;
    for(int j=0; j < list3.length; j++) {
      if(k < list2.length&&list1[p] > list2[k] ) {
      	list3[j] = list1[k];
      	k++;
      } else if (p < list1.length) {
      	list3[j] = list1[p];
      	p++;
      }
    }

    return list3;
  }
}