package important;

public class Arstrong_NO {

	public static void main(String[] args) {
		
	        int a = 153;
	
	        int temp =a;
	        
	        int rem= 0;
	        
	        int value = 0;
	        
	
	        while (temp > 0) {
	        	
	        	rem = temp % 10;   //remainder
	        	
	        	value = value + (rem * rem * rem);
	        	
	        	temp = temp/10;   //quotient
	        	
	        }
	        
	        if(a == value) {
	        	
	        	System.out.println("Armstrong Number");
	        	
	        	
	        }
	        
	        else {
	        	System.out.println("Not armstrong Number");
	        }
	

	
	}

	
	
}
