package conversion;

public abstract class IntToStringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//value of Method
		int i=600;		
		String s = String.valueOf(i);
		System.out.println(i+200);  //800 because + is binary plus operator  
		System.out.println(s+800);  //600800 because + is string concatenation operator  
	  

		//toString Method
		int j=900;
        String d =Integer.toString(i);        
        System.out.println(j+76);
        System.out.println(d+87);
		
        //format
        int y=567;
        String q =String.format("%d",i);
   	    System.out.println(q);      
        
        
	}
	

}
