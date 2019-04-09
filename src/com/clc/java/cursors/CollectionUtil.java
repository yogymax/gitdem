package com.clc.java.cursors;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;



public class CollectionUtil {
	
	public static List<Book> getAllBooksPriceGreaterThan(List<Book> books, double price){
		return books;
	}
	
	public static void usingIterator(Collection<Book> books){
		System.out.println("using Iterator " + books.getClass());
		Iterator<Book> bookItre = books.iterator();
		while(bookItre.hasNext()){
			System.out.println(bookItre.next());
		}
	}
	
	public static void usingListIterator(List<Book> books){
		System.out.println("using ListIterator " + books.getClass());
		ListIterator<Book> bookItre = books.listIterator();
		while(bookItre.hasNext()){
			System.out.println(bookItre.next());
		}
	}
	
	static public Stack<Book> convertCollectionToStack(Collection<Book> books){
		Stack<Book> stack =new Stack();
		for (Book book : books) {
			stack.push(book);
		}
		return stack;
	}	
	
	public static void usingEnumeration(Object object) throws Exception{
		System.out.println("using Enumration " + object.getClass());
		
		if(object instanceof Vector){
				Enumeration<Book> bookEnumr = null;
				if (object instanceof Stack)
							bookEnumr = ((Stack) object).elements();
					else if (object instanceof Vector)
						bookEnumr = ((Vector) object).elements();
					while(bookEnumr.hasMoreElements()){
							System.out.println(bookEnumr.nextElement());
						}
		}else if(object instanceof Dictionary){
			Enumeration<Book> bookEnumr = null;
			if(object instanceof Properties){
				bookEnumr = ((Dictionary) object).elements();
			}else if(object instanceof Hashtable){
				bookEnumr = ((Hashtable) object).elements();
			}else if(object instanceof Dictionary){
				bookEnumr = ((Dictionary) object).elements();
			}
			
			
		}else
			throw new Exception("Invalid type...cannot use enuration...!");
	}
}
