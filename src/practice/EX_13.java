package practice;

import java.util.Scanner;

public class EX_13 {
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("ENTER THE NO:");
		int no1 = t.nextInt();
		
		for (int i = 0; i <10; i++) {
			System.out.println(no1 + " x " + (i+1) + " = " + (no1 * (i+1)));
			
		}
		
	}

}
