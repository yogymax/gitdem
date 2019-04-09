package com.clc.java.cursors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TestCollectionFeatures {

	public static void main(String[] args) throws Exception {
		Address pune1 = new Address(111122,"Pune1","MH");
		Address pune2 = new Address(114522,"Pune2","MH");
		Address pune3 = new Address(118822,"Pune3","MH");
		Address pune4 = new Address(117722,"Pune4","MH");
		Address pune5 = new Address(112222,"Pune5","MH");
		
		List<Address> listOfAddress1 = new ArrayList<Address>();
		listOfAddress1.add(pune1);
		listOfAddress1.add(pune3);
		
		List<Address> listOfAddress2 = new ArrayList<Address>();
		listOfAddress2.add(pune1);
		listOfAddress2.add(pune4);
		listOfAddress2.add(pune5);
		
		List<Address> listOfAddress3 = new ArrayList<Address>();
		listOfAddress3.add(pune1);
		listOfAddress3.add(pune2);
		listOfAddress3.add(pune3);
		
		
		Author javaAuthor =new Author(101,"AAAA",listOfAddress1);
		Author SpringAuthor =new Author(102,"BBB",listOfAddress1);
		Author hibernateAuthor =new Author(103,"CCC",listOfAddress1);
		Author cProgAutor =new Author(104,"AABBAA",listOfAddress1);
		Author cppAuthor =new Author(105,"AAFFFA",listOfAddress1);
		Author awsAuthor =new Author(106,"GGAAAAAAA",listOfAddress1);

		List<Author> authorList1 = new ArrayList<Author>();
		authorList1.add(cProgAutor);
		authorList1.add(cppAuthor);
		authorList1.add(javaAuthor);
		authorList1.add(awsAuthor);
		
		List<Author> authorList2 = new ArrayList<Author>();
		authorList2.add(javaAuthor);
		authorList2.add(SpringAuthor);
		authorList2.add(hibernateAuthor);
		
		List<Author> authorList3 = new ArrayList<Author>();
		authorList3.add(awsAuthor);
		
		Book b1 = new Book(123,"java", 13123.43, authorList2);
		Book b2 = new Book(123,"Spring", 15123.43, authorList1);
		Book b3 = new Book(123,"Hibernate", 11123.43, authorList2);
		Book b4 = new Book(123,"c/cpp", 12123.43, authorList1);
		Book b5 = new Book(123,"AWS", 13123.43, authorList3);
		
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(b1);listOfBooks.add(b2);listOfBooks.add(b3);listOfBooks.add(b4);listOfBooks.add(b5);
		
		Stack<Book> stackOfBooks = CollectionUtil.convertCollectionToStack(listOfBooks);
		
		
		Comparator<Book> idSort = new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return o1.getBookId() - o2.getBookId();
			}
		};
		
		TreeSet<Book> setOfBooks =new TreeSet<Book>(idSort);
		setOfBooks.addAll(listOfBooks);
		Set<Book> setOfBooks1 = new HashSet<>(listOfBooks);
		
		Vector<Book> vector =new Vector<>(listOfBooks);
		
		CollectionUtil.usingEnumeration(stackOfBooks);
		
		
		
	}
	
}
