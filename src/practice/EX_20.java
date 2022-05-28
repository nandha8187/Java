package practice;

import java.util.Scanner;

public class EX_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner av = new Scanner(System.in);
      
      System.out.print("FIRST NO:");
      int no1 = av.nextInt();
      
      System.out.print("SECOND NO:");
      int no2 = av.nextInt();
      
      System.out.print("THIRED NO:");
      int no3 = av.nextInt();
      
      System.out.print("FOURTH NO:");
      int no4 = av.nextInt();
      
      System.out.print("FIFTH NO:");
      int no5 = av.nextInt();
      
      System.out.println("AVERAGE OF 5 NUMBERS IS:  " + (no1 + no2 + no3 + no4 + no5) / 5);
 }

}
