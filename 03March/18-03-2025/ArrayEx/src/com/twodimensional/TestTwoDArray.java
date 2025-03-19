/* package com.twodimensional;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= {{14,15},{16,18}
		};
		
		System.out.println("Display Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
*/

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display Array Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
*/

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		char [][]arr= new char[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		
		System.out.println("Display Array Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
*/

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		String [][]arr= new String[2][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array names");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.next();
			}
		}
		
		System.out.println("Display Array Name");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
*/


/*
//program to sum of even elements
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					sum=sum+arr[i][j];
				}
			}
			
		}
		System.out.println("Sum of elements is: "+sum);

	}

}
*/

/*
//program to sum of odd elements
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2!=0) {
					sum=sum+arr[i][j];
				}
			}
			
		}
		System.out.println("Sum of elements is: "+sum);

	}

}
*/


/*
//program to find total number  of even elements in array
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					count++;
				}
			}
			
		}
		System.out.println("Total even elements in array is : "+count);

	}

}
*/


/*
//program to find total number  of odd elements in array
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2!=0) {
					count++;
				}
			}
			
		}
		System.out.println("Total odd elements in array is : "+count);

	}

}
*/

/*

//program to find maximum number in array
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int maximum=arr[0][0];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(maximum<arr[i][j]) {
					maximum=arr[i][j];
				}
			}
			
		}
		System.out.println("Maximum number in array is : "+maximum);

	}

}
*/

//program to find minimum number in array
package com.twodimensional;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {
		int [][]arr= new int[2][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int minimum=arr[0][0];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(minimum>arr[i][j]) {
					minimum=arr[i][j];
				}
			}
			
		}
		System.out.println("Minimum number in array is : "+minimum);

	}

}


