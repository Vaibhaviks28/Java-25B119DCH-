package com;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,p,result=1;
		
		System.out.println("enter base number");
		n=sc.nextInt();
		
		System.out.println("enter power number");
		p=sc.nextInt();
		
		sc.close();
		
		for(int i=1;i<=p;i++) {
			result=result*n;
			
		}
		System.out.println("power is "+result);
	}

}
