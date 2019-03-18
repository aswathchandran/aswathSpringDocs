package com.aswath.springboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aswath.springboot.model.Trip;

public interface Tripdao extends MongoRepository<Trip, String> {

}
