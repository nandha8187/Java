package important;

import java.util.Scanner;

public class Armstrong_number3 {

	public static void main(String[] args) {
	     
		//int rem=0,ans=0;
		Scanner s = new Scanner (System.in);
		System.out.println("ENTER THE NUMBERS");
		int n =s.nextInt() ;
		
		int rem=0,ans=0;
		int t =n ;
		
		while (n>0) {
			
			rem=n%10;
			ans=ans+(rem*rem*rem);
			n=n/10;
	   }
	   if (t == ans) {
		   System.out.println("ARMSTRONG NO");
	   } else {
		   System.out.println(" NOT ARMSTRONG NO");
	   }
	   
      }
	}
