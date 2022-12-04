package com.meteoajm.meteoajm.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.meteoajm.meteoajm.DTOs.SportComplexDTO;

@Service
public interface SportComplexService {

	public List<SportComplexDTO> getSportComplex();
}
