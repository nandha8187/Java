package interiewprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {

	
	
	
	
	Integer givenArray[] = {2,2,1,5,6};
	
	
	public void findSmallest() {
		
		
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < givenArray.length; i++) {
			
			
			if (givenArray[i]<smallest) {
				
				
				smallest=givenArray[i];
				
			}
			
		}
	
		System.out.println("Smallest Number is :"+smallest);
		
	}
	
	//using Arrays
	
	
	public void usingArrays() {
	
	  Arrays.sort(givenArray);
	  
	  System.out.println(givenArray[0]);
	
	
	}
	
	public void usingCollections() {
	
		List<Integer>list=Arrays.asList(givenArray);
		
	    Collections.sort(list);
	    
	    int smallest = list.get(0);
	    
	    System.out.println(smallest);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallestNumberInArray array = new SmallestNumberInArray();
		
		array.findSmallest();
		array.usingArrays();
		array.usingCollections();
	}

}
