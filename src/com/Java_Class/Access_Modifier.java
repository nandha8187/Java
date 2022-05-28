package com.Java_Class;

public class Access_Modifier {
 
	
	public void name1() {
		System.out.println("BEACH");
	}
	protected void name2() {
		System.out.println("MY PROTECTED AREA");
    }
	void defaultname3() {
		System.out.println("DEFAULT MTD");
	}
    private void privatearea(int a,int b) {
    	System.out.println(a+b);
    }
    public static void main(String[] args) {
		
    	Access_Modifier am = new Access_Modifier();
    	
    	am.privatearea(70,85);
    	am.name1();
    	am.name2();
        am.defaultname3();
    	}
}
