package com.scp.java.exception.demos;

public class TestAssignement {

	public static void main(String[] args) {
		Vehicle bus =new Vehicle(12021,1000, 10,"Pune","Mumbai", Vehicles.Bus);
		Customer cust =new Customer(121,"AAAA",1200, "Pune","Mumbai",10,Vehicles.Bus);
		
		TransportService service = new TranspotServiceImpl();
		System.out.println("Availble seats : "+bus.getNoOfSeats());
		try {
			service.transportSystem(bus,cust);
		} catch (InsufficientBalance e) {
			cust.setCustBalance(120312); //alternative..another option
							try {
								service.transportSystem(bus,cust);
							} catch (InsufficientBalance | TypeOfVehicleNotAvailble
									| SeatsNotAvaible | SourceDestMismatch e1) {
								e1.printStackTrace();
							}
			e.printStackTrace();
		} catch (TypeOfVehicleNotAvailble e) {
			e.printStackTrace();
		} catch (SeatsNotAvaible e) {
			e.printStackTrace();
		} catch (SourceDestMismatch e) {
			e.printStackTrace();
		}

		
		
		
		System.out.println("Cust Balance : "+cust.getCustBalance());
		System.out.println("Now Availble seats : "+bus.getNoOfSeats());
		
	}
	
}
