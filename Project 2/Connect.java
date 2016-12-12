/**
* File: Connect.java
* Author: Jose Carranza
* course: CMPT220
* Assignment: LAST PROJ 2
* Due Date: DECEMBER 9
* Version: 1.8
*
*
*In this project the user will be able input their religion. Depending on the religion it would
* give three different outputs. MERRY CHRISTMAS, HAPPY HANUKKAH OR HAPPY HOLIDAYS.
*/

import java.util.Scanner;

public class Connect{
  public static void main (String[]args){
  	Scanner input = new Scanner (System.in);
  	String religion;
  	System.out.println("Please enter your relgion:");
  	religion = input.next().trim();
  		
  	if(religion.equals("christianity") || religion.equals("christian")) {

	  System.out.println("MMMM     MMMM"+ "  " + "EEEEEEE"+ "    " + "RRRRRRRRR" + "    " 
	  	  	+ "RRRRRRRRR" + "   " + "YYYY   YYYY");
	  System.out.println("MMM  M M  MMM"+ "  " + "EE"+ "         " + "RRRR   RRR"
	       + "   " + "RRRR   RRR" + "   " + " YYY  YYY");
	  System.out.println("MMM   M   MMM"+ "  " + "EEEE"+ "       " + "RRRR  RRR" 
	      	+ "    " + "RRRR  RRR" + "    " + "   YYY");
	  System.out.println("MMM   M   MMM"+ "  " + "EEEE"+ "       "
	       + "RRRRRRRRR " + "   " + "RRRRRRRRRR" + "   " + "   YYY");
	  System.out.println("MM         MM"+ "  " + "EE" + "         "
	       + "RRR    RRR" + "   " + "RRR    RRR" + "  " + "    YYY");
	  System.out.println("MM         MM"+ "  " + "EEEEEEEE"+ "   " + "RRR    RRR" 
	      	+ "   " + "RRR    RRR" + "   " + "   YYY");
	  
	  System.out.println("");
	  System.out.println("CCCCCCCCCCCCC"+ "  " + "HHH   HHH"+ "   " + "RRRRRRRRR"+ "   " 
	      	+ "IIIIIIIII"+ "   " + "SSSSSSSSS"+ "   " + "TTTTTTTTT"+ "   " + "MMMM     MMMM"+ "   "
	      	 + "   AAAA"+ "      " + "SSSSSSSSS");
	  System.out.println("CCCCCCCCCCCC "+ "  " + "HHH   HHH"+ "   " + "RRRR   RRR"+ "   " 
	      	+ "  III"+ "      " + "SSSS"+ "        " + "   TTT" + "     "+ " MMM  M M  MMM"+ "   "
	      	 + "  AA  AA"+ "     " + "SSSS");
	  System.out.println("CCCC         "+ "  " + "HHHHHHHHH"+ "   " + "RRRR  RRR"+ "   " 
	      	+ "   III"+ "      " + "SS"+ "          " + "   TTT"+ "      " + "MMM   M   MMM"+ "   " 
	      	+ " AAA  AAA"+ "    " + "SS");
	  System.out.println("CCCC         "+ "  " + "HHHHHHHHH"+ "   " + "RRRRRRRR"+ "   " 
	      	+ "    III"+ "      " + "SSSSSSSSSS"+ "  " + "   TTT"+ "      " + "MMM   M   MMM"
	      	+ "   " + "AAAAAAAAAA"+ "   " + "SSSSSSSSS");
	  System.out.println("CCCCCCCCCCCC"+ "   " + "HHH   HHH"+ "   " + "RRR   RRR"+ "   " 
	      	+ "   III"+ "      " + "      SSS"+ "   " + "   TTT"+ "      " + "MM         MM"+ "   " 
	      	+ "AAA    AAA"+ "   " + "      SSS");
	  System.out.println("CCCCCCCCCCCCC"+ "  " + "HHH   HHH"+ "   " + "RRR   RRR"+ "   " 
	      	+ "IIIIIIIII"+ "   " + "SSSSSSSSSS"+ "   " + "  TTT"+ "      " + "MM         MM"+ "   " 
	      	+ "AAA    AAA"+ "   " + "SSSSSSSSS");
 	}	
 	else if(religion.equals("jewish") || religion.equals("jew")){
	  System.out.println("");
	  System.out.println("HHH   HHH"+ "  " + "  AAAA"+ "   " + "PPPPPPPP"+ "     " 
	      	+ "PPPPPPPP"+ "    " + "YYYY   YYYY");
	  System.out.println("HHH   HHH"+ "  " + " AA  AA"+ "   " + "PPPP   PPP"+ " " 
	      	+ " PPPP   PPP"+ "  " + " YYY  YYY");
	  System.out.println("HHHHHHHHH"+ "  " + "AAA  AAA"+ "   " + "PPPP  PPP"+ "  " 
	      	+ " PPPP  PPP"+ "  " + "   YYY");
	  System.out.println("HHHHHHHHH"+ "  " + "AAAAAAAA"+ "   " + "PPPPP"+ "       " 
	      	+ " PPPP"+ "      " + "   YYY");
	  System.out.println("HHH   HHH"+ "  " + "AAA   AAA"+ "   " + "PPPP"+ "       " 
	      	+ " PPPP"+ "      " + "   YYY");
	  System.out.println("HHH   HHH"+ "  " + "AAA   AAA"+ "   " + "PPPP"+ "       "
	       + " PPPP"+ "      " + "   YYY");

	  System.out.println("");
	  System.out.println("HHH  HHH"+ "  " + "  AAAA"+ "     " + "NNN  NNN" + "  "+ "UUU  UUU"
	      	+ "  "+ "KK  KKK"+ "  "+ "KK  KKK"+ "  "+ "  AAAA "+ "    "+ "HHH  HHH");
	  System.out.println("HHH  HHH"+ "  " + " AA  AA"+ "    " + "NNN  NNN"+ "  " + "UUU  UUU"
	      	+ "  "+ "KK KK"+ "    "+ "KK KK"+ "    "+ " AA  AA"+ "    "+ "HHH  HHH");
	  System.out.println("HHHHHHHH"+ "  " + "AAA  AAA"+ "   " + "NN NNNNN"+ "  " + "UUU  UUU"
	      	+ "  "+ "KKKK"+ "     "+ "KKKK"+ "     "+ "AAA  AAA"+ "   "+ "HHHHHHHH");
	  System.out.println("HHHHHHHH"+ "  " + "AAAAAAAA" + "   " + "NN  NNNN"+ "  " + "UUU  UUU"
	      	+ "  "+ "KK  K"+ "    "+ "KK  K"+ "    "+ "AAAAAAAA" + "  "+ " HHHHHHHH");
	  System.out.println("HHH  HHH"+ "  " + "AAA  AAA"+ "   " + "NN  NNNN"+ "  " + "UUUUUUUU"
	      	+ "  "+ "KK  KK"+ "   "+ "KK  KK"+ "   "+ "AAA  AAA"+ "   "+ "HHH  HHH");
	  System.out.println("HHH  HHH"+ "  " + "AAA  AAA"+ "   " + "NNN   NN"+ "  "+ "UUUUUUUU"
	      	+ "  "+ "KK  KKK"+ "  "+ "KK  KKK"+ "  "+ "AAA  AAA"+ "   "+ "HHH  HHH");
    
	}
	else{
	  System.out.println("");
	  System.out.println("HHH   HHH"+ "  " + "  AAAA   "+ "   " + "PPPPPPPP  "+ "  " 
	      	+ "PPPPPPPP  "+ "  " + "YYYY   YYYY");
	  System.out.println("HHH   HHH"+ "  " + " AA  AA  "+ "   " + "PPPP   PPP"+ " " 
	      	+ " PPPP   PPP"+ "  " + " YYY  YYY");
	  System.out.println("HHHHHHHHH"+ "  " + "AAA  AAA "+ "   " + "PPPP  PPP "+ " " 
	      	+ " PPPP  PPP "+ "  " + "   YYY");
	  System.out.println("HHHHHHHHH"+ "  " + "AAAAAAAA "+ "   " + "PPPPP     "+ " " 
	      	+ " PPPP      "+ "  " + "   YYY");
	  System.out.println("HHH   HHH"+ "  " + "AAA   AAA"+ "   " + "PPPP      "+ " " 
	      	+ " PPPP      "+ "  " + "   YYY");
	  System.out.println("HHH   HHH"+ "  " + "AAA   AAA"+ "   " + "PPPP      "+ " " 
	      	+ " PPPP      "+ "  " + "   YYY");

	      
	  System.out.println("");
	  System.out.println("HHH   HHH"+ "  " + " OOOOOOO" + "    " + "LLL"+ "     " + "  IIII"
	      	+ "  " + "DDDDDD" + "    " + "   AAAA"+ "       " + "YYYY  YYYY" );
	  System.out.println("HHH   HHH"+ "  " + "0OO   OOO"+ "   " + "LLL"+ "     " + "  IIII"
	      	+ "  " + "DDD  DDD" + "   "+ " AA  AA" + "     " + " YYY YYY" );
      System.out.println("HHHHHHHHH"+ "  " + "OOO   OOO"+ "   " + "LLL"+ "     " + "  IIII"
	    	+ "  " + "DDD  DDDD"+ "  " + "AAA  AAA" + "    " + "   YYY" );
	  System.out.println("HHHHHHHHH"+ "  " + "OOO   OOO"+ "   " + "LLL"+ "      " + " IIII"
	      	+ "  " + "DDD  DDDD"+ "  " + "AAAAAAAAA" + "   " + "   YYY"  );
	  System.out.println("HHH   HHH"+ "  " + "OOO   OOO"+ "   " + "LLLLLLLL"+ " " + " IIII"
	      	+ "  " + "DDD  DDDD"+ "  " + "AAA   AAA" + "   " + "   YYY" );
      System.out.println("HHH   HHH"+ "  " + " OOOOOOO"  + "    " + "LLLLLLLL"+ " " + " IIII"
	      	+ "  " + "DDDDDDD" + "    " + "AAA   AAA " + "  " + "   YYY" );
	}
  }
}