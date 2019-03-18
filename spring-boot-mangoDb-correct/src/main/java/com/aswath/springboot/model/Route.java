package com.aswath.springboot.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Route")
public class Route {

	@Id
	public String RouteId;
	public String Source;
	public String Destination;
	public List<Intermediates> intermediaates;
	
	
	
	public Route() {
		
	}



	public Route(String routeId, String source, String destination, List<Intermediates> intermediaates) {
		super();
		this.RouteId = routeId;
		this.Source = source;
		this.Destination = destination;
		this.intermediaates = intermediaates;
	}


	
	
	
	
	
}
