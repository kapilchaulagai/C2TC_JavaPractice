package com.practice.generics;

public class GenericsWithObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsWithObjects<int> integerObject = new GenericsWithObjects<int>(12);
		integerObject.print();
	}

}
class GenericsWithObjects<T>
{
	T obj;
	GenericsWithObjects(T obj)
	{
		this.obj = obj;
	}
	void print()
	{
		System.out.println(obj);
	}
}