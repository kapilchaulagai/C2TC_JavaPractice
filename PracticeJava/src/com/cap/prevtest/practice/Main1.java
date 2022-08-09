package com.cap.prevtest.practice;

public class Main1 extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new Main1();
		}
		catch(Main1 m)
		{
			System.out.println("Got the Exception.");
		}
		finally
		{
			System.out.println("Inside finally block.");
		}
	}

}
