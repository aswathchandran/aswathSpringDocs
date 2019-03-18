package com.aswath.springboot.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="Truck")
public class Truck {
	
	
	@Id
	private String truckId;
	private String truckName;
	private String truckNumber;
	
	
	Truck()
	{
	}


	public String getTruckId() {
		return truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}	
	
	
	
	
	
	
	
	
	

}
