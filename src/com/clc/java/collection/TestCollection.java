package com.clc.java.collection;

import java.util.ArrayList;

public class TestCollection {
	
	public static void main(String[] args) {
		System.out.println("inside m1");
		ArrayList<Number> numbers =new ArrayList(30);
		for(int i= 0; i<15;i++)
			numbers.add(10);
		numbers.add(20);
		numbers.remove(3);
		numbers.add(13,20);//add addall index
		System.out.println("numbers "+numbers);
	}

}
