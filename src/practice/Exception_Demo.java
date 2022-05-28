package practice;

public class Exception_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			int a=10;

			System.out.println(a/ 0);
		} catch (NullPointerException e) {

			System.out.println("handle null pointer");
			
		}
		catch (Exception e) {
			
			System.out.println("handle arithmatic");
			
			String s =null;
			
			System.out.println(s.toLowerCase());
			
			System.out.println("Execution Sucess");
		}
}
}
