package conversion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> alist = Arrays.asList("java","maven","cucumber","testng","java");
		
		System.out.println(alist);
		
		
		
		Set<String> hset = new HashSet<String>(alist);
		
		System.out.println("Created HashSet is");
		
		for (String string : hset) {
			
			System.out.println(hset);
			
		}
		
		
		 
      Set<String> tset2 = new TreeSet<String>(alist);
		
		System.out.println("Created HashSet is");
		
		for (String string :  tset2) {
			
			System.out.println(tset2);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
