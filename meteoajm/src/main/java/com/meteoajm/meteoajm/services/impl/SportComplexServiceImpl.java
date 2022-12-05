package com.meteoajm.meteoajm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meteoajm.meteoajm.DTOs.SportComplexDTO;
import com.meteoajm.meteoajm.entities.SportComplexDAO;
import com.meteoajm.meteoajm.mappers.SportComplexMapper;
import com.meteoajm.meteoajm.repositories.SportComplexRepository;
import com.meteoajm.meteoajm.services.SportComplexService;

@Service
public class SportComplexServiceImpl implements SportComplexService{

	@Autowired
	private SportComplexRepository sportComplexRepository;
	
	@Autowired
	private SportComplexMapper sportComplexMapper;
	
	@Override
	public List<SportComplexDTO> getSportComplex() {
		
		List<SportComplexDAO> sportComplexDAOList = sportComplexRepository.findAll();
		return sportComplexMapper.toSportComplexDTOList(sportComplexDAOList);
	}

	@Override
	public List<SportComplexDTO> getSportComplexByName(String name) {
		
		List<SportComplexDAO> sportComplexDAOList = sportComplexRepository.getSportComplexDAOByNameSportComplex(name);
		// return sportComplexRepository.getSportComplexDAOsByName(name);
		return sportComplexMapper.toSportComplexDTOList(sportComplexDAOList);
	}
	
	

}
