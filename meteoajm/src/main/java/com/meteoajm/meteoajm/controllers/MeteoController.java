package com.meteoajm.meteoajm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meteoajm.meteoajm.entities.MeteoStation;
import com.meteoajm.meteoajm.services.MeteoStationService;



@RestController
@RequestMapping("/meteo")
public class MeteoController {
	
	@Autowired
	private MeteoStationService meteoStationService;
	
	@GetMapping(path = "/stations", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MeteoStation> getMeteoStation(){
		
		return meteoStationService.getMeteoStations();
	}
	
	@GetMapping(path = "/stationsByName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MeteoStation> getMeteoStationByName(@RequestParam ("name") String name){
		
		return meteoStationService.getMeteoStationsByName(name);
	}
	
	@DeleteMapping(value = "/station/{id}")
	public String deleteMeteoStationById(@PathVariable ("id") Integer id){
		meteoStationService.deleteMeteoStations(id);
		return "Elemento borrado";
	}
	
	@DeleteMapping(value = "/stationsDeleteByName/{name}")
	public List<MeteoStation> deleteMeteoStations(@PathVariable ("name") String name){
		
		return meteoStationService.deleteMeteoStations(name);
	}
	
	@PostMapping(value = "/stationsInsert")
	public MeteoStation insertMeteoStations(@RequestParam("name") String name, @RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude) {
		
		return meteoStationService.insertMeteoStations(name, latitude, longitude);
	}
	
	@PutMapping(value = "/stationUpdate")
	public MeteoStation updateMeteoStations(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude){
		
		return meteoStationService.updateMeteoStations(id, name, latitude, longitude);
	}

}
