package com.aswath.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Driver")
public class Driver {
	
	@Id
	public String DirverId;
	public String DriverName;
	public String DriverAddress;
	public String DriverPhoneNumber;
	
	Driver()
	{
		
	}
	
	
	
	
	public Driver(String dirverId, String driverName, String driverAddress, String driverPhoneNumber) {
		DirverId = dirverId;
		DriverName = driverName;
		DriverAddress = driverAddress;
		DriverPhoneNumber = driverPhoneNumber;
	}




//	public String getDirverId() {
//		return DirverId;
//	}
//	public void setDirverId(String dirverId) {
//		DirverId = dirverId;
//	}
//	public String getDriverName() {
//		return DriverName;
//	}
//	public void setDriverName(String driverName) {
//		DriverName = driverName;
//	}
//	public String getDriverAddress() {
//		return DriverAddress;
//	}
//	public void setDriverAddress(String driverAddress) {
//		DriverAddress = driverAddress;
//	}
//	public String getDriverPhoneNumber() {
//		return DriverPhoneNumber;
//	}
//	public void setDriverPhoneNumber(String driverPhoneNumber) {
//		DriverPhoneNumber = driverPhoneNumber;
//	}
	
	
	
	

}
