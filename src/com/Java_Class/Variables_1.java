 package com.Java_Class;

public class Variables_1 {
	
	int a = 20;//instant var
	float b=(float)80.0;
    static int s =12;//static variable
    
    public void name() {
    	int b =25;//local variable
    	System.out.println("local varible+instant varible " + a+b);
    	
    }
    public void house() {
    	int a =25;
    	System.out.println("local variable "+a+b);
    	
   }
   private static void car() {//static method
	   int c= 222;
	   System.out.println("My car "+s);
	
	   
}

   public static void main(String[] args) {
	   Variables_1 v = new Variables_1();
	   
	   v.name();
	   v.house();
	   System.out.println("static variable "+s);
	   car();//static method call	   
  }
}
