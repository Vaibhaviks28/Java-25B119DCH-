package com;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		float area;
		 float pi=3.14f;
		 int r;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter value of radius");
		 r=sc.nextInt();
		
		
		area = pi *r *r;
		System.out.println("Area of circle is :"+area);

	}

}
