package com.cap.prevtest.practice;

public class FloatEx {
	static float y = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 5 + 10 * 10.5f;//10.5
		System.out.println(x+y);
		FloatEx f = new FloatEx();
		f.m1(x);
	}
	void m1(float x)
	{
		double z = x+y;
		System.out.println("Inside m1: "+z);
	}

}
