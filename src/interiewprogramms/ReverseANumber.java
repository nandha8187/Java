package interiewprogramms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int givenNumber=1023;
		
		int reversedNumber=0;
		
		//Scanner
		
		System.out.println("Enter you numbaer :");
		
		Scanner s = new Scanner(System.in);
	    givenNumber = s.nextInt();
	    
		
		while (givenNumber!=0) {
		
		
		 reversedNumber=reversedNumber*10;
		 reversedNumber=reversedNumber+givenNumber%10;
		 givenNumber=givenNumber/10;
		
		}
		
		System.out.println(givenNumber);
		
		
		
		
		
	}

}
