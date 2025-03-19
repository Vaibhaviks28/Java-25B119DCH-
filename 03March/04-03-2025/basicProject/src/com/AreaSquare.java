package com;

import java.util.Scanner;

public class AreaSquare {

	public static void main(String[] args) {
		float area;
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter side value ");
		
		a=sc.nextInt();

		area= a*a;
		
		System.out.println("Area of square is :"+area);

	}

}
