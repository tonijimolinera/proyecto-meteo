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
	@Column(name="idSportComplex")
	private Integer idSportComplex;
	
	@Column(name = "nameSportComplex")
	@NotNull(message = "El nameSportComplex no puede ser NULL")
	@Size(min = 2, message = "{validation.name.size.too_short}")
	@Size(max = 255, message = "{validation.name.size.too_long}")
	private String nameSportComplex;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "postalCode")
	private Integer postalCode;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "numberAddress")
	private Integer numberAddress;
	
	@Column(name = "additionalAddressDetail")
	private String additionalAddressDetail;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "assessment")
	private byte assessment;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
}
