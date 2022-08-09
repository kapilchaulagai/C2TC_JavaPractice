package com.practice.generics;

public class UseGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen<Integer> m = new MyGen<Integer>();
		m.set("merit");
		System.out.println(m.get());
	}
}
class MyGen<T>
{
	T var;
	void set(T var)
	{
		this.var = var;
	}
	T get()
	{
		return var;
	}
}