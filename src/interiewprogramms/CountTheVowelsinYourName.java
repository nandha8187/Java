package interiewprogramms;

public class CountTheVowelsinYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input ="helllo word";
		
		int vowelsCount =0;
		
		input=input.toLowerCase();
		
		
		for (int i = 0; i <input.length(); i++) {
			
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'
					||input.charAt(i)=='o'||input.charAt(i)=='u') {
			
			vowelsCount++;
			
			
		}
		
		}
	   
		
		System.out.println("Your name has  "+vowelsCount+"vowle(s)");
		
		
		 
		
		
	}

}
