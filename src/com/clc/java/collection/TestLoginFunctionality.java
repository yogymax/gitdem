package com.clc.java.collection;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.clc.java.collection.AppConstants.*;

public class TestLoginFunctionality {

	LoginController login= null;
	
	@BeforeClass
	public void beforeTestExecutions(){
		System.out.println("inside before test execution..!");
		login  = new LoginController();
	}
	
	
	
	
	@DataProvider
	public Object[][] testData(){
		Object[][] testData = new Object[5][3];
		
		testData[0][0]=null;
		testData[0][1]=null;
		testData[0][2]=INVALID_USERNAME;
		
		testData[1][0]=null;
		testData[1][1]=PASSWORD;
		testData[1][2]=INVALID_USERNAME;
		
		testData[2][0]=PASSWORD;
		testData[2][1]=USERNAME;
		testData[2][2]=INCORRECT_CREDETIALS;
		
		testData[3][0]="admiaaa";
		testData[3][1]="admi";
		testData[3][2]=INVALID_USERNAME;
		
		testData[4][0]=USERNAME;
		testData[4][1]=PASSWORD;
		testData[4][2]=LOGIN_SUCCESS;
		
		return testData;
	}
	
	
	@Test(dataProvider="testData")
	public void verifyInvalidCredentionals(String unm,String pwd,String emsg){
		System.out.println("Username : " +unm +"Password :" +pwd +"Expected Message :" +emsg);
		Assert.assertEquals(login.autheticateUser(unm, pwd), emsg);
	}

	
	@Test(enabled=false)
	public void verifyvalidCredentionals(){
		String result = login.autheticateUser(USERNAME, PASSWORD);
		Assert.assertEquals(result, LOGIN_SUCCESS);
	}
	

	
	@Test(enabled=false)
	public void verifyInvalidUsername(){
		
		String result = login.autheticateUser("", PASSWORD);
		Assert.assertEquals(result, INVALID_USERNAME);
		
		result = login.autheticateUser(null, PASSWORD);
		Assert.assertEquals(result, INVALID_USERNAME);
		
		result = login.autheticateUser(PASSWORD, PASSWORD);
		Assert.assertEquals(result, INCORRECT_CREDETIALS);
		
		result = login.autheticateUser("", "");
		Assert.assertEquals(result, INVALID_USERNAME);
		
	}
	

	@Test(enabled=false)
	public void verifyInvalidPassword(){
		
		String result = login.autheticateUser(USERNAME, USERNAME);
		Assert.assertEquals(result, INCORRECT_CREDETIALS);
		
		result = login.autheticateUser(PASSWORD,"");
		Assert.assertEquals(result, INVALID_PASSWORD);
		
		result = login.autheticateUser(USERNAME, null);
		Assert.assertEquals(result, INVALID_PASSWORD);
		
		result = login.autheticateUser(null, null);
		Assert.assertEquals(result, INVALID_USERNAME);
		
	}
		

}
