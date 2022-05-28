package com.Access;

public class Child  extends Parent_1{
	
	public void value() {
		System.out.println("VALUES");
	}
	private void car() {
		System.out.println("RRR");
		
	}
	private void collec() {//collection of parent and child class method
		this.value();
		super.name();
		this.car();
		super.name();
		
    }
	
	public static void main(String[] args) {
	
		//object
		//object obj.name = new classname();
		Child cat = new Child();
		cat.collec();
		
	}

}
