package com.aswath.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aswath.springboot.model.Route;
import com.aswath.springboot.service.RouteService;

@RestController
@RequestMapping("/Route")
public class RouteController {

	
	@Autowired
	private RouteService routeService;
	
	@PostMapping("AddRoute")
	public String addRoute(@RequestBody Route route) 
	{
		routeService.AddRoute(route);
		return "added sucessfully";
	}
	
	@GetMapping("/FindAllRoute")
	public List<Route> getTrucks()
	{
		return routeService.getRoute();
	}
}
