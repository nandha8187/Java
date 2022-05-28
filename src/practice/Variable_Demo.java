package practice;

public class Variable_Demo {

	int age;  //class variable

	public void sslc() {

		int age =14;  //local

		System.out.println(age);
	}


	public void hsc() {

		age=16;

		System.out.println(age);

	}

	public void college() {

		System.out.println(age);

	}
	
	

	public static void main(String[] args) {

       Variable_Demo demo = new Variable_Demo();
       
       demo.college();
       demo.hsc();
       demo.sslc();
	
	}

}
