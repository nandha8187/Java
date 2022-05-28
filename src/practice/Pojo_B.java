package practice;

public class Pojo_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pojo_A a =new Pojo_A();

		int age = a.getAge();
		
		
		System.out.println("Age : "+age);

		a.setAge(19);              // age = 12;

		System.out.println("After Setters");

		int age_1 = a.getAge();

		System.out.println(age_1);


//		a.setAge(67);              // age = 12;
//
//		System.out.println("After Setters");
//
//		int age_2 = a.getAge();
//
//		System.out.println(age_2);



	}

}
