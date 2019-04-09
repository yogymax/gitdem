package com.clc.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;


public class TestJDBC {
	
	//hsqldb --https://sourceforge.net/projects/hsqldb/files/latest/download
	
	//driver --org.hsqldb.jdbcDriver
	//jdbc:hsqldb:hsql://localhost/
	//username--SA
	//password - ""
	
	
	/*
	 * Load the drivers...
	 * 
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		 //"insert into empinfo values(2,'BBB','Pune',25)";
		
		Class.forName("org.hsqldb.jdbcDriver");//load the class into memory-- load the drivers
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");//ACK...handshaking-- java with DB
		Statement statement = connection.createStatement();//communication channel..
		//String createEmpTable = "CREATE TABLE EMPINFO (EMPID INT NOT NULL,EMPNAME VARCHAR(50) NOT NULL,EMPADDRESS VARCHAR(20) NOT NULL,EMPAGE INT,PRIMARY KEY (EMPID))";
		//statement.executeUpdate(createEmpTable);
		
		int empCount = 2;
		System.out.println("Enter Array Capacity...");
		int capacity = new Scanner(System.in).nextInt();  //ask 3 times -- in case wrong..and handle exception
		Emp emps[] = new Emp[capacity];
		int index = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			empCount+=1;
			System.out.println("Emp Id : " +empCount);
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			System.out.println("Enter  Name : ");
			String name=sc.next();
			System.out.println("Enter Address : ");
			String address=sc.next();
			emps[index++]=new Emp(empCount,name, age, address);
			System.out.println("Do you want to continue...For Yes press 1.");
			
			int userChoice = sc.nextInt();
			if(index == capacity) // capacity exceeds -- inform user..
				userChoice=2;
			if(userChoice == 1){
				continue;
			}
			break;
		}
		
		
		System.out.println("List Of Emps " +Arrays.toString(emps));
		//String insertQuery = "insert into empinfo values(";
		String finalQueryPart =")";
		String insertQuery = "insert into empinfo values(";
		for (Emp e : emps) {
			 String query = insertQuery+e.getEmpId()+",'"+e.getEmpName()+"','"+e.getAddress()+"',"+e.getEmpAge()+")";
			System.out.println("Emp insert query : " +query);
			statement.executeUpdate(query);
			Thread.sleep(2000);
		}
		
//		String insertQuery = "insert into empinfo values(2,'BBB','Pune',25)";
//		statement.executeUpdate(insertQuery);
		
		
	}
}

class Emp{
	private int empId;
	private String empName;
	private int empAge;
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\n Emp [empId=" + empId + ", empName=" + empName + ", empAge="
				+ empAge + ", address=" + address + "]";
	}
	public Emp(int empId, String empName, int empAge, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.address = address;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

/**



org.hsqldb.jdbcDriver
 -- in memory database -- implicit..
SA


db connection String.. or db url

jdbc:hsqldb:hsql://localhost/
jdbc:mysql://localhost:3306/sonoo","root","root"
jdbc:oracle:thin:@localhost:1521:xe","system","oracle"


jdbc -- protocal name
mysql/oracle/hsqldb -- database names
localhost -- 127.0.0.1 -- same machine..
portno -- 3306 Mysql  1521 -- Oracle
dbname -- xe/sonno
username - 
password - 


	database
	schema -- tables -- rows/colns -- records



db url
	protocal
	which database
	ip/machinename/hostname
	port name
	database name/schemaname


username
passoword

Authetication  -- creadentials -- correct or incorrect
Authorization.. -- roles..privileages..







machine nw/ -- code...db same machine..localhost/127.0.0.1
db-- port-- hsqldb..schema db
url -- 









*/