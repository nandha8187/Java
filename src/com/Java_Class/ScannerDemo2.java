package com.Java_Class;

import java.util.Scanner;

public class ScannerDemo2 {

	  public static void main(String[] args) {
		   // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
    
      int sum =0,count=0 ;
	
      while (sc.hasNextInt()) {
    	  
    	  int num =sc.nextInt();
    	  
    	  sum +=num;
    	  count ++;
    	  
    }
      int mean = sum/count;
      System.out.println("Mean: " + mean);
	
	
	
	  }
}
