package oops_concepts;

public class Multilevel_Son extends Multilevel_Father{

	private void hi() {
	 System.out.println("hwloooo");
	}
	
	
	
	 public static void main(String []args)
	 {
		 Multilevel_Son cg = new Multilevel_Son();
		 cg.bike();
		 cg.house();
		 cg.land();
		 cg.hi();
	 }
}
