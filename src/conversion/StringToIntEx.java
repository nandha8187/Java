package conversion;

public class StringToIntEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parseInt method
		String s ="200";                //Declaring String Variable
    	int i =Integer.parseInt(s);     //Converting String into int using Integer.parseInt()
        System.out.println(i);

        //parseInt conCat operation
    	String d ="200";
     	int G=Integer.parseInt(s);  
   		System.out.println(d+100);           
   	    System.out.println(G+100);

		//valueOf method
   	    String z= "876";
     	Integer c=Integer.valueOf(z);  
  	    System.out.println(c);  
		
		
		
		
		
	}

}
