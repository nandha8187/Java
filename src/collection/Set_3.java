package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_3 {
	
	public static void main(String[] args) {
		
		Set<Object> h = new HashSet<Object>();
		
		System.out.println(h);
		
		h.add(143);
		h.add("KOHLI");
		h.add(90);
		h.add(619);
		h.add(111);
		h.add('D');
		h.add("KING");
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		
		int size = h.size();
		System.out.println(size);
	
	    boolean contains = h.contains("koHLI");
	    System.out.println(contains);
        
	   
	    Set<Object> l2 = new LinkedHashSet<Object>();
	
	    l2.add(437);
		l2.add("MSD");
		l2.add(86);
		l2.add(916);
		l2.add('K');
		l2.add("COOL");
	    l2.add(null);
	    l2.add(null);
		
		System.out.println(l2);
	    
	
		
		
		
		h.addAll(l2);
	    System.out.println(h);
	    
		//h.retainAll(l2);
		//System.out.println(h);

		//h.removeAll(l2);
		//System.out.println(h);
		
	    Set<String> Ts = new TreeSet<String>();
		 
	    Ts.add("abd92");
		Ts.add("daiina82");
		Ts.add("zyuo83");
		Ts.add("creh90");
		Ts.add("kuhss86");
		Ts.add("bthbfn437");
		System.out.println(Ts);
	     
		 
	  }

}
