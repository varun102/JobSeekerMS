package com.ntl.topjobs.jobseekermicroservice.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResumeNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResumeNotFoundException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return "ResumeDetailsNotFound";
	}

}
