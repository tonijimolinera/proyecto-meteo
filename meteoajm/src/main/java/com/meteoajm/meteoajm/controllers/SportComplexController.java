package com.meteoajm.meteoajm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meteoajm.meteoajm.DTOs.SportComplexDTO;
import com.meteoajm.meteoajm.services.SportComplexService;

@RestController
@RequestMapping("/sport_controller")
public class SportComplexController {

	@Autowired
	private SportComplexService sportComplexService;
	
	@GetMapping(path = "/list_all")
	public List<SportComplexDTO> getSportComplex(){
		
		return sportComplexService.getSportComplex();
	}
	
//	@GetMapping(path = "/stations")
//	public List<MeteoStationDTO> getMeteoStation(){
//
//		return meteoStationService.getMeteoStations();
//	}
//	
}
