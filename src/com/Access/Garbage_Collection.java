package com.Access;

public class Garbage_Collection {
	
	public Garbage_Collection () {
		System.out.println("java");
   }

   public Garbage_Collection (int a) {
	   System.out.println("java");
	   System.out.println(a);
	   
  }
  public Garbage_Collection(float c) {
	  System.out.println(c);
   }
  
  public static void main(String[] args) throws Throwable {
	  
	  Garbage_Collection c = new Garbage_Collection(10);
	  c.finalize();
	 
	  Garbage_Collection c1 = new Garbage_Collection(44f);
      c1.finalize();
  }
}
