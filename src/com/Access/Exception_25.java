package com.Access;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
        
		System.out.println("ENTER YOUR AGE");
		String i =sc.next();
		System.out.println(i);
		
		try {
			System.out.println("ENTER YOUR AGE");
			int j=sc.nextInt();
			System.out.println(j);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(10/1);
		//System.out.println(10/2);
	
		
		
	}

}
