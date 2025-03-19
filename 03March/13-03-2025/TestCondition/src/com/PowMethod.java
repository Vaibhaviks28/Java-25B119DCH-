package com;

public class PowMethod {
	
	public int power(int n,int p)
	{
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*n;
		return result;
		}
	}

	public static void main(String[] args) {
		PowMethod pm=new PowMethod()
;
		System.out.println(pm.power(3, 3));
	}

}
