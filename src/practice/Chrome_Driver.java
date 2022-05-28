package practice;

public class Chrome_Driver implements Web_Driver{

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("jiii");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("haopp");
		
	}

	public static void main(String[] args) {
		
		Web_Driver driver =new Chrome_Driver();   //up casting  
	
	
		
	}
	
	
	
	
}
