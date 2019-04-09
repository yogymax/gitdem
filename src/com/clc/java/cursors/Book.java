package com.clc.java.cursors;

import java.util.List;

public class Book {
		private int bookId;
		private String bookName;
		private double bookPrice;
		private List<Author> author;
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName
					+ ", bookPrice=" + bookPrice + ", author=" + author + "]";
		}
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
		public double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}
		public List<Author> getAuthor() {
			return author;
		}
		public void setAuthor(List<Author> author) {
			this.author = author;
		}
		public Book(int bookId, String bookName, double bookPrice,
				List<Author> author) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
			this.author = author;
		}
		
}


class Author{
	private int authorId;
	private String authorName;
	private List<Address> address;
	public Author(int authorId, String authorName, List<Address> address) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "[authorId=" + authorId + ", authorName=" + authorName
				+ ", address=" + address + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
	
}

class Address {
	private int pincode;
	private String city;
	private String state;
	@Override
	public String toString() {
		return "\n  [pincode=" + pincode + ", city=" + city + ", state="
				+ state + "]";
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int pincode, String city, String state) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	
	
}

