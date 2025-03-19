package com;

import java.util.Scanner;

//operator: is a symbol used to perform some operation
//operand: is a variable
//expression:operand and operator combination in the expression
//x+y

//Arithmetic operator: + - * / %
//Dynamic initialization : variable can be declare and initilize anywhere in the program


public class TestOperator {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter Number 1");
	num1=sc.nextInt();
	
	System.out.println("Enter Number 2");
	num2=sc.nextInt();
	
	System.out.println("Addition of num1 and num2 :"+(num1+num2));
	System.out.println("Substraction of num1 and num2 :"+(num1-num2));
	System.out.println("Multiplication of num1 and num2 :"+(num1*num2));
	System.out.println("Division of num1 and num2 :"+(num1/num2));
	System.out.println("Modification of num1 and num2 :"+(num1%num2));

	}

}


//write a to input radius and find the are of perimeter of circle
//to find area of square and rectangle