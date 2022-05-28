package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public  class List_2 {


//List <wrapperClass> refName = new (types of list)<WrapperClass>();
	
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>();
		
		System.out.println(l);
		
		l.add(123);
		l.add("NANDHA");
		l.add(5.9);
		l.add("KUMAR");
		l.add('S');
		
		System.out.println(l);	
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(2);
		System.out.println(object);
		
		Object set = l.set(4,"K");
		System.out.println(l);
		
		Object remove = l.remove(3);
		System.out.println(l);
		
		int indexOf = l.indexOf("NANDHA");
		System.out.println(indexOf);
		
		boolean contains = l.contains("NANDHA");
		System.out.println(contains);
		
//		 

		
		List<Object> l2 = new LinkedList<Object>();
		
		l2.add(619);
		l2.add("MSD");
		l2.add('d');
		l2.add(7.1);
		l2.add(45898);
		
		System.out.println(l2);
		
		boolean addAll = l2.addAll(l);
		System.out.println(l2);
		
		l2.retainAll(l);
        System.out.println(l2);		
		
		//l.removeAll(l2);
		//System.out.println(l);
		
		
		
		
		
		
		
		
		
	}
	

}
