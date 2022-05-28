package oops_concepts;

public class Method_Overloading {
  
       
  
	public void human(int reg) {
         System.out.println(reg);
	}
	public void human(String name) {
		System.out.println(name);
	}
	public void human(char c) {
	     System.out.println(c);
    }  
	public void human(float a) {
		System.out.println(a);
	}
	public void human(int inte, int ext) {
		System.out.println(inte-ext);
	}
    public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.human(3054);
		mo.human("kumar");
		mo.human('m');
		mo.human(80f);
		mo.human(100,50);
    }	
		
		
	}