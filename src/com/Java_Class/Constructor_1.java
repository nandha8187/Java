package com.Java_Class;

public class Constructor_1 {

	public Constructor_1() { //Non parameterized
	     System.out.println("ball");	
	}	
    public Constructor_1(int a) { //Parameterized
	     System.out.println(a+"   integer");	
	}
    public Constructor_1(float a) {
    	System.out.println(a+"    float");
    }    
    public Constructor_1(char c) {
    	System.out.println(c+"       char");
    }
    public Constructor_1(String a) {
        System.out.println(a+"     string");
  }
   public static void main(String[] args) {
	    Constructor_1 non = new Constructor_1();
	    Constructor_1 int1 = new Constructor_1(98589);
        Constructor_1 char1 = new Constructor_1('k');
        Constructor_1 float3 = new Constructor_1(20f);
        Constructor_1 name = new Constructor_1("NGK");
   
   
   
   }




}