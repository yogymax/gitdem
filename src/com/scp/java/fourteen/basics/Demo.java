package com.scp.java.fourteen.basics;
/**
 *  javac Demo.java -- Demo.class (Bytecode/intermediatecode) --jvm read -- machine code (specific to platform)
 * 
 *  javac Demo.java --src
 *  			Demo.class -- bin
 *  			main method---
 *  		
 *  
 * 
 * 
 * @author Yogesh
 *
 */

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("inside main method...!...1");
		//var -- mem location can be stored anything
		//ref --mem location -- object stored..
		//every ref var will be var -- but vice versa not true alway..
		//new -- memory allocation for objects..
		
		
		Product p1= new Product();
		System.out.println("\n\n");
		Product p2= new Product();
		
		Product.vendorName="Samsung";
		
		p1.productId=101;
		p1.productName="Mobile";
		
		p2.productName="Laptop";
		p2.productId=102;
		
		System.out.println("inside main completed...!...!..10");
		
	}

}


class Product{
	int productId; //47
	String productName;//47
	
	static String vendorName; //2
	{
		System.out.println("instance fields ini...4");
		System.out.println("inside instance block5");
	}
	static{
		System.out.println("static fields ini...2");
		System.out.println("inside static block3");
		}
	
	public Product(){
		System.out.println("inside product no arg constructor#6/9");
	}
	
	public void instanceMethod(){
		System.out.println("inside instance method");
	}
	
	static public void staticMethod(){
		System.out.println("inside static method");
	}
	
}


/**
 * 	Bootstrap -- java class files.. -- jre lib 
 * 	Application -- User defined class files
 * 	Extension -- jdk  /ext folder..
 * 
 * class Loading -- one time of one class..
 * 		-- scan static fields(var + methods) -- 
 * 		-- assign memory and initialize -- either default or user defined values...
 * 		- executed static blocks...
 * 		-- main method -- only for first class..***
 * Demo
 * 	main started....
 * 	inside main method...
 * 		Product p1 = new product()
 * 
 * 		Object Creation steps = no of objects repeat...
 * 				new -- allocate memory to the object on Heap...
 * 			    initialize instance fields either to default or user values..
 * 				execute instance blocks...
 * 				execute constructor....
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


/**

		
		
		A
		
		B e A
		
		C e B
		
		
		TestMain
			main()
			
				C c = new C()
				
		
		Loding ...Top to Bottom
		object steps -- Top to bottom..
		
		
		Class Loading -- A ...B...C
			scan static fields and initlize on method area
			execute static blocks
		Object creatation--- A / B C
			instance fields ini
			instance blocks exe
			constuctor execu
			
		
**/