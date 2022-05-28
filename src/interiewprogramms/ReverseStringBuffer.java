package interiewprogramms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseStringBuffer {



	public void usingBuffer() {

		String given ="nandhu";

		StringBuffer buffer = new StringBuffer();
		buffer.append(given);

		System.out.println(buffer.reverse());
	}

	public void usingOwnLogic() {


		String given="nandhu";

		char[] characterArray = given.toCharArray();

		String reversed="";

		for (int i = characterArray.length-1; i>=0; i--) {

			reversed=reversed+characterArray[i];

		}

		System.out.println(reversed);


	}

	public void usingCollection() {

		String given="nandhu";

		char[] Array = given.toCharArray();

		List<Character> list = new ArrayList<Character>();
		
		for (char character : Array) {
    	   
    	   list.add(character);
		
	    }
		
		Collections.reverse(list);
		
	  Iterator<Character> iterator = list.iterator();
	  
	  
	  while (iterator.hasNext()) {
		
		  System.out.println(iterator.next());
		
	}

	}


	public static void main(String[] args) {

     ReverseStringBuffer astring = new ReverseStringBuffer();

      astring.usingBuffer();
      astring.usingOwnLogic();
      astring.usingCollection();


	}


}
