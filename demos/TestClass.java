package com.clc.java.demos;
/**
 * class -- user defined Structure
 * Object- -- user defined Datatype
 * 	ref var
 *    var
 * every ref variable is a variable but not vice-versa always true 
 * 
 * @author Yogesh
 *
 */

public class TestClass {
	
	public static void main(String[] args) {
		Address ad1 = new Address(102032,"Pune");
		Address ad2 = new Address(332032,"Mumbai");
		
		
		Emp e1 = new Emp(101, "Amit", 33, 12334.23, ad1);
		Emp e2 = new Emp(101, "Amit", 33, 12334.23, ad1);
		Emp e3 = new Emp(101, "Amit", 33, 12334.23, ad1);
		Emp e4 = new Emp(101, "Amit", 33, 12334.23, ad1);
		e1.setAddress(ad2);
		
		//		Emp e1 = new Emp(1,"ABC", -24, 12992.3);
//		Emp e2 = new Emp(2,"BBB", 26, 42992.3);
		
		System.out.println(e1);// Tostring() -- object representation -- callback -- override -- Object -- fullyQualifiedClassName@Integerhex
				//contents -- Tostring -- override -- Emp .. 
		
		//4types of ref objects -
				// strong ref -- * new 
				//weak ref
				// soft ref
				//phantom
		
	}

}

class Emp{
		private int empId;			//public int getEmpId  public void setEmpId(int)
		private String empName;
		private int empAge;
		private double empSalary;
		private Address address;
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
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Emp [empId=" + empId + ", empName=" + empName + ", empAge="
					+ empAge + ", empSalary=" + empSalary + ", address="
					+ address + "]";
		}
		public Emp(int empId, String empName, int empAge, double empSalary,
				Address address) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empAge = empAge;
			this.empSalary = empSalary;
			this.address = address;
		}
		
}



class Address{
	private int pincode;
	private String city;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	
	
	
	
}


/**
Class Loading -- Once
	SFI
	SBE

Object Creation -- repeate
	IFI
	IBE
	CC


	A
	
	
	B e A
	
	
	
	C e B
	
	
	
	
	TestClass
		main
		
		C c = new C()
		
Object
Testclass
		main -- 
		
SFI --A
SBE - A
SFI -- B
SBE --B
SFI--C
SBE --C


IFI --A
IBE--A
CC -A

IFI --B
IBE--B
CC -B

IFI --C
IBE--C
CC -C



**/