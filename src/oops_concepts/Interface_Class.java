 package oops_concepts;

public class Interface_Class implements Interface_1,Interface_2,Interface_3{

	@Override
	public void drees() {
		System.out.println("black pant");
	}
    @Override
	public void watch() {
        System.out.println("fast track");
	}
	@Override
	public void bike() {
		System.out.println("avenger 160");
	}
    @Override
	public void movie() {
	    System.out.println("K.G.F");
    }
	@Override
	public void sports() {
	      System.out.println("CRICKET");	
	}
    @Override
	public void colour() {
		 System.out.println("BLACK");
	}
   
     public static void main(String[] args) {
		
	   Interface_1 in1 = new Interface_Class();
	   in1.sports();
	   in1.colour();
	   
     
     }
	

}
