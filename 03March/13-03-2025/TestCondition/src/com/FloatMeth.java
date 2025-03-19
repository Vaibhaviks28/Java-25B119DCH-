package com;

public class FloatMeth {
	
	public float sayFloat(float a,float b) {
		float sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		FloatMeth obj =new FloatMeth();
		float s =obj.sayFloat(4.0f, 8.0f);
		System.out.println(s);

	}

}
