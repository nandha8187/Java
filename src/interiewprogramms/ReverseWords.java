package interiewprogramms;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//input: I love Cricket
		//output:cricket love I
		
		 String given ="I love Cricket";
		 
		 String reversed="";
		 
		 String[] temp = given.split(" ");
		 
		 System.out.println(temp.length);
		 
		 for (int i = temp.length-1; i >=0; i--) {
			 
			 reversed=reversed+temp[i]+" ";
			 
			
		}
		
		
		System.out.println(reversed);
		
	    
		
		
	}

}
