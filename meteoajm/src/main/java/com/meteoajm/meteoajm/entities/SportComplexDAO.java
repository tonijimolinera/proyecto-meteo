package com.meteoajm.meteoajm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_sport_complex")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SportComplexDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sport_complex")
	private Integer idSportComplex;

	@Size(min = 2, message = "{validation.name.size.too_short}")
	@Size(max = 255, message = "{validation.name.size.too_long}")
	@NotNull(message = "El nameSportComplex no puede ser NULL")
	@Column(name = "name_sport_complex")
	private String nameSportComplex;

	@Column(name = "city")
	private String city;

	@Column(name = "postal_code")
	private Integer postalCode;

	@Column(name = "street")
	private String street;

	@Column(name = "number_address")
	private Integer numberAddress;

	@Column(name = "additional_address_detail")
	private String additionalAddressDetail;

	@Column(name = "description")
	private String description;

	@Column(name = "assessment")
	private byte assessment;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	public Integer getIdSportComplex() {
		return idSportComplex;
	}

	public void setIdSportComplex(Integer idSportComplex) {
		this.idSportComplex = idSportComplex;
	}

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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(Integer numberAddress) {
		this.numberAddress = numberAddress;
	}

	public String getAdditionalAddressDetail() {
		return additionalAddressDetail;
	}

	public void setAdditionalAddressDetail(String additionalAddressDetail) {
		this.additionalAddressDetail = additionalAddressDetail;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
