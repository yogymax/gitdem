package com.clc.java.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaSamples {

	public static void main(String[] args) throws IOException {
		
		
		
		// exception will be handled in side try finally..yes or no....No
		
		try(FileReader reader = new FileReader("");){
		}
		
		//callback -- toString,
		
		
		
		FileReader reader =null;
		try{
			reader = new FileReader("");
		}finally{
		if(reader!=null)
			reader.close();
		}
		
		
		
		try{
		//	FileReader reader = new FileReader("File");
		}catch(Exception e){
			e.printStackTrace();//detailed information abt exception 
			System.out.println(e.getMessage());//only exception message no other details..
		}
		
		
	}
	
	
}

/**
try with resources.. try with finally.... bit differnc



*/