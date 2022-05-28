package com.Access;

public class Exception_get {

public static void main(String[] args) {
	
	
       try {
		System.out.println(1/0);
	} catch (Exception e) {
		// TODO: handle exception
       String msg = e.getMessage();
       System.out.println(msg);
	}
	
	
	}	
	
}
