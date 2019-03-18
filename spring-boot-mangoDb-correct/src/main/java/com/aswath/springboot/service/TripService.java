package com.aswath.springboot.service;

import java.util.List;

import com.aswath.springboot.model.Trip;


public interface TripService {
	
	public Trip addTrip(Trip trip);
	public List<Trip>  getTrip();

}
