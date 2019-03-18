package com.aswath.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswath.springboot.dao.DriverDao;
import com.aswath.springboot.model.Driver;


@Service
public class DriverServiceImplimentation implements DriverService {

	
	@Autowired
	private DriverDao driverdao;
	
	@Override
	public Driver AddDriver(Driver driver) {
		driverdao.save(driver);
		return driver;
	}

	@Override
	public List<Driver> getDivers() {
		
		return driverdao.findAll();
	}

//	@Override
//	public Optional<Driver> getDriver(String id) {
//		
//		System.out.println(id);
//		System.out.println(driverdao.findById(id));
//		return null;
//	}

}
