package com;
import java.util.Scanner;

public class Farhenheight {
	Scanner sc=new Scanner(System.in);
	
	public void ConvertFarhenheight() {
		float f,c;
		System.out.println("Enter Celsius" );
		c=sc.nextFloat();
		f = 9/5* (c + 32);
		System.out.println("Farhenheight is :"+f);
		
	}
	
public void ConvertCelsius() {
	float f,c;
	System.out.println("Enter farhenheight" );
	f=sc.nextFloat();
	c = 5* (f - 32)/9;
	System.out.println("Celsius is :"+f);
			
	}

	public static void main(String[] args) {
		
		Farhenheight ff =new Farhenheight();	
		ff.ConvertFarhenheight();
		ff.ConvertCelsius();
		
		
		
		

	}

}
