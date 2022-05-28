package array_string;

public class StringLiteral_class {
	public static void main(String[] args) {
		
	 String s = "Literal type of string here";
	 String s1 = "Literal type of string here";
	 String s2 = "Literal type of string here";
	 String s3 = "Literal type of string here";
	 String s4 = "Literal type of string here";
	
      System.out.println(System.identityHashCode(s));
      System.out.println(System.identityHashCode(s1));	
      System.out.println(System.identityHashCode(s2));
      System.out.println(System.identityHashCode(s3));
      System.out.println(System.identityHashCode(s4));
      
      s=s1+s2+s3+s4;
       
      System.out.println(s);
      System.out.println(System.identityHashCode(s));
      
	
	
	}
	
	

}
