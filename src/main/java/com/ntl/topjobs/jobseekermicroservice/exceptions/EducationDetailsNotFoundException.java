package com.ntl.topjobs.jobseekermicroservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EducationDetailsNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EducationDetailsNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "EducationDetailsNotFound";
	}

}
