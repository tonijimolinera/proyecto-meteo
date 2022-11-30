package com.meteoajm.meteoajm.exceptions;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

	private int status;
	private String message;
	private Date timestamp;
	
	List<String> errors;

	public ErrorResponse(String message) {
		this.message = message;
	}
	
	public ErrorResponse() {}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(java.util.Date timestamp) {
		this.timestamp = (Date) timestamp;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
