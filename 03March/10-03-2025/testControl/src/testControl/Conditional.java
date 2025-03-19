package testControl;

import java.util.Scanner;

public class Conditional {
	
	//if else if else if..else
	//when we have multiple condition
	
	//find grade of student

/*	public static void main(String[] args) {
		
		int marks;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter marks");
		marks =sc.nextInt();
		
		if(marks>=90)
			System.out.println("Grade A");
		else if(marks>=80 && marks<90)
			System.out.println("Grade B");
		else if(marks>=70 && marks<80)
			System.out.println("Grade C");
		else if(marks>=60 && marks<70)
			System.out.println("Grade D");
		else
			System.out.println("Grade F");
		

	}
	
	*/
	
	//nested if :if in another if
	//WAP to check greater and smaller
	
public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
		
		System.out.println("Enter 3rd number");
		num3=sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" Num1 is greater");
			}
			else {
				System.out.println(num3+" Num3 is greater");
			}
		}
		else
		{
			if(num2>num3){
				System.out.println(num2+" Num2 is greater");
			}
			else {
				System.out.println(num3+" Num3 is greater");
			}
		}
		
		
		
	
		

	}
	
	
	

}
