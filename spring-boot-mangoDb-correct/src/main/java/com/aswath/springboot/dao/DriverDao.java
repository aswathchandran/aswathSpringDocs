package com.aswath.springboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aswath.springboot.model.Driver;

public interface DriverDao extends MongoRepository<Driver, String> {

}
