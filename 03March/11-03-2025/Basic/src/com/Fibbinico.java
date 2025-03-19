package com;

import java.util.Scanner;

public class Fibbinico {
	
	//0 1 1 2 3 5 8
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter terms");
		int terms=sc.nextInt();
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b);
		
		int i =1;
		while(i<=terms-2) {
		 c= a+b;
		 System.out.print(" "+c);
		 a=b;
		 b=c;
		 i++;
		}
		

	}

}
