package looping;

public class Nextedforloop_1 {
	
	public static void main(String[] args) {
		
	   for (int i = 1; i < 7; i++) {       //rows
		   for (int j = 0; j < i ; j++) {  //columns
		   
			    System.out.print(" #");
		}
	            System.out.println(); 
	}
	   for (int i = 7; i >  0; i--) {        //rows
	     for (int j = 0; j < i-2 ; j++) {    //columns
		   
	    	 System.out.print(" #");
		}
	         System.out.println(); 
	}
	}
}

