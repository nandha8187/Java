package array_string;

public class String_Nonliteral_Class {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Non Literal - Mutable String");
		StringBuffer s1 = new StringBuffer("Non Literal - Mutable String");
		StringBuffer s2 = new StringBuffer("Non Literal - Mutable String");	
		StringBuffer s3 = new StringBuffer("Non Literal - Mutable String");
		
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//mutable
		
		s.append(s);
		
		s.append(s1);
		
		s.append(s3);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
	
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
	
	}

}
