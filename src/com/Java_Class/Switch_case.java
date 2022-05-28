 package com.Java_Class;

import java.util.Scanner;

public class Switch_case {
	
	public static void main(String[] args) {
		
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("GAMES");
		String sports1 = s.next();
		
		switch (sports1) {
	      case "cricket":
	    	  System.out.println("ONE TEAM 11 MEMBERS PLAYING");
	    	  System.out.println("THREE FORMAT:TEST,ODI,T20");
		  break;
	      case"kabaddi":
	          System.out.println("ONE TEAM 7 MEMBERS PLAYING");
              System.out.println("TWO TYPE POINT:RAIDER,CATCHER");
           break;
	       default:
	    	  System.out.println("none of the above");
			break;
		}
		{
		 
		
		}
	}
}
	
}