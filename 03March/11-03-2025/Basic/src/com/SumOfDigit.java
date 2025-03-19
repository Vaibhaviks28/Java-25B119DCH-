package com;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter you number");
		n=sc.nextInt();
		
		while(n!=0) {
		int d=n%10;
		sum=sum+d;
		n=n/10;
		}
		
		System.out.println("Digit of number is"+sum);
		}
}
