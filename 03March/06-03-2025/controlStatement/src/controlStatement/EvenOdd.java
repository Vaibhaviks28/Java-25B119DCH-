package controlStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("enter no to check even odd");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}

	}

}
