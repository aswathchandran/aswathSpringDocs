package com.aswath.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswath.springboot.dao.Tripdao;
import com.aswath.springboot.model.Trip;
@Service
public class TripServiceImplementation implements TripService {

	@Autowired
	private Tripdao tripDao;

	@Override
	public Trip addTrip(Trip trip) {
		tripDao.save(trip);
		return trip;
	}

	@Override
	public List<Trip> getTrip() {
		return tripDao.findAll();
	}

}
