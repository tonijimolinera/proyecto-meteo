package com.meteoajm.meteoajm.DTOs;

public class MeteoStationDTO {

	
	private String nombreEstacion;
	private Integer lat;
	private Float lon;
	private String comentario;
	
	public MeteoStationDTO() {}
	
	public MeteoStationDTO(String nombreEstacion, Integer lat, Float lon, String comentario) {
		super();
		this.nombreEstacion = nombreEstacion;
		this.lat = lat;
		this.lon = lon;
		this.comentario = comentario;
	}

	public String getNombreEstacion() {
		return nombreEstacion;
	}

	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}


	public Integer getLat() {
		return lat;
	}

	public void setLat(Integer lat) {
		this.lat = lat;
	}

	public Float getLon() {
		return lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

		
}
