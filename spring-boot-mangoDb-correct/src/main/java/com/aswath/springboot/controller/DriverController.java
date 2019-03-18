package com.aswath.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswath.springboot.model.Driver;
import com.aswath.springboot.service.DriverService;



@RestController
@RequestMapping("/Driver")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@PostMapping("/AddDriver")
	public Driver addDriver(@RequestBody Driver driver) 
	{
		//System.out.println(driver);
		return driverService.AddDriver(driver);
		//return driver;
	}
	
	
	@GetMapping("/FindAllDrivers")
	public List<Driver> getDriver()
	{
		return driverService.getDivers();
	}
	
//	@GetMapping("/FindAllDriver/{id}")
//	public Optional<Driver> getDriver(@PathVariable String id)
//	{
//		System.out.println( driverService.getDriver(id));
//		return driverService.getDriver(id);
//		
//	}
	
	
}
