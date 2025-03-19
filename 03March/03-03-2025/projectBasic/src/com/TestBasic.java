package com;


//Java is an object oriented ,platform independent ,robust programming language.
//platform independent : we can run java program in any platform(os)

//JDK: java development kit: It is used to develop or build our program (it contains jre inside)
//for ex-javac java

//JRE :java runtime environment: It provides environment where our java application can run 
//it is a library which contains all implementation api(of jvm)

//JVM: java virtual machine :it is used to execute java byte code.
//this code is inside the class file

//public: it is an access specifier it can access from anywhere
//main(): it is an entry point function and exit point function.jvm always call main method
//static: no need to create object for method call


//string: it is non primitive data type
//string[] :Array of string
//String[] args: args is (command line argument )it is array of strings 


/*public class TestBasic {
	
	static void sayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {  //jvm call main() method without creating object
		sayHello();
		System.out.println("Hello Java");

	}

}*/

public class TestBasic {
	

	public static void main(String[] args) {  
		String name=args[0];
		String city=args[1];
		System.out.println("Welcome "+name);
		System.out.println("Lived in "+city);

	}
}
