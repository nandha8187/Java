package com.Access;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ite_Met {

	public static void main(String[] args) {
		
		
	 List<Object>a = new LinkedList<Object>();

	 a.add(12);
	 a.add("java");                            
	 a.add(2.5);
	 
	 
	 
	 
	 System.out.println(a);
	 
	 Iterator<Object> it = a.iterator();
	 while(it.hasNext()) {                   //condition checking
		 System.out.println(it.next());      //printing
		
	}
	System.out.println("==================================");
	
	ListIterator<Object> li = a.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	
	System.out.println("==================================");
	
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	
  }
}
