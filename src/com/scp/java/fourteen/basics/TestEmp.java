package com.scp.java.fourteen.basics;

//https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmp {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);numbers.add(103);numbers.add(310);numbers.add(1440);numbers.add(1640);
		numbers.add(130);numbers.add(103);numbers.add(2310);numbers.add(140);numbers.add(540);
		Collections.sort(numbers);		System.out.println(numbers);
		
		
		//domain class -- shud implement comparable.. Collection.sort<List<T>> T shud be of type comparable
		//comparable -- comparTo -- 
		
		/*
		 * Comparable -- int compareTo(ob1) -- Natural Sorting/Default sorting-- one sorting seq at a time-- sorting logic resides inside domain class..
		 * Comparator -- int comapare(ob1,ob2)-- boolean equals(ob1)--Customized sorting-- we can have as many as sorting seq.. --not necessary to keep sorting logic inside domain class
		 * 
		 * Wrapper classes/String -- implements comparable -- natural sorting..single seq..immutable--
		 *
		 *
		 *+  -- depends -- asc -- swap --- desc -- asitis
		 *- -- dependes -- asc-- keep it as its -- desc--swap 
		 *0 -- keep it as it is
		 *  int --
		 *  Asc
		 *  	+ve - swap - -lhs larger..
		 *    -ve -- rhs larger
		 *    0 -- equal--
		 * 
		 */
		
		/*

		 Empp e2= new Empp(12,"SkjdsgsdA2", 23312.32);Empp e1= new Empp(1,"AAAA", 6312.32);
		Empp e4= new Empp(12,"SkjdsgsdA1", 3412.32);Empp e3= new Empp(31,"5fwetwAA", 5612.32);
		Empp e6= new Empp(13,"gsd2394AA", 23312.32);Empp e5= new Empp(641,"aaasAA", 63312.32);

		List<Empp> employess = new ArrayList<>();
		employess.add(e1);employess.add(e4);
		employess.add(e2);employess.add(e5);
		employess.add(e3);employess.add(e6);
		
		Collections.sort(employess);
		System.out.println(employess);*/
		

		
		EmppC e2= new EmppC(12,"SkjdsgsdA2", 23312.32);EmppC e1= new EmppC(1,"AAAA", 6312.32);
		EmppC e4= new EmppC(12,"SkjdsgsdA1", 3412.32);EmppC e3= new EmppC(31,"5fwetwAA", 5612.32);
		EmppC e6= new EmppC(13,"gsd2394AA", 23312.32);EmppC e5= new EmppC(641,"aaasAA", 63312.32);

		List<EmppC> employess = new ArrayList<>();
		employess.add(e1);employess.add(e4);
		employess.add(e2);employess.add(e5);
		employess.add(e3);employess.add(e6);

		
		//employess -- list of Emppc -- 2nd param -- comparator..compare(o1,o2)
/*		Collections.sort(employess, new EmppC());
		System.out.println("Using Comparator..Inside DomainClass Logic");
		System.out.println(employess);
		
		Collections.sort(employess, new IdSort());
		
		System.out.println("Using ID "+employess);
		Collections.sort(employess, new NameSort());
		System.out.println("Using Name "+employess);
		Collections.sort(employess, new SalarySort());
		System.out.println("Using Salary "+employess);
		*/
		Collections.sort(employess,EmppcSortingSeqs.nameSortDesc);
		System.out.println("Using Annonymous Impltn"+employess);
		
	}
}

class Empp implements Comparable<Empp>{
	private int empId;
	private String empName;
	private double empSalary;
	public Empp(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Empp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Empp [empId=" + empId + ", empName=" + empName + ", empSalary="
				+ empSalary + "]";
	}
	@Override
	public int compareTo(Empp o) {
		//return this.empName.compareTo(o.empName);
		int zero = this.empId - o.empId;
		if(zero == 0){ //empid same
				return (this.empName.compareTo(o.empName));
		}
		return zero;
	}
	
	
	
}





class EmppC implements Comparator<EmppC>{
	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	
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



	public double getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}



	@Override
	public String toString() {
		return "\n EmppC [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}


	
	public EmppC() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmppC(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}


	@Override
	public int compare(EmppC o1, EmppC o2) {
		return o1.empId - o2.empId;
	}

}

class IdSort implements Comparator<EmppC>{
	
	@Override
	public int compare(EmppC o1, EmppC o2) {
		return o1.getEmpId() - o2.getEmpId();
	}
	
	
	public int compareTo(EmppC o1, EmppC o2) {
		return o1.getEmpId() - o2.getEmpId();
	}
}


class NameSort implements Comparator<EmppC>{
	@Override
	public int compare(EmppC o1, EmppC o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

class SalarySort implements Comparator<EmppC>{
	@Override
	public int compare(EmppC o1, EmppC o2) {
		return (int) (o1.getEmpSalary()-o2.getEmpSalary());
	}
}



class EmppcSortingSeqs {
	
	public static Comparator<EmppC> idNSalarySort = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			int temp= o1.getEmpId() - o2.getEmpId();
			if(temp == 0){
				temp = -((int) (o1.getEmpSalary() - o2.getEmpSalary()));
			}
			return temp;
		}
	};
	
	public static Comparator<EmppC> idNName = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			int temp= o1.getEmpId() - o2.getEmpId();
			if(temp == 0){
				temp = -((o1.getEmpName().compareTo(o2.getEmpName())));
			}
			return temp;
		}
	};
	
	
	public static 	Comparator<EmppC> idSort = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			return o1.getEmpId() - o2.getEmpId();
		}
	};
	
	public static Comparator<EmppC> idSortDesc = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			return -(o1.getEmpId() - o2.getEmpId());
		}
	};
	
	public static Comparator<EmppC>  nameSort = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
	};
	
	public static Comparator<EmppC>  nameSortDesc = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			return -(o1.getEmpName().compareTo(o2.getEmpName()));
		}
	};


	
	public static Comparator<EmppC>  salarySort = new Comparator<EmppC>(){
		@Override
		public int compare(EmppC o1, EmppC o2) {
			return (int) (o1.getEmpSalary()-o2.getEmpSalary());
		}
	};

	
	
}



/**
	comparable -- domain class madhech -- compareTo -- Collections.sort(empList)
	Comparator -- domain class madhech -- compare -  Collections.sort(empList,domainClsOb)
	Comparator -- another class impls comparator -- compare -  Collections.sort(empList,anthrClsOb)
	Comparator --main method -- annonymousimple -- compare -  Collections.sort(empList,annonymsClsOb)
	Comparator -- another utility class  --annonymous compare -  Collections.sort(empList,reqqiiredsortingseq)


**/