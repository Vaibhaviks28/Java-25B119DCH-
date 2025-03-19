package controlStatement;

import java.util.Scanner;

public class TestControlStatement {
	//control statement (decision making or conditional):the normal flow of the program is based on one condition
	//decision: if,if else, if else if else,nested,switch
	//loop : for ,while,do while
	//jump statement: break ,continue
	
	//if : 
	// if(expression)
	// {
	// body of if  //expression is true then if block execute
	// }
	//

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		if(num>0) 
		{
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negetive");
		}

	}

}
