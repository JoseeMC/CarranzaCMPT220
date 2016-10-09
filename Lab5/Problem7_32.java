/**
* File: Problem7_32.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: Lab5
* Due Date: October 4
* Version: 1.8
*
*
*
*
*/

import java.util.Scanner;

public class Problem7_32 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter list:");
    int[] list1 = new int[input.nextInt()];
    for (int j =0; j < list1.length; j++) {
   	  list1[j]= input.nextInt();
    }

    partition (list1);

    System.out.print("After the partition, the list is ");

    for(int j=0; j < list1.length; j++) {
      System.out.print(list1[j] + " ");
    }

  }

  public static int partition(int[] list) {
  	int partition = list[0];
  	int partitionPlace = 0;
  	int br = list.length - 1;

  	while(partitionPlace < br) {
  	  if (partition>list[partitionPlace+1]) {
  	  	list[partitionPlace] = list[partitionPlace+1];
  	  	list[partitionPlace+1] = partition;
  	  	partitionPlace++;
  	  } else{
  	  	int t= list[br];
  	  	list[br] = list[partitionPlace+1];
  	  	list[partitionPlace+1] = t;
  	  	br--;
  	  }
  	}
  	return partitionPlace;
  }
}