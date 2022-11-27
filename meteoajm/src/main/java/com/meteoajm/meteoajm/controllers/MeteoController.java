package com.meteoajm.meteoajm.controllers;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meteoajm.meteoajm.DTOs.MeteoStationDTO;
import com.meteoajm.meteoajm.entities.MeteoStation;
import com.meteoajm.meteoajm.services.MeteoStationService;



@RestController
@RequestMapping("/meteo")
public class MeteoController {

	@Autowired
	private MeteoStationService meteoStationService;

//	**************************
//	******* GET  *************
//	**************************
	@GetMapping("/testbody")
	public MeteoStation test(@RequestBody MeteoStation body) {

		System.out.println("Ejemplo: "+body.getName());
		return body;
	}
	@GetMapping("/stationMio")
	public String test() {

		System.out.println("Fin");
		return "Holaaaaa";
	}

	@GetMapping(path = "/stations")
	public List<MeteoStationDTO> getMeteoStation(){

		return meteoStationService.getMeteoStations();
	}
	
	@GetMapping(path = "/stationsById")
	public MeteoStationDTO getMeteoStationById(@RequestParam ("id") Integer id){

		return meteoStationService.getMeteoStationById(id);
	}

	@GetMapping(path = "/stationsByName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MeteoStation> getMeteoStationByName(@RequestParam ("name") String name){

		return meteoStationService.getMeteoStationsByName(name);
	}

//	**************************
//	******* DELETE  **********
//	**************************
	
	@DeleteMapping(value = "/station/{id}")
	public String deleteMeteoStationById(@PathVariable ("id") Integer id){
		meteoStationService.deleteMeteoStations(id);
		return "Elemento borrado 444";
	}

	@DeleteMapping(value = "/stationsDeleteByName/{name}")
	public List<MeteoStation> deleteMeteoStations(@PathVariable ("name") String name){

		return meteoStationService.deleteMeteoStations(name);
	}

//	**************************
//	******* POST  ************
//	**************************
	
	@PostMapping(value = "/stationInsertByParam")
	public MeteoStation insertMeteoStationsByParam(@RequestParam("name") String name, @RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude) {

		return meteoStationService.insertMeteoStationByParam(name, latitude, longitude);
	}

	@PostMapping("/stationInsertByBody")
	public MeteoStation insertMeteoStationByBody(@RequestBody MeteoStation body) {

		return meteoStationService.insertMeteoStationByBody(body);
	}


//	**************************
//	******* PUT  *************
//	**************************	
	
	@PutMapping(value = "/stationUpdatebyParam")
	public MeteoStation updateMeteoStations(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude){

		return meteoStationService.updateMeteoStations(id, name, latitude, longitude);
	}

	@PutMapping(value = "/stationUpdate/{id}")
	public MeteoStation updateTestMeteoStations(@PathVariable("id") Integer id, @RequestBody MeteoStation body) {

		System.out.println("Hola"+id);
		MeteoStation testMi = meteoStationService.updateTestMeteoStations(id, body);
		System.out.println("Que pasa"+id+"-----"+testMi.getName());
		return meteoStationService.updateTestMeteoStations(id, body);
	}
	
	@PutMapping(value = "/stationUpdateByMap")
	public ResponseEntity<MeteoStation> updateMeteoStationByMap(@RequestBody Map<String, String> body) {

		return ResponseEntity.ok().body(meteoStationService.updateTestMeteoStationsByMap(body)); 
	}
	

//	**************************
//	******* PATCH  ***********
//	**************************	
	
	
//	***************************
//	ResponseEntity<T>  EJEMPLOS
//	***************************

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		//return new ResponseEntity<>("Hello World!222", HttpStatus.OK);
		return ResponseEntity.ok("Hello world");
	}

	@GetMapping("/age")
	public ResponseEntity<String> age(
			@RequestParam("yearOfBirth") int yearOfBirth) {

		if (isInFuture(yearOfBirth)) {
//			return new ResponseEntity<>("Year of birth cannot be in the future", HttpStatus.BAD_REQUEST);
			return ResponseEntity.badRequest().body("Year of birth cannot be in the future");
		}

//		return new ResponseEntity<>("Your age is " + calculateAge(yearOfBirth), HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body("Your age is " + calculateAge(yearOfBirth));
	}

	@GetMapping("/customHeader")
	public ResponseEntity<String> customHeader() {

		org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
		headers.add("Custom-Header", "aaaaaa");

		return new ResponseEntity<>("Custom header set", headers, HttpStatus.OK);
	}

	private Boolean isInFuture(Integer yearOfBirth) {

		Calendar cal = Calendar.getInstance();
		if (yearOfBirth > cal.get(Calendar.YEAR)) {	
			return true;
		}
		return false;
	}

	private Integer calculateAge(Integer yearOfBirth) {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.YEAR)-yearOfBirth;
	}

	//	***************************
	//	ResponseEntity<T>  FINNNNM
	//	***************************

}
