package com.aswath.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswath.springboot.dao.TruckDao;
import com.aswath.springboot.model.Truck;




@Service
public class TruckServiceImplementation implements TruckService {

	
	
	@Autowired
	private TruckDao truckDao;
	
	
	@Override
	public Truck AddTruck(Truck truck) {
		truckDao.save(truck);
		return truck;
	}

	@Override
	public List<Truck> getTrucks() {
		return truckDao.findAll();
	}

	@Override
	public Optional<Truck> getTruck(String id) {
		return truckDao.findById(id);
		
	}

	@Override
	public String deleteTruck(String id) {
		 truckDao.deleteById(id);
		 return "truck with id "+id+" is deleted sucessfully"; 
	}

	@Override
	public Optional<Truck> update(Truck truck) {
		//Optional<Truck> a=truckDao.findById(id);
		truckDao.save(truck);
		return null;
	}

	@Override
	public String DeleteAll() {
		truckDao.deleteAll();
		return "All entry deleted sucessfully";
	}

}
