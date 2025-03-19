/* package com.singledimension;

public class TestOneDArray {
	
	//Array is collection of similar datatype
	//Array always start with index 0
	
	//Types of Array: 1) Single d 2)MultiDimensiaonal array(2D)
	
	//syntax: datatype arrname[size] or
	//datatype [size]arraname

	public static void main(String[] args) {
		
		int []arr= {4,5,11,12,13};
		
		System.out.println("Total elements :"+arr.length);
		
		for(int i =0;i<arr.length;i++) {
		     System.out.print(arr[i]+" ");
		}

	}

}

*/

/* package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements in array");
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Elements");
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"\t");
		}
	
		

	}

}
*/

/* package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		char arr[]=new char[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements in array");
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.println("Display Array Elements");
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"\t");
		}
	
		

	}

}
*/

/* package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		String arr[]=new String[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter names in array");
		
		for(int i=0;i<5;i++) {
			arr[i]=sc.next();
		}
		
		System.out.println("Display Array Names");
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"\t");
		}
	
	}

}
*/

/*
//WAP to find sum of even elements in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			  sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Even elemets is : "+sum);
	
	}

}
*/

/*
//WAP to find sum of odd elements in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			  sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Even elemets is : "+sum);
	
	}

}
*/


/*
//WAP to find total number of even elements in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			  count++;
			}
		}
		System.out.println("Total Numbers of Even elemets in Arrray is : "+count);
	
	}

}
*/


/*
//WAP to find total number of odd elements in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			  count++;
			}
		}
		System.out.println("Total Numbers of Odd elemets in Arrray is : "+count);
	
	}

}
*/


/*
//WAP to find max element in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int maximum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(maximum<arr[i]) {
				maximum=arr[i];
			}
		}
		System.out.println("Maximum number in array is : "+maximum);
	
	}

}
*/

//WAP to find min element in array
package com.singledimension;

import java.util.Scanner;

public class TestOneDArray {


	public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elemetns in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int minimum=arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(minimum>arr[i]) {
				minimum=arr[i];
			}
		}
		System.out.println("Minimum number in array is : "+minimum);
	
	}

}







