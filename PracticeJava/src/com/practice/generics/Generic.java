package com.practice.generics;

public class Generic<T> {
	private T t;
	public void set(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return t;
	}
	public <U extends Number> void inspect(U u)
	{
		System.out.println("T: "+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> integerBox = new Generic<Integer>();
		integerBox.set(10);
		integerBox.inspect(new Number("12"));
	}

}
