package com.iproximus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iproximus.model.servicestation;

public interface ServiceStationRepo extends CrudRepository<servicestation, Integer> {

	
	List<servicestation>findByIdGreaterThan(int id);
	servicestation findByName(String name);

}
