package com.scp.java.fourteen.basics;

public class Basics {
	public static void main(String []args) {
		
		Address ad1 = new Address();
		ad1.city="Pune";
		ad1.pinCode=122122;
		
		Address ad2 = new Address();
		ad2.city="Mumbai";
		ad2.pinCode=555122;

		
		Emp e1 =new Emp();
		Emp e2 =new Emp();
		Emp e3=e1;
		
		e1.address=ad1;
		e2.address=ad2;
		e3.address=ad2;
		
		
		e2.address.pinCode=20120;
		ad2.city="Bglore..!";
		
		ad1.city="Mumbai...!";
		
		System.out.println(e1.address.pinCode);
		System.out.println(e2.address.pinCode);
		System.out.println(e3.address.pinCode);
		System.out.println(e1.address.city);
		System.out.println(e2.address.city);
		System.out.println(e3.address.city);
		
		
		
		
		
		
	}
}

class Emp{
	int id;
	Address address;
	
}

class Address{
	String city;
	int pinCode;
}

