package com.iproximus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iproximus.model.servicestation;

public interface ServiceStationRepo extends CrudRepository<servicestation, Integer> {

	List<servicestation> findByAddress(String address);
	List<servicestation>findByIdGreaterThan(int id);
	@Query("from servicestation where address=?1 order by name")
	List<servicestation>findByAddressSorted(String address);
	servicestation findByName(String name);

}
