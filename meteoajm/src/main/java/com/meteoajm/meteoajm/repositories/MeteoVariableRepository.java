package com.meteoajm.meteoajm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meteoajm.meteoajm.entities.MeteoVariable;

@Repository
public interface MeteoVariableRepository extends JpaRepository<MeteoVariable, Integer>{

}
