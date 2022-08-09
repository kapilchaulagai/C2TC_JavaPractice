package com.cap.prevtest.practice;
class Parent 
{
	protected void m1()
	{
		System.out.println("Parent-m1 method.");
	}
}
class Child extends Parent
{
	public final void m1()
	{
		System.out.println("Child - m1 method.");
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.m1();
	}

}
