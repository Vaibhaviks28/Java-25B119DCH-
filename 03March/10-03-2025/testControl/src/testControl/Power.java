package testControl;

import java.util.Scanner;

public class Power {
	
	//power of given no. 2^3  
	//2*2*2

	public static void main(String[] args) {
		int p,n,result = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		n=sc.nextInt();
		
		System.out.println("Enter Power");
		p=sc.nextInt();
		
		for(int i=1;i<=p;i++) {
			result=result*i;
		}
		System.out.println("Power of given number is"+result);

	}

}
