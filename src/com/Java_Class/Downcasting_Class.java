package com.Java_Class;

public class Downcasting_Class extends Upcasting_Class {

	
	public  void hi() {
		
		System.out.println("hiiiiiiiiiii");
	
	}
	
	


	public static void main(String[] args) {
		
	Upcasting_Class up = new Downcasting_Class();
	
	up.name();
	up.car();

	
	
	}
}
