package com.clc.java.collection;
import static com.clc.java.collection.AppConstants.*;

public class LoginController {

	
	/**
	 * @author Yogesh
	 * @param username
	 * @param password
	 * @since 2019
	 * @return
	 */
	public String autheticateUser(String username,String password){
		String returnVal = INCORRECT_CREDETIALS;
		if (username == null || username.length()<=4){
			returnVal=INVALID_USERNAME;
		}else if (password == null || password.length()<=4){
			returnVal=INVALID_PASSWORD;
		}else if (USERNAME.equals(username) && PASSWORD.equals(password)){
			returnVal=LOGIN_SUCCESS;
		}
		return returnVal; 
	}

}

interface AppConstants{
	String USERNAME="admin";
	String PASSWORD="admin123";
	String LOGIN_SUCCESS= "User Logged in Successfully...!";
	String LOGIN_FAILED= "Login Failed..!";
	String INVALID_USERNAME= "Username cannot be Empty";
	String INVALID_PASSWORD= "Password cannot be Empty";
	String INCORRECT_CREDETIALS = "Incorrect credetials..!";

}