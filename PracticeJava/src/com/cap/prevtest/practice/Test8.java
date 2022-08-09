package com.cap.prevtest.practice;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i, sum;
			sum = 10;
			for(i=-1;i<3;i++)
			{
				sum = (sum/i);
				System.out.print(i);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print("0");
		}
	}

}
