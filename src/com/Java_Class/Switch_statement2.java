

package com.Java_Class;

import java.util.Scanner;

public class Switch_statement2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE VALUE");    
		String detail2 = scan.next();
		
		switch (detail2) {
		case "CHANNEL":
			System.out.println("SPORTS & MUSIC PACKAGE");
			System.out.println("CARTON & NEWS PACKAGE");
			break;
	    case "MALL":
	    	System.out.println("MOVIES & FOOD QUATES");
	    	System.out.println("GAMEING & DRESS SHOP");
			break;
	    default:
	    	System.out.println("NO MONEY YET");
			break; 
		}
	}

}
