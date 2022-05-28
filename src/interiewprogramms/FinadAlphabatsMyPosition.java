package interiewprogramms;

import java.util.Scanner;

public class FinadAlphabatsMyPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Enter your character : ");
	   
	   char givenChar = scanner.next().charAt(0);
	   
	   givenChar = Character.toLowerCase(givenChar);
	   
	   int asciiValue=(int)givenChar;
	   
	   int position=asciiValue-96;  //using uppercase 64
	   
	   System.out.println(position);
	   
	

	
	}

}
