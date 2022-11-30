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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_mast_meteo_stations")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MeteoStation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name = "name")
	@NotNull(message = "El name no puede ser NULL")
	@Size(min = 2, message = "{validation.name.size.too_short}")
	@Size(max = 255, message = "{validation.name.size.too_long}")
	@Getter
	@Setter
	private String name;
	
	@Column(name = "longitude")
	@NotNull
	private Double longitude;
	
	@Column(name = "latitude")
	@NotNull
	private Double latitude;
	
	@Column(name = "comments")
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	

}
