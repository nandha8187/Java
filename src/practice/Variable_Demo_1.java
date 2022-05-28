package practice;

public class Variable_Demo_1 extends Variable_Demo{

	
	int age =10;
	
	public void ug() {
		
		System.out.println(this.age);
		System.out.println(super.age);
		
	}
	

	public static void main(String[] args) {
		
		
		Variable_Demo d = new Variable_Demo_1();
		d.college();
		d.hsc();
		d.sslc();
		
	
	}
	
	
}
