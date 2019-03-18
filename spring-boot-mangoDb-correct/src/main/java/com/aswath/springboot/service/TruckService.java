package com.aswath.springboot.service;

import java.util.List;
import java.util.Optional;



import com.aswath.springboot.model.Truck;

public interface TruckService {
	
	public Truck AddTruck(Truck truck);
	public List<Truck>  getTrucks();
	public Optional<Truck> getTruck(String id);
	public String deleteTruck(String id);
	public  Optional<Truck> update(Truck truck);
	public String DeleteAll();

}
