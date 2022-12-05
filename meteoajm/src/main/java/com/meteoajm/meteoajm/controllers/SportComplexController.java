package com.meteoajm.meteoajm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meteoajm.meteoajm.DTOs.SportComplexDTO;
import com.meteoajm.meteoajm.entities.SportComplexDAO;
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
	
	@GetMapping(path = "/list_by_name")
	public List<SportComplexDTO> getSportComplexByName(@RequestParam ("name") String name){
		
		return sportComplexService.getSportComplexByName(name);
	}
	
//	@GetMapping(path = "/stations")
//	public List<MeteoStationDTO> getMeteoStation(){
//
//		return meteoStationService.getMeteoStations();
//	}
//	
}
