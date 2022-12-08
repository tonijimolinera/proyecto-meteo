package com.meteoajm.meteoajm.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.meteoajm.meteoajm.DTOs.MeteoStationDTO;
import com.meteoajm.meteoajm.entities.MeteoStation;
import com.meteoajm.meteoajm.mappers.MeteoStationMapper;
import com.meteoajm.meteoajm.repositories.MeteoStationRepository;
import com.meteoajm.meteoajm.services.MeteoStationService;

@Service
public class MeteoStationServiceImpl implements MeteoStationService {

	@Autowired
	private MeteoStationRepository meteoRepository;
	
	@Autowired
	private MeteoStationMapper	meteoMapper;

	@Override
	public List<MeteoStationDTO> getMeteoStations() {

// 		return meteoRepository.findAll();
		List<MeteoStationDTO> miListDto = new ArrayList<MeteoStationDTO>();
		List<MeteoStation> miListDao;
		miListDao = meteoRepository.findAll();
		
		for (MeteoStation bucle: miListDao) {

			miListDto.add(meteoMapper.toMeteo(bucle));
		}
		return miListDto;
		
//		return meteoMapper.toMeteoList(meteoRepository.findAll());
		
	}
	
	@Override
	public MeteoStationDTO getMeteoStationById(Integer id) {
		/*
		Optional<MeteoStation> opt = meteoRepository.findById(id);
		if (opt.isEmpty()) {
			throw new NoSuchElementException("No existe el usuario con id: " + id);
		}
		//return meteoMapper.toMeteo(meteoRepository.getMeteoStationById(id));
		return meteoMapper.toMeteo(opt.get());
		esto es un test*/
		return null;
	}
	
	@Override
	public List<MeteoStation> getMeteoStationsByName(String name) {

//		return meteoRepository.getMeteoStationsByName(name);
		return meteoRepository.getMeteoStationsByNameSQL(name);
		
	}

	@Override
	public void deleteMeteoStations(Integer id) {

		meteoRepository.deleteById(id);

	}

	@Override
	public List<MeteoStation> deleteMeteoStations(String name) {

		List<MeteoStation> listMeteo = meteoRepository.findAll();
		List<MeteoStation> listBorrado = new ArrayList<>();
		for (MeteoStation miMeteo : listMeteo) {
			if (miMeteo.getName().equals(name)) {

				listBorrado.add(miMeteo);
				meteoRepository.deleteById(miMeteo.getId());
			}
		}
		return listBorrado;
	}

	@Override
	public MeteoStation insertMeteoStationByParam(String name, Double latitude, Double longitude) {

		MeteoStation miNewMeteo = new MeteoStation();

		miNewMeteo.setName(name);
		miNewMeteo.setLatitude(latitude);
		miNewMeteo.setLongitude(longitude);

		meteoRepository.save(miNewMeteo);

		return miNewMeteo;
	}

	@Override
	@Transactional
	public MeteoStation insertMeteoStationByBody(MeteoStation body) {

		MeteoStation miMeteo = new MeteoStation(body.getName());

		if(body.getLatitude() > 1800) {
			throw new IllegalArgumentException("La latitudes es mayor de la permitido 18");
		}
			
		if (meteoRepository.exists(Example.of(miMeteo))) {
			
			throw new DuplicateKeyException("Ya existe el usuario con nombre: " + body.getName());
		}
		/*miMeteo.setName(body.getName());
		miMeteo.setLatitude(body.getLatitude());
		miMeteo.setLongitude(body.getLongitude());
		miMeteo.setComments(body.getComments());*/
		return meteoRepository.save(body);
	}

	@Override
	public MeteoStation updateMeteoStations(Integer id, String name, Double latitude, Double longitude) {

		// Bien
		MeteoStation miMeteo = meteoRepository.findById(id).get();

		// Mal MeteoStation miMeteo = meteoRepository.getById(id);

		miMeteo.setName(name);
		miMeteo.setLatitude(latitude);
		miMeteo.setLongitude(longitude);

		meteoRepository.save(miMeteo);

		return miMeteo;

	}

	// No lo uso por ahora
	@Override
	public MeteoStation updateTestMeteoStations(Integer id, MeteoStation body) {

		MeteoStation miMeteo = meteoRepository.findById(id).get();

		miMeteo.setName(body.getName());
		miMeteo.setLatitude(body.getLatitude());
		miMeteo.setLongitude(body.getLongitude());

		meteoRepository.save(miMeteo);

		return miMeteo;
	}

	@Override
	public MeteoStation updateTestMeteoStationsByMap(Map<String, String> body) {

		MeteoStation miMeteo = meteoRepository.findById(Integer.parseInt(body.get("id"))).get();
		miMeteo.setName(body.get("name"));
		miMeteo.setLatitude(Double.parseDouble(body.get("la")));
		miMeteo.setLatitude(Double.parseDouble(body.get("lo")));
		;

		meteoRepository.save(miMeteo);
		return miMeteo;

	}

}
