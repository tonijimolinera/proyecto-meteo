package com.meteoajm.meteoajm.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.meteoajm.meteoajm.DTOs.MeteoStationDTO;
import com.meteoajm.meteoajm.entities.MeteoStation;

@Mapper(componentModel="spring")
public interface MeteoStationMapper {

	@Mappings({ 
		@Mapping(source = "name", target = "nombreEstacion"), 
		@Mapping(source = "latitude", target = "lat"),
		@Mapping(source = "longitude", target = "lon"), 
		@Mapping(source = "comments", target = "comentario") 
	})
	MeteoStationDTO toMeteo(MeteoStation meteo);
	
	List<MeteoStationDTO> toMeteoList(List<MeteoStation>  meteoList);

}
