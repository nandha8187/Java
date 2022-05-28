package oops_concepts;

public class Child_class implements Interface_3,Interface_2,Interface_1{

	@Override
	public void sports() {
		System.out.println("CRICKET");// TODO Auto-generated method stub
		
	}

	@Override
	public void colour() {
		System.out.println("BLACK");// TODO Auto-generated method stub
		
	}

	@Override
	public void bike() {
		System.out.println("AVEBGER 160");// TODO Auto-generated method stub
		
	}

	@Override
	public void movie() {
		System.out.println("ASURAN");// TODO Auto-generated method stub
		
	}

	@Override
	public void drees() {
		System.out.println("BLACK SHIRT");// TODO Auto-generated method stub
		
	}

	@Override
	public void watch() {
		System.out.println("FAST TRACK");// TODO Auto-generated method stub
	
	}
	
	public static void main(String[] args) {
		Child_class c = new Child_class();
		c.sports();
		c.colour();
		c.bike();
		c.movie();
		c.drees();
		c.watch();
	}

}
