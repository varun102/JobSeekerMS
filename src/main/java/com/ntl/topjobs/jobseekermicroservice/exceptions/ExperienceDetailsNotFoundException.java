package com.ntl.topjobs.jobseekermicroservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExperienceDetailsNotFoundException extends RuntimeException{
	
	
	public ExperienceDetailsNotFoundException(String message) {
		super(message);
	}
	
	
	@Override
	public String toString() {
		return "ExperienceDetailsNotFound";
	}

}
