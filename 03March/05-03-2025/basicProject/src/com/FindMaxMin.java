package com;

import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
				int num1,num2,num3;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first number:");
				num1 = sc.nextInt();
				
				System.out.println("Enter second number:");
				num2 = sc.nextInt();
				System.out.println("Enter third number:");
				num3 = sc.nextInt();
				
				int max = ((num1>num2))? ((num1>num3)?num1 :num3) : ((num2>num3) ? num2 :num3);
				System.out.println("Maximum number:"+max);
				
				int min = ((num1<num2))?((num1<num3) ? num1 : num3) :((num2<num3) ? num2 :num3);
				System.out.println("Minimum number:"+min);
			}
		}


