package com;

public class IntMeth {
	
	public int sayInt(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		IntMeth obj =new IntMeth();
		int s =obj.sayInt(4, 5);
		System.out.println(s);

	}

}
