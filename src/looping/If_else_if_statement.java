package looping;

import java.util.Scanner;

public class If_else_if_statement {
	
	//-->if-else-if-statement
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER THE MARK");
	    int mark = scan.nextInt();
	    
	    if (mark<45) {
	    	System.out.println("U-GRADE(arrear)");
			
		}else if (mark>45 && mark<=60){
			System.out.println("D-GRADE");
		
		}else if (mark>60 && mark<=70) {
			System.out.println("C-GRADE");
		
		}else if (mark>70 && mark<=80) {
			System.out.println("B-GRADE");
		
		}else if (mark>80 && mark<=90) {
			System.out.println("A-GRADE");
		
		}else if (mark>90 && mark<=100) {
			System.out.println("S-GRADE");
		}
	    else {
	    	System.out.println("U/A");
		}
       
	}
	 
}
        	 