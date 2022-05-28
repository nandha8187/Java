package oops_concepts;

public class Test implements Addition{

	public int add(int i, int j) {
	      int k = i+j;
	      return k;
	   }
	   public static void main(String args[]) {
	      Test t = new Test();
	      System.out.println("k value is:" + t.add(10,20));
	   }
	}
	
	
	
