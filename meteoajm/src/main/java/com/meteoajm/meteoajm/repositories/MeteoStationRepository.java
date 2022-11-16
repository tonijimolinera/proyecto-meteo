package com.meteoajm.meteoajm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meteoajm.meteoajm.entities.MeteoStation;

@Repository
public interface MeteoStationRepository extends JpaRepository<MeteoStation, Integer> {

	public List<MeteoStation> getMeteoStationsByName(String name);
}
