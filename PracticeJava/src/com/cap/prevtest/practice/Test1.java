package com.cap.prevtest.practice;
class Student
{
	int age;
	double marks;
	
	Student(){}
	
	Student(int age, double marks)
	{
		System.out.println("Inside Student(age,marks) constructor");
		this.age = age;
		this.marks = marks;
	}
	Student(double marks, int age)
	{
		System.out.println("Inside Student(marks,age) constructor");
		this.age = age;
		this.marks = marks;
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(45,12);//leads to ambiguity
	}

}
