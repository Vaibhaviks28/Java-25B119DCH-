package com;

import java.util.Scanner;

public class CountDigit {
	
	public int DigiCount(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("enter number : ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		
		int totalDigit=new CountDigit().DigiCount(n);
		System.out.println("Total digits: "+totalDigit);

	}

}
