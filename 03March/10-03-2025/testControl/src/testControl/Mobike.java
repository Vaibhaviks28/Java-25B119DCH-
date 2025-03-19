package testControl;

import java.util.Scanner;

public class Mobike {
	String bno,name;
	int phno,days,charge;
	
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.println("Enter Bike no");
		bno=sc.next();
		
		System.out.println("Enter name of customer");
		name=sc.next();
		
		System.out.println("Enter phone no of customer");
		phno=sc.nextInt();
		
		System.out.println("Enter days to take bike on rent");
		days=sc.nextInt();
		
		
	}
	void compute() {
		if (days<=5) {
			charge=days*500;
		}
		else if (days<=10) {
			charge= (5*500)+((days-5)*400);
		}
		else {
			charge = (5*500)+(5*400)+((days-10)*200);
		}
		
	}
	
	void display() {
		System.out.println("Bike No: "+bno);
		System.out.println("Name of  Customer: "+name);
		System.out.println("Phone no of Customer : "+phno);
		System.out.println("No. of Days: "+days);
		System.out.println("Rent Charge: "+charge);
		
	}

	public static void main(String[] args) {
		
		Mobike mo=new Mobike();
		mo.input();
		mo.compute();
		mo.display();
	}

}
