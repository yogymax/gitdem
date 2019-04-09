/*package com.scp.java.fourteen.basics;

*//**
 * parent---child  -- is relationship
 * 
 * 
 * Association -- mapping/relationship between entities...
 * 	aggregation -- 
 *     composition
 * 
 * 
 * @author Yogesh
 *
 *//*

class X{
	public void m1(){
		System.out.println("inside m1");
	}
	
	static public void m2(){
		System.out.println("inside static m2");
	}
}

public class A {
	public static void main(String[] args) {
		
		
		if(true)
			return;
		
		Parent p =new Child();
		p.m1();//child
		p.m2();//child
		
		
		Child c = new Child();
		c.m1();//child
		c.m2();//child
		c.m3();//parent
	}
}


class AA{
	 public void m1(){
		System.out.println("static method");
	}
}

class BB extends AA{
	 public void m1(){
		System.out.println("static method");
	}
}

class CC extends BB{
	
}


method override
	identify method from ref and coming from inheritance...
		whatever methods identified check those in runtime object and then parent and then parent --

static -- not overriden
		identify method present into ref or coming from inheritance..
			check that method in directly ref...else in parent...

		A
			m1 $
			m2
			m3 $
			
		B e A
			m1$
			m2
			m3$
			m4$
		C e B
			m1$
			m2
			m4$
		
	AA
		m1--A
		m2 --A
		m3 --A
	BB
		m1--B
		m2--B
		m3 -B
		m4-B
	CC
		m1--C
		m2--C
		m3--B
		m4
	AB
		m1--A
		m2--B
	AC
		m1--A
		m2--C
	BC
		m1--B
		m2--C
	
	i1
		nm=X
		public void m1()
	i2	
		nm=Y
		public String m1()
		
	A impls i1,i2
		public void m1(){
		
		}
		
		public String m1(){
		
		}
		
		
*/