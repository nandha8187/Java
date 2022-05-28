package important;

public class Reverse_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          String a = "NANDHA";
          
          String temp = "";
          
          for (int i = a.length()-1; i >=0; i--) {
        	  
        	  char value = a.charAt(i);
        	  
        	  temp= temp + value;
        	
        	  
		}
	
	     System.out.println(temp);
	}

}
