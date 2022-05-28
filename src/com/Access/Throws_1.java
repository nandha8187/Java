package com.Access;

public class Throws_1 {
	
	public static void vote (int age) throws Exception {
		
		
		if(age >=18) {
			
			System.out.println("able to vote");
			
		}else {
			throw new Exception("not able to vote");
		}
	}
   
	
	public static void main(String[] args)  throws Throwable{
	   vote(56);
	   
	
}

}
