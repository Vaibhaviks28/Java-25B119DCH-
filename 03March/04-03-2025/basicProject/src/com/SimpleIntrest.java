package com;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

		float simple;
		int p,r,t;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter principal");
		p=sc.nextInt();
		
		System.out.println("Enter Rate of intrest");
		r=sc.nextInt();
		
		System.out.println("Enter time");
		t=sc.nextInt();

		simple = (p * r * t)/100;
		
		System.out.println("Simple intrest is :"+ simple); 

	}

}
