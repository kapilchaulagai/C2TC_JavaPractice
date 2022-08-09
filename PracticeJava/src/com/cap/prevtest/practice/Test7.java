package com.cap.prevtest.practice;
abstract class A
{
	abstract void m1();
}
abstract class B extends A
{
	void m1()
	{
		System.out.println("B - m1 method");
	};
}
class MyClass extends B
{
	void m2()
	{
		System.out.println("MyClass - m1 method.");
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new MyClass();
		a.m1();
	}

}
