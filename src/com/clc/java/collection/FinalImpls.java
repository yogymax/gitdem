package com.clc.java.collection;

public class FinalImpls {
	
	/**
	 * 
		final int num1 = 10; // thread stack
		
		final Integer num2=2022; // 1
		final String s1="abc"; //1
		final String s2=new String("pqr"); //2
		s2.intern();
		
		String s11 = new String("a");
		String s="a";
		s = s.concat("a");
		s=s11.intern();
		System.gc();
		
		Integer num3=2022;//1
		System.out.println("main complted..");
	
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		/*
		final String s1=new String("pqr"); //2
		String s2=new String("pqr"); //2
		System.out.println(s1 == s2);
		System.out.println(s1 == s2.intern());
		System.out.println(s1.intern() == s2);
		System.out.println(s1.intern() == s2.intern());
*/		
		

		final Book b1 = new Book(11,"AAAA",2203.3); //3
		b1.bookId=22;
		b1.bookName=new String("AABB"); //2
		b1.bookPrice=2303.3;//1
		
		b1.bookName= b1.bookName.intern().concat(b1.bookName);

		String s1="abc";
		String s2="pqr";
		
		String s3 = new String("abcpqr");
		
		System.out.println(s1+s2.intern() == s3.intern());
		
		
		
		int num=10;
		System.out.println(""+num+1+2+4);
		
		System.out.println(++num+num++);
		System.out.println(num);
		
		
	}

}


class Book{
	int bookId;
	String bookName;
	Double bookPrice;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookPrice=" + bookPrice + "]";
	}
	public Book(int bookId, String bookName, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}