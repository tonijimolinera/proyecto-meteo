package com.meteoajm.meteoajm.DTOs;

public class SportComplexDTO {

	private String nombre;
	private String city;
	private Integer postalCode;
	private String description;
	private byte assessment;
	
	// Probar en intelliJ que esto es === @NoArgsConstructor
	public SportComplexDTO() {}
	
	
	// Probar en intelliJ que esto es === @AllArgsConstructor
	public SportComplexDTO(String nombre, String city, Integer postalCode, String description, byte assessment) {
		super();
		this.nombre = nombre;
		this.city = city;
		this.postalCode = postalCode;
		this.description = description;
		this.assessment = assessment;
	}
	
	// // Probar en intelliJ que esto es === @Data
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte getAssessment() {
		return assessment;
	}
	public void setAssessment(byte assessment) {
		this.assessment = assessment;
	}	
}