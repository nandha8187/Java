package oops_concepts;

public class Method_Overriding_Child extends Method_Overriding {
	
    @Override
	public void name() {
	   super.name();
	}
	 @Override
	public void house() {
		super.house();
	}
	@Override
	public void parameter1(float a, int b) {
		super.parameter1(a, b);
	}
	@Override
	public void parameters(int a, int b) {
		super.parameters(a, b);
	}
    @Override
    	public void parameters1(int a, int b) {
    		super.parameters1(a, b);
    }
    
   public static void main(String[] args) {
	   
	   Method_Overriding_Child mo = new  Method_Overriding_Child();
	   mo.name();
	   mo.house();
	   mo.parameter1(25, 859);
	   mo.parameters(88, 989);
       mo.parameters1(25, 58);  
   }
}
