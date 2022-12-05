package com.meteoajm.meteoajm.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.meteoajm.meteoajm.DTOs.SportComplexDTO;
import com.meteoajm.meteoajm.entities.SportComplexDAO;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SportComplexMapper {
	
//	@Mapping(target = "nameSportComplex", ignore = true)
//	@Mapping(target = "city", ignore = true)
//	@Mapping(target = "postalCode", ignore = true)
//	@Mapping(target = "assessment", ignore = true)
//	@Mapping(target = "description", ignore = true)
	@Mapping(source = "nameSportComplex", target="nombre")
	SportComplexDTO toSportComplexDTO(SportComplexDAO sportComplexDAO);
	
	List<SportComplexDTO> toSportComplexDTOList(List<SportComplexDAO>  sportComplexDAOList);
	
}
