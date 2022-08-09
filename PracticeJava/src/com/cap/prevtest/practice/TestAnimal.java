package com.cap.prevtest.practice;
class Animal
{
	String name;
	
	public boolean equals(Object o)
	{
		Animal a = (Animal)o;
		Animal b = (Animal)o;
		if(a.name == b.name)
			{return true;}
		else
			{return false;}
		
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.name = "Dog";
		Animal b = new Animal();
		b.name = "dfdg";
		System.out.println(a.equals(b));
	}

}
