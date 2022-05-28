package important;

public class Fibbonacci_Series1 {
	
	
	
//Fibbonacci series;
//f1+f2 = f3
//0+1=1              0  1  1  2  3  5  8  13
//1+1=2              f1 f2 f3
//1+2=3                 f1 f2 f3
//2+3=5                    f1 f2 f3
//3+5=8
//5+8=13
//

   public static void main(String[] args) {
	   
	   int f1=0,f2=1,f3;       //printing 0 and 1  
	   for (int i=0; i <= 15;i++) {
		
	   f3=f1+f2;
	   f1=f2;
	   f2=f3;
	   
		System.out.print(f3+ " ");
	   }
   }
	
}
