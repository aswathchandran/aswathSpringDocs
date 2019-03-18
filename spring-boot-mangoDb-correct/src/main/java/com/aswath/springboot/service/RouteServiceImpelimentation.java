package com.aswath.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aswath.springboot.dao.RouteDao;
import com.aswath.springboot.model.Route;



@Service
public class RouteServiceImpelimentation implements RouteService {
	
	@Autowired
	private RouteDao routeDao;

	@Override
	public Route AddRoute(Route route) {
		routeDao.save(route);
		return null;
	}

	@Override
	public List<Route> getRoute() {
		
		return routeDao.findAll();
	}

}
