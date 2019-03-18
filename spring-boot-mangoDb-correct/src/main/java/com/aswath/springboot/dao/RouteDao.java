package com.aswath.springboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aswath.springboot.model.Route;

public interface RouteDao extends MongoRepository<Route, String> {

}
