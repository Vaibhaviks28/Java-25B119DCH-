package com;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		float area;
		int w,l;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter width");
		w=sc.nextInt();
		
		System.out.println("Enter length");
		l=sc.nextInt();
		
		area=w*l;
		
		System.out.println("Area of rectangle is "+area);

	}

}
