package collection;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<Object> l = new ArrayList<Object>();
		
		System.out.println(l);
		
		l.add(123);
		l.add("NANDHA");
		l.add(5.9);
		l.add("KUMAR");
		l.add('S');
	    l.add("NANDHA");
	    l.add(123);
	    
	    System.out.println(l);
	    
	    int size = l.size();
        System.out.println(size);		
        
        Object object = l.get(3);
        System.out.println(object);
		
        Object set = l.set(5,"kumar");
        System.out.println(l);
        
        int indexOf = l.indexOf('S');
        System.out.println(indexOf);
		
		
		boolean contains = l.contains("S");
		System.out.println(contains);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
