package conversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s = new HashSet<String>();
		s.add("hiiiii...");
		s.add("nandhu");
		s.add("nandhu");
		
		System.out.println(s);
		
		List<String> aslist = new ArrayList<String>(s);
		
		for (String string : aslist) {
		
			
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
