package practice;

import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("ENTER THE FIRST NO:");
		int no1 = a.nextInt();
		
		System.out.print("ENTER THE SECOND NO:");
		int no2 =a.nextInt();
		
		System.out.println(no1 +" + "+ no2 + " = " + (no1+no2));
		System.out.println(no1 +" - "+ no2 + " = " + (no1-no2));
		System.out.println(no1 +" / "+ no2 + " = " + (no1/no2));
		System.out.println(no1 +" % "+ no2 + " = " + (no1%no2));

		
		}

}
