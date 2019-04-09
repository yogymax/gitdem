			package com.scp.java.fourteen.basics;
			
			public class TestMain {

				public static void main(String[] args) {
					Employee empOb1 = new Employee();
					Employee empOb2 = new Employee();
					
					empOb1.empId=10;
					empOb1.empName="AAA";
					empOb1.empSalary=10000;
					
					empOb2.empSalary=5032;
					empOb2.empName="BBB";
					empOb2.empId=12;
					
					empOb1.companyName="Infy";
					
					
					System.out.println(empOb2.companyName); //infy
					System.out.println(empOb2.empId);//12
					System.out.println(empOb2.empName);//BBB
					System.out.println(empOb2.empSalary);//5032
					System.out.println("----------------------------------------------------");
					System.out.println(empOb1.companyName); //infy
					System.out.println(empOb1.empId);//10
					System.out.println(empOb1.empName);//AAA
					System.out.println(empOb1.empSalary);//1000
					
					
				}
				
			}
			
			
			class Employee{
				//instance properties -- seperate for every object..
				int empId;
				String empName;
				double empSalary;
				
				static String companyName;//common property for every object...

				public Employee() {
					System.out.println("no arg constuctor");
				}
				
				{
					System.out.println("instance block");
				}
				
				static {
					System.out.println("static block");
				}
				
				public void displayStudentInfo(){
					System.out.println("inside display method");
				}
				
				static public void showStudentInfo(){
					System.out.println("inside show method");
				}
				
				
			}

			
	//major.minor -- 52.0	