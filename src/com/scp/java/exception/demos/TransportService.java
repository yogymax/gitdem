package com.scp.java.exception.demos;

import static com.scp.java.exception.demos.AppConstants.INSUFFIENT_BALANCE;
import static com.scp.java.exception.demos.AppConstants.SEATS_AVAILIBILITY;
import static com.scp.java.exception.demos.AppConstants.SOURCE_DEST_NOT_MATCHING;
import static com.scp.java.exception.demos.AppConstants.TRANSPORT_NOT_AVAIBLE;


abstract public class TransportService {
	abstract public void transportSystem(Vehicle vehicle,Customer cust) throws InsufficientBalance,TypeOfVehicleNotAvailble,SeatsNotAvaible,SourceDestMismatch;
}



class TranspotServiceImpl extends TransportService{
		
	@Override
	public void transportSystem(Vehicle veh, Customer cust) throws InsufficientBalance,SourceDestMismatch, TypeOfVehicleNotAvailble, SeatsNotAvaible {
			if(cust.getTypeOfVehicleInterestedIn().equals(veh.getVehicleType())){
					if(veh.getSource().equals(cust.getStartLocation()) && veh.getDestination().equals(cust.getEndLocation())){
							if(veh.getNoOfSeats()>=cust.getNoSeatsRequired()){
								int custReqSeats = cust.getNoSeatsRequired();
								double vehBalance = custReqSeats*veh.getFare();
								if(cust.getCustBalance()>=vehBalance){
											int avlblSeats = veh.getNoOfSeats();
											System.out.println("Current Vehicle Balance...! " +vehBalance);
											veh.setNoOfSeats(avlblSeats-custReqSeats);
											cust.setCustBalance(cust.getCustBalance()-vehBalance);
									}else{
										throw new InsufficientBalance(INSUFFIENT_BALANCE); 
									}
							}else{
								throw new SeatsNotAvaible(SEATS_AVAILIBILITY);
							}
					}else{
						throw new SourceDestMismatch(SOURCE_DEST_NOT_MATCHING);
					}
			}else{
				throw new TypeOfVehicleNotAvailble(TRANSPORT_NOT_AVAIBLE);
			}
		
	}
	
}

interface AppConstants{
	String TRANSPORT_NOT_AVAIBLE = "Specified Vehicle not Avaible...!";
	String SOURCE_DEST_NOT_MATCHING = "Source or dest not matching..!";
	String SEATS_AVAILIBILITY = "Seats not avaible..!";
	String INSUFFIENT_BALANCE = "Balance not availble";
	
}



class TypeOfVehicleNotAvailble extends Exception {
		public TypeOfVehicleNotAvailble(String msg){
			super(msg);
		}
}


class SourceDestMismatch extends Exception {
		public SourceDestMismatch(String msg){
			super(msg);
		}
}


class SeatsNotAvaible extends Exception {
	public SeatsNotAvaible(String msg){
		super(msg);
	}
}


class InsufficientBalance extends Exception {
	public InsufficientBalance(String msg){
		super(msg);
	}
}