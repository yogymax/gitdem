package com.scp.java.col;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		
		
		// duplicates allow/seq order / null allow // al -- ll
		ArrayList<Integer> arrList =new ArrayList(); //() (int) (c)
		arrList.add(10);arrList.add(20);arrList.add(30);arrList.add(10);arrList.add(40);arrList.add(null);
		
		LinkedList<Integer> linkList =new LinkedList(arrList);//() (c)
		
		Vector<Integer> vector = new Vector(arrList); // ()(int)(c)(int,int)
		
		Stack<Integer> stack = new Stack();//()
		for (Integer integer : arrList) {
			stack.push(integer);
		}
		
		System.out.println("ArrayList : "+arrList);
		System.out.println("LinkedlIst : "+linkList);
		System.out.println("Vector : "+vector);
		System.out.println("stack : "+stack);
		
		System.out.println("using for loop");
		for(int i=0;i<arrList.size();i++){
				System.out.println(stack.get(i)); // stack /linkList //vector //arrList // 
		}
		System.out.println("using foreach loop"); 
		for(Integer num :linkList){
			System.out.println(num); // stack /linkList //vector //arrList //set
		}
		
		System.out.println("using iterator..");
		Iterator<Integer> arrItr =  stack.iterator();
		while(arrItr.hasNext()){
			System.out.println(arrItr.next()); // stack /linkList //vector //arrList //set
		}
		
		
		
		System.out.println("using List iterator..");
		ListIterator<Integer> listItr =  arrList.listIterator();
		while(listItr.hasNext()){
			System.out.println(listItr.next()); // stack /linkList //vector //arrList
		}
		
		System.out.println("using enumration...");
		Enumeration<Integer> enmItr = vector.elements();
		while(enmItr.hasMoreElements()){
			System.out.println(enmItr.nextElement());
		}
		
		
		
		
		
		
	}

}
