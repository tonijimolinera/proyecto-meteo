package com.meteoajm.meteoajm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meteoajm.meteoajm.entities.SportComplexDAO;

@Repository
public interface SportComplexRepository extends JpaRepository<SportComplexDAO, Integer>{
	
	public List<SportComplexDAO> getSportComplexDAOByNameSportComplex(String name);
	
}
