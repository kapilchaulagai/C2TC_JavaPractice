package com.cap.prevtest.practice;
interface intf1
{
	default void m1()
	{
		System.out.println("default method");
	}
}
interface intf2
{
	void m1();
}
class MyClass implements intf1, intf2
{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf1 ref = new MyClass();
		ref.m1();
	}
}
