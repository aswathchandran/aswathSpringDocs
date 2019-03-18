package com.aswath.springboot.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Trip")
public class Trip {
	
	@Id
	public String TripId;
	@DBRef
	public Truck TruckID;
	@DBRef
	public Route RouteId;
	@DBRef
	public Driver DriverId;
	
	public String startTime;
	
	public Trip()
	{
		
	}

	public Trip(String tripId, Truck truckID, Route routeId, Driver driverId, String startTime) {
		super();
		TripId = tripId;
		TruckID = truckID;
		RouteId = routeId;
		DriverId = driverId;
		this.startTime = startTime;
	}

	
	
	
	
	

}
