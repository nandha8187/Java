package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_2 {
	
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>(); 
        System.out.println(m);
        m.put(1, "KING");
        m.put(2,"COOL");
        m.put(3,"DADA");
        m.put(3,"DEGREE");
        m.put(4,"DEGREE"); 
        m.put(null,"sports");
        m.put(null, "cricket");
        m.put(5, null);
        m.put(6, null);
         
       System.out.println(m);  
        
       int size = m.size();
       System.out.println(size);

       String string = m.get(2);
       System.out.println(string);
        
      Set<Integer> keySet = m.keySet();
      System.out.println(keySet);
      //Why set in here because set not allow duplicate value
      
      Collection<String> values = m.values();
      System.out.println(values);
      //Why collection here?
      //Because it will allow duplicate value and print Ascending order
        
      
      boolean containsKey = m.containsKey(4);
      System.out.println(containsKey);
       
      boolean containsValue = m.containsValue("COOL");
      System.out.println(containsValue);
	
      Set<Entry<Integer, String>> entrySet = m.entrySet();
      for (Entry<Integer, String> entry : entrySet) {
    	  System.out.println(entry);
		
	
     }
	
      
	}

}
