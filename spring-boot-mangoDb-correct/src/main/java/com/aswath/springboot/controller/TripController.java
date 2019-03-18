package com.aswath.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswath.springboot.model.Trip;
import com.aswath.springboot.service.TripService;

@RestController
@RequestMapping("/Trip")
public class TripController {

	@Autowired
	private TripService tripService;
	
	@PostMapping("/AddTrip")
	public Trip AddTrip(@RequestBody Trip trip) 
	{
		return tripService.addTrip(trip);
	}
	
	
	@GetMapping("/GetAllTrips")
	public java.util.List<Trip> getAllTrips()
	{
		return tripService.getTrip();
	}
}
