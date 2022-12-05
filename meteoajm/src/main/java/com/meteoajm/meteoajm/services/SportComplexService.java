package com.meteoajm.meteoajm.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.meteoajm.meteoajm.DTOs.SportComplexDTO;
import com.meteoajm.meteoajm.entities.SportComplexDAO;

@Service
public interface SportComplexService {

	public List<SportComplexDTO> getSportComplex();
	public List<SportComplexDTO> getSportComplexByName(String name);
}
