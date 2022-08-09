package com.cap.prevtest.practice;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(15);
		list.add(10);
		list.add(20);
		
		list.stream().filter(i-> i<=20).forEach((i)->
		System.out.println(i));
	}

}
