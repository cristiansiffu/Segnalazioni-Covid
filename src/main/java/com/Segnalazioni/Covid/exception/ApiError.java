package com.Segnalazioni.Covid.exception;

import org.springframework.http.HttpStatus;

public class ApiError {
	public ApiError(String message2, HttpStatus internalServerError) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public ApiError() {};

	private String message;
	private HttpStatus status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}