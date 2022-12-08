package com.meteoajm.meteoajm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meteoajm.meteoajm.entities.MeteoStation;

@Repository
public interface MeteoStationRepository extends JpaRepository<MeteoStation, Integer> {

	public List<MeteoStation> getMeteoStationsByName(String name);
	
	public MeteoStation getMeteoStationById(Integer id);
	

	@Query("SELECT v FROM MeteoStation v WHERE v.name LIKE CONCAT('%',:name,'%')")
	public List<MeteoStation> getMeteoStationsByNameSQL(@Param("name") String name);
}
