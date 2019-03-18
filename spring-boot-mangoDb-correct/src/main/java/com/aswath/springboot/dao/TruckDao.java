package com.aswath.springboot.dao;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.aswath.springboot.model.Truck;

public interface TruckDao extends MongoRepository<Truck, String> {
	
	
	
}
