package testControl;

public class Factorial {
	
	//!5= 5*4*3*2*1 ///fact=fact*i i=1 to n

	public static void main(String[] args) {
		int fact = 1;
		for(int i=5;i>=1;i--) {
			fact=fact*i ;
		}
		System.out.println("Factorial  is "+fact);

	}

}
