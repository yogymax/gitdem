package com.scp.java.fourteen.basics;

public class TestExceptionHandling {

		public static void main(String[] args) {
			
			
			try{
				System.out.println("inside main method1");
				System.out.println("inside main method2");
				
				System.out.println("inside try");
				System.out.println("inside main method3");
				int result = 10/0;
				System.out.println("insidecompleted.."+result/2);	
				
			}catch (NullPointerException e) {
			}
			catch(Exception e){
				System.out.println("inside catch.."+e.getMessage());
			}
		
			
			System.out.println("inside main method4");
			System.out.println("inside main method5");
			
			
		}

		private static int m1() {
			return 10+10;
		}
	
}


/**
Exception and Errors...
	Both are events or condition in a program which termincates the normal flow of program 
	execution..
	those events or conditions which we can handle programmatically are called as exeception 
	rest are errors..

	try  -- risky code.. code which might throw an exception (an event which can be programmatically handled)
	catch -- code to handle the exception and provide an alternative for that event in case any..
	finally -- resource clean up -- close the conn/socket/files/buffer etc
	
	throw 
	throws


	--ngc
	try block -- will it be executed entirely ..depends --- if no exception entirely..at any line inside try
	exception occured..then find out related catch
	
		-- same or child wala exception should be generated inside try block .. -- ngc
	catch block -- when exeception occurs in related try..it will search for specific catch if not found 
	check next same/parent catch blocks  if stil not found..
	check does that try in nested one....if yes-- outside cha same/parent catch..and so on..stil not found..termination...
	
	finally -- gc -- even if exception comes or not...finally will be executed...
	 	only in following situations finally will not be executed...
	 		-- there is an error inside try or catch..
	 		-- explicity user has written sytem.exit()
	
	try..catch
	try..finally 
	try...catch..finally
	try...catch..catch..catch*  -- make sure..if multiple classes from same hierachy is coming then child shud be first and then parent
	try..catch..catch..catch*..finally
	try  --- it's equivalent with try..finally
	
	
	
	
	
	a
	  b 
	  	c1 -- d1
	  	c2 -- d2
	  	
	x
	  	y
	  	z
	  	
	  	try{
	  	}catch(c2){
	  	}catch(a){
	  	}catch(z){
	  	}catch(y)
	 
	
	
		dead code
		unreachable code



**/