package conversion;

public class ObjectToStringStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="NANDHA";
		
		StringBuilder sb=new StringBuilder(s);  
		
		sb.reverse();  
		
		String rev=sb.toString();              //converting StringBuilder to String  
		
		System.out.println("String is: "+s);  
		
		System.out.println("Reverse String is: "+rev);  
		
		
		
	
		
		
		
	}

}
