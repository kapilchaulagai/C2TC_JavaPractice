package com.cap.prevtest.practice;
class Test5
{
	static void m2()
	{
		System.out.println("Inside - m2.");
	}
	void m3()
	{
		System.out.println("Inside m3.");
	}
}
public class Test2 {
	static int num=3;
	static
	{
		num = 5;
		System.out.println("Static block");
	}
	void m1()
	{
		num=7;
		System.out.println("static - m1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num);
		new Test2().m1();
		new Test5().m3();
		Test5.m2();
		System.out.println(num);
	}

}
