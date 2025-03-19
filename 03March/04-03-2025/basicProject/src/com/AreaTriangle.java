package com;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		float area;
		int base,height;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of base");
		base=sc.nextInt();
		
		System.out.println("Enter value of height");
		height=sc.nextInt();
		
		area= 0.5f*base*height;
		
		System.out.println("Area of triangle is:"+area);

	}

}
