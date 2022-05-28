     package important;

import java.util.Scanner;

public class Arms {

	public static void main(String[] args) {
		
		System.out.println("ENTER A NUMBER");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int len =String.valueOf(a).length();
        int temp=a;
        double output=0;
        
        while (a>0) {
         int rem=a%10;
         output=output+Math.pow(rem, len);
         a=a/10;
        }
        if (temp==output) {
        	System.out.println("ARMSTRONG NO");
			
		} else {
			System.out.println("NOT AN ARMSTRONG NO");

		}
          
        }
	}


