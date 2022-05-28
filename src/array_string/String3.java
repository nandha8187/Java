package array_string;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =" Miss you raina                  ";
		
		//trim space
		String t = s.trim();
		System.out.println(t);
		
		//its empty or in string
		boolean emp = s.isEmpty();
		System.out.println(emp);
		
		//two string add 
		String d ="comeback strong";
		String concat = d.concat(s);
		System.out.println(concat);
		
		String[] split = s.split(" ");
		for (String g: split) {
			System.out.println(g);
			
		}
		
		
	}

}
