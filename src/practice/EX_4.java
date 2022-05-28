package practice;

import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {

		Scanner add = new Scanner(System.in);
		System.out.print("ENTER THE FIRST NO:");
		int no1 = add.nextInt();
		System.out.print("ENTER THE SECOND NO:");
		int no2 =add.nextInt();
		int sum = no1+no2;
		System.out.println();
		System.out.println("sum:" +sum);


	}

}
