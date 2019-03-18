package com.aswath.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aswath.springboot.model.Truck;
import com.aswath.springboot.service.TruckService;




@RestController
@RequestMapping("/Truck")
public class TruckController {
	
	
	@Autowired
	private TruckService truckService;
	
	@PostMapping("/AddTruck")
	public Truck addTruck(@RequestBody Truck truck) 
	{
		return truckService.AddTruck(truck);
	}
	
	@GetMapping("/FindAllTrucks")
	public List<Truck> getTrucks()
	{
		return truckService.getTrucks();
	}
	
	@GetMapping("/FindAllTrucks/{id}")
	public Optional<Truck> getTruck(@PathVariable String id)
	{
		return truckService.getTruck(id);		
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteTruck(@PathVariable String id)
	{
		return truckService.deleteTruck(id);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Truck truck) 
	{
		truckService.update(truck);
		return "updation sucessful"+truck;
	}
	
	@DeleteMapping("/DeleteAll")
	public String deleteAll() 
	{
		return truckService.DeleteAll();
	}
	
	

}
