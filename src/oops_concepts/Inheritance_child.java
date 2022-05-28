package oops_concepts;

public class Inheritance_child extends Inheritance_Parent{

	public void xyz() {
		System.out.println("xyz");
		
	}
public static void main(String []args) {
   
	Inheritance_child IC = new Inheritance_child();
     IC.bike();
     IC.car();
     IC.xyz();
    }
}
