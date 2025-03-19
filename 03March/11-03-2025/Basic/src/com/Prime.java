package com;

import java.util.Scanner;

public class Prime {
	
	public void printPrime() 
	{
		boolean flag=true;
		System.out.println("Enter number in between want to print prime number");
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		
		System.out.println("Prime number between "+n1+" to "+n2+" : ");
		for(int i=n1;i<=n2;i++) {
			flag=true;
			
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag && i>1) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		Prime pp=new Prime();
		pp.printPrime();
		
		

	}

}
