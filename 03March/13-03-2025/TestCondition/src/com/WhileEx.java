package com;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		int n ;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		n=sc.nextInt();
		
		sc.close();
		int sum=0;
		
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum of digits is "+sum);

	}

}
