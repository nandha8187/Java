
package array_string;

public class String_2 {

	public static void main(String[] args) {
		
		String s ="Welcome to Mcg";
		
		

		
		//s.length()
		int length = s.length();
		System.out.println(length);
		
		//s.equals()
	    boolean equals = s.equals("Welcome to Mcg");
	    System.out.println(equals);
	    
	    //s.equalsIgnoreCase(s)
	    boolean equalsIgnoreCase = s.equalsIgnoreCase("WelcOMe TO mcg");
	    System.out.println(equalsIgnoreCase);
	    
	    //s.toUpperCase()
	    String uppercase = s.toUpperCase();
	    System.out.println(uppercase);
	    
	    //s.toLowerCase()
	    String lowerCase = s.toLowerCase();
	    System.out.println(lowerCase);
	    
	    //s.startsWith()
	    boolean startsWith = s.startsWith("W");
	    System.out.println(startsWith);
	    
	    //s.endsWith()
	    boolean endsWith = s.endsWith("g");
	    System.out.println(endsWith);
	    
	    //s.contains()
	    boolean contanis = s.contains("Mcg");
	    System.out.println(contanis);
	    
	    //s.indexOf()
	    int indexOf = s.indexOf("m");
	    System.out.println(indexOf);
	    
	    //s.lastIndexOf()
	    int lastIndexOf = s.lastIndexOf("g");
	    System.out.println(lastIndexOf);
	    
	    //s.charAt()
	    char charAT = s.charAt(5);
	    System.out.println(charAT);
	    
	    //s.replace()
	    String replace = s.replace("to", "thar");
	    System.out.println(replace);
	  
	    //s.substring()
	    String substring = s.substring(9);
	    System.out.println(substring);
	    
	    //s.split()
	    String[] split =s.split("   ");
	    for (String string : split) {
	    	System.out.println(string);
			
		//s.trim()		
	    //String t = "   kumar   ";	    
	    //String trim =t.trim();
		//System.out.println(trim);
		
	    //s.concat
 		//String a ="   boxing day test";
		//String concat =s.concat(a);
		//System.out.println(concat);
	    

	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
