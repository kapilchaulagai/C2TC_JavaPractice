package com.cap.prevtest.practice;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = {99,24};
		int[] secondArray = {99,24};
		int[] thirdArray = secondArray;
		//firstArray = secondArray;
		if(thirdArray == secondArray)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		if(firstArray == secondArray)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		if(firstArray.equals(secondArray))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}

}
