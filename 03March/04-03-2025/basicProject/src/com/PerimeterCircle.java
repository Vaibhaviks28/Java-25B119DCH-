package com;

import java.util.Scanner;

public class PerimeterCircle {

	public static void main(String[] args) {
		
		float perimeter;
		float pi=3.14f;
		int r;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Radius");
		r=sc.nextInt();
		
		perimeter= 2*pi*r;
		
		System.out.println("Perimeter of circle is :"+perimeter);
		

	}

}
