package com.clc.java.debugging;


public class DebuggingMain {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(1, "thinkpad1", 15293.42);
		Laptop l2 = new Laptop(2, "Leno", 14293.42);
		Laptop l3 = new Laptop(3, "ThinkPad3", 13293.42);

		Laptop[] laps = {l1,l2,l3};

		m1(laps);
		System.out.println("main completed...");
	}

	public  static void m1(Laptop[] lap){
		double sum = 0;
		for(int i=0;i<lap.length;i++){
			Laptop laptop = lap[i];
			System.out.println(laptop);
			sum +=laptop.getLapPrice();
		}
		System.out.println("All Laptops price is " +sum);
	}

}

class Laptop{
	private int lapId;
	private String lapModel;
	private double lapPrice;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapModel() {
		return lapModel;
	}
	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}
	public double getLapPrice() {
		return lapPrice;
	}
	public void setLapPrice(double lapPrice) {
		this.lapPrice = lapPrice;
	}
	@Override
	public String toString() {
		return "\n Laptop [lapId=" + lapId + ", lapModel=" + lapModel
				+ ", lapPrice=" + lapPrice + "]";
	}
	public Laptop(int lapId, String lapModel, double lapPrice) {
		super();
		this.lapId = lapId;
		this.lapModel = lapModel;
		this.lapPrice = lapPrice;
		System.out.println("inside parameterized constructor");
	}
	public Laptop() {
		super();
		System.out.println("inside no-arg constructor");
	}

	{
		System.out.println("inside instance block");
	}

	static {
		System.out.println("inside static block");
	}

}
