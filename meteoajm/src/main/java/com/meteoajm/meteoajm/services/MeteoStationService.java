package com.meteoajm.meteoajm.services;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.meteoajm.meteoajm.DTOs.MeteoStationDTO;
import com.meteoajm.meteoajm.entities.MeteoStation;

@Service
public interface MeteoStationService {

	public List<MeteoStationDTO> getMeteoStations();
	
	public List<MeteoStation> getMeteoStationsByName(String name);
	
	public MeteoStationDTO getMeteoStationById(Integer id);
	
	public void deleteMeteoStations(Integer id);
	
	public List<MeteoStation> deleteMeteoStations(String name);
	
	public MeteoStation insertMeteoStationByParam(String name, Double latitude, Double longitude);
	
	public MeteoStation insertMeteoStationByBody(MeteoStation body);
	
	public MeteoStation updateMeteoStations(Integer id,String name, Double latitude, Double longitude);
	
	public MeteoStation updateTestMeteoStations(Integer id, MeteoStation body);
	
	public MeteoStation updateTestMeteoStationsByMap(Map<String, String> body);
	
}
