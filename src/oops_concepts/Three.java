package oops_concepts;

public class Three extends Two implements One {

	@Override
	public void name() {
		
		System.out.println("google nanbaa");
		
		}
	
	
	public static void main(String[] args) {
		
		
		Three hi = new Three();
		
		hi.name();
		hi.methodTwo();
		
		
		
	}
	

	
	
}
