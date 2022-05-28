package practice;

import java.util.Scanner;

public class EX_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double num =0;
           double x = 1;
           Scanner av = new Scanner(System.in);
           System.out.println("Input the number (n) you want to calculate the average: ");
           int n = av.nextInt();
           
           while (x <= n) {
        	   System.out.println("input number " + "("+ (int) x +")" + ":");
        	   num += av.nextInt();
        	   x +=1;
           }
        	
           double avgn = (num / n);
           System.out.println("Average: "+avgn);
        	   
        	   
		}
           
		
		
		}


