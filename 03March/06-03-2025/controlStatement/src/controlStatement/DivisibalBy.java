package controlStatement;

import java.util.Scanner;

public class DivisibalBy {

	public static void main(String[] args) {
		 int num;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a number: ");
	        num=sc.nextInt();
	        if(num%5==0 || num%10==0) {
	            System.out.println("Number is divisible by 5 or 10");
	        }
	        else {
	            System.out.println("Number is not divisible by 5 or 10");
	        }

	}

}
