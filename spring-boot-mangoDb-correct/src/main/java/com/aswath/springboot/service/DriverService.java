package com.aswath.springboot.service;

import java.util.List;


import com.aswath.springboot.model.Driver;

public interface DriverService {
	
	public Driver AddDriver(Driver driver);
	public List<Driver>  getDivers();
	//public Optional<Driver> getDriver(String id); 

}
