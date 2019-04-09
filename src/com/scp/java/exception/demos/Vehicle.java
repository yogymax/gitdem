package com.scp.java.exception.demos;

enum Vehicles{
	Bus,
	Car,
	Train,
	Flight
}

public class Vehicle {
		public int number;
		public double fare;
		public int noOfSeats;
		public String source;
		public String destination;
		public Vehicles vehicleType;
		
		public Vehicles getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(Vehicles vehicleType) {
			this.vehicleType = vehicleType;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public double getFare() {
			return fare;
		}
		public void setFare(double fare) {
			this.fare = fare;
		}
		public int getNoOfSeats() {
			return noOfSeats;
		}
		public void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		@Override
		public String toString() {
			return "Vehicle [number=" + number + ", fare=" + fare
					+ ", noOfSeats=" + noOfSeats + ", source=" + source
					+ ", destination=" + destination + ", vehicleType="
					+ vehicleType + "]";
		}
		
		public Vehicle(int number, double fare, int noOfSeats, String source,
				String destination,Vehicles veh) {
			super();
			this.number = number;
			this.fare = fare;
			this.noOfSeats = noOfSeats;
			this.source = source;
			this.destination = destination;
			this.vehicleType=veh;
		}
		
}

class Customer{
	private int custId;
	private String custName;
	private double custBalance;
	private String startLocation;
	private String endLocation;
	private int noSeatsRequired;
	private Vehicles typeOfVehicleInterestedIn;
	

	
	
	public Vehicles getTypeOfVehicleInterestedIn() {
		return typeOfVehicleInterestedIn;
	}
	public void setTypeOfVehicleInterestedIn(Vehicles typeOfVehicleInterestedIn) {
		this.typeOfVehicleInterestedIn = typeOfVehicleInterestedIn;
	}
	public int getNoSeatsRequired() {
		return noSeatsRequired;
	}
	public void setNoSeatsRequired(int noSeatsRequired) {
		this.noSeatsRequired = noSeatsRequired;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public Customer(int custId, String custName, double custBalance,
			String startLocation, String endLocation,int seats,Vehicles in) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custBalance = custBalance;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.noSeatsRequired=seats;
		this.typeOfVehicleInterestedIn=in;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", custBalance=" + custBalance + ", startLocation="
				+ startLocation + ", endLocation=" + endLocation
				+ ", noSeatsRequired=" + noSeatsRequired
				+ ", typeOfVehicleInterestedIn=" + typeOfVehicleInterestedIn
				+ "]";
	}
	
	
	
	
}


