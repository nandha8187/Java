package interiewprogramms;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String input = " hello nandha ";
		
		System.out.println(input.trim());
		
		System.out.println(input.replaceAll("^[ \t]+|[ \t]+$",""));
		
		System.out.println(input.replaceAll("^[ \t]",""));
		
		System.out.println(input.replaceAll("[ \t]+$",""));


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
