package com.scp.java.fourteen.basics;

/**
 * 
 * == -- primitives -- contents
 * ==   --- ref comparison in case of objects -- comples structures...
 * 
 *  Note --- in order to improve java perfm there is cache for the the values from 0-127
 *  	and applicable to all primitives except -- float/double/boolean
 *  and if any Wrapper created without new -- except Float/Double/Boolean
 *  
 *  String -- refch 
 *  	 -- SCP -- objects created without new wil be created on scp and will have same location in case
 *  same contents... intern -- leaves heap ref and point out to scp ..
 *  whenever you create an string object with new one copy will always be maintained on scp area
 *  scp is a part of heap and applicable to only string literals... 
 *  	
 *  
 *  
 *  Equals ---
 *  		Object -- ref comparison
 *  		Wrappers/Strings -- content comparison
 *  		User Defined.	.depends... -- if user has written/overriden equals then content comparison..if not 
 *  overriden --- check into parent..parent..till object class -- object class Ref....
 * 
 * 
 * 
 * 
 * 
 * @author Yogesh
 *
 */


public class TestRefEquality {
	
	
	/**
	 * ==  -- ref equality -- address comparism
	 * equals
	 * 
	 *  primitive  ==  -- always content equality
	 *  
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(11, "B");
		Mobile m2 = new Mobile(11, "A");
		Mobile m3 = new Mobile(11, "A");
		
		System.out.println(m1==m3);//false
		System.out.println(m1.equals(m3));//false
		
		
	}

}


class Mobile{
	
	public boolean equals(Object o){
		Mobile m = (Mobile)o;
		return this.mobileId==m.mobileId;
	}
	
	private int mobileId;
	private String mobileName;
	public Mobile(int mobileId, String mobileName) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
	}
	
	
}

