/* package com;

//constructor chaining : we can call one constructor from another constructor and this concept is called constructor chaining

public class ConstructorChaining {
	
	public ConstructorChaining() {
		this(5);
		System.out.println("default constructor");
	}
	
public ConstructorChaining(int x) {
		this(5,10);
		System.out.println("one parameterized construcor "+x);
	}

public ConstructorChaining(int x,int y) {
	System.out.println("Two parameterized constructor "+x+" "+y);
}

	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();

	}

}
*/

package com;

//what is IIB(instance initialized block):is used to initialized the instance block

public class ConstructorChaining {
	
	int x;
	{
	
	//instance block
		x=10;
		System.out.println("inside instance block");
	}
	public ConstructorChaining() {
		System.out.println("inside constructor "+x);
	}

	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();

	}

}