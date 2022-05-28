
package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_25 {

	public static void main(String[] args) {
		
		Map<Integer, String> a=new HashMap<Integer,String>();
		
		a.put(1,"Java");
		a.put(2,"python");
		a.put(2, "selenium");
		a.put(3, "maven");
		a.put(4,"testing");
		a.put(5, "cucumber");
		a.put(6, "java");
		
		System.out.println(a);
		
		int b = a.size();
		System.out.println(b);
		
		String c = a.get(2);
		System.out.println(c);
		
		Set<Integer> d = a.keySet();
		System.out.println(d);
		
		Collection<String> e = a.values();
		System.out.println(e);
		
		boolean f = a.containsKey(8);
		System.out.println(f);
		
		boolean g = a.containsValue("cucumber");
		System.out.println(g);
		
        Set<Entry<Integer, String>> j = a.entrySet();
         
         System.out.println(j);
		
		
		
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
