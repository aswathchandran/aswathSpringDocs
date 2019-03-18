package com.aswath.springboot.service;

import java.util.List;

import com.aswath.springboot.model.Route;


public interface RouteService {
	
	public Route AddRoute(Route route);
	public List<Route>  getRoute();

}
