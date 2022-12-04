package com.meteoajm.meteoajm.DTOs;

public class SportComplexDTO {

	private String nameSportComplex;
	private String city;
	private Integer postalCode;
	private String description;
	private byte assessment;
	
	// Probar en intelliJ que esto es === @NoArgsConstructor
	public SportComplexDTO() {}
	
	
	// Probar en intelliJ que esto es === @AllArgsConstructor
	public SportComplexDTO(String nameSportComplex, String city, Integer postalCode, String description, byte assessment) {
		super();
		this.nameSportComplex = nameSportComplex;
		this.city = city;
		this.postalCode = postalCode;
		this.description = description;
		this.assessment = assessment;
	}
	
	// // Probar en intelliJ que esto es === @Data
	public String getNameSportComplex() {
		return nameSportComplex;
	}
	public void setNameSportComplex(String nameSportComplex) {
		this.nameSportComplex = nameSportComplex;
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