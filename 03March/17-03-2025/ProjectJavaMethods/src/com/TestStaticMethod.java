/*package com;
import java.util.Scanner;

//    Static Variables: Shared among all instances of the class.
//    Static Methods: Can be called without creating an object of the class. 


class Student
{
    private int id;  //instance variable
    private String name;//instance variable
    private static String college="SM";//class level variable
    private static  int count=0;//class level variable
    
    public void input()//instance method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id ");
        id=sc.nextInt();
        System.out.println("Enter  name");
        name=sc.next();
        //System.out.println("Enter college");
        //college=sc.next();//static variable can be defined inside non static method
    }
    
    void display()
    {
        System.out.println(id+" "+ name+" "+college);
        count++;
        System.out.println(count);
    }
    
}


public class TestStaticMethod {
    
    public static void main(String[] args) {
        
        Student s=new Student();
        Student s1=new Student();
        s.input();
        s.display();
        
        System.out.println("second object details");
        s1.input();
        s1.display();
    }

}

*/



//package com;
//
//import java.util.Scanner;
//
//class Student
//{
//	private int id; //instance variable
//	private String name;//instance variable
//	private static String college="SM";//class level variable
//	private static int count=0;//class level variable
//
//
//public void input() {
//	//instance method
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter id");
//	id=sc.nextInt();
//	System.out.println("Enter name");
//	name=sc.next();
//	//System.out.println("Enter College");
//	//college=sc.next();//static variable can be defined inside non static method
//
//}
//
//public void display() {
//	System.out.println(id+" "+name+" "+college);
//	count++;
//	
//	
//}
//
//public static void show() {
//	System.out.println(college+" "+count);
//	System.out.println("Total Students:"+count);
//}
//}
//
//public class TestStaticMethod {
//	
//	static void sayStatic() {
//		System.out.println("Can call without creating object");
//	}
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		Student s1=new Student();
//		s.input();
//		s.display();
//		
//		
//		s1.input();
//		s1.display();
//		
//		Student.show();
//		sayStatic();
//
//	}
//
//}



//package com;
//
//SIB: Static initilialized block:  to initilized static variable
//
//public class TestStaticMethod {
//	
//	static int count;
//	static {
//		count=20;
//		System.out.println("Inside static block "+count);
//	}
//	
//	static void display() {
//		System.out.println(count);
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		display();
//		
//
//	}
//
//}


package com;

import static demo.TestImport.*;
import static java.lang.System.*;

public class TestStaticMethod {
	
		
	public static void main(String[] args) {
		
		display();
		out.println("hello import");
	}

}

