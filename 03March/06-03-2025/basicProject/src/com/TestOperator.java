package com;

public class TestOperator {

	
	//Increment/Decrement: 1)post increment or post decrement 2)pre increment or pre decrement
	//post increment:let variable i sx=10;first it used its old value
	//eg =y=10   x=11
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		System.out.println("x ="+x++);//10
		System.out.println(x);//11
		System.out.println(x++);//11
		System.out.println(x);//12

	}
	*/
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		System.out.println("x ="+ ++x);//11
		System.out.println(x);//11
		System.out.println(++x);//12
		System.out.println(x);//12

	}


}*/
	
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y = x++ + ++x +x;
		      // 5    7    7
		System.out.println("x ="+ x);//7
		System.out.println("y ="+ y);//19
		

	
	}

}
*/
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y = ++x + x++ + ++x;
		//8
				// 6  6  8 = 20
		System.out.println("x ="+ x);//8
		System.out.println("y ="+ y);//20
		

		
	}

}

*/
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=7;
		int y = x++ + ++x + x++ + ++x;
		//11
				// 7  9  9 11= 36
		System.out.println("x ="+ x);//11
		System.out.println("y ="+ y);//36
		

		
	}

}
*/
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y = x-- + --x +x;
		      // 5    3   3
		System.out.println("x ="+ x);//3
		System.out.println("y ="+ y);//11
		

	
	}

}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=4;
		int y=6;
	//m=   //7    //5	//8  //6
		y= ++y + x++ + y++ + ++x;
		  //7   // 4	//7  //6
				
		System.out.println("x ="+ x);//6
		System.out.println("y ="+ y);//24
		

		
	}

}