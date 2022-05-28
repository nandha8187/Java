 package array_string;

public class Im_mutable {
	
	public static void main(String[] args) {
		
		
		String s  ="KUMAR";
		String s1 ="KUMAR";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
	
	}
}
