   package com.Access;

public final class Final_1 {  //can't Access Child Class	
	
	final int b=1;  //once we declare can't change the value
	
	public final  void name() { //We can't Override in child class
		
		final int a=85;
		System.out.println(a);
	
		System.out.println(b);
		
	}

	public static void main(String[] args) {
	    Final_1 d = new Final_1();
		d.name();
	
}
}
