package com.ntl.topjobs.jobseekermicroservice.controller;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.ntl.topjobs.jobseekermicroservice.model.EducationDetails;
import com.ntl.topjobs.jobseekermicroservice.model.ExperienceDetails;
import com.ntl.topjobs.jobseekermicroservice.model.Resume;
import com.ntl.topjobs.jobseekermicroservice.model.Skills;
import com.ntl.topjobs.jobseekermicroservice.service.JobSeekerService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class JobSeekerController {

	@Autowired
	private JobSeekerService service;

    
	public JobSeekerController() {}
	
	public JobSeekerController(JobSeekerService service2) {
		service = service2;
	}

	@GetMapping("/resume/{id}")
	public Resume displayResumeDetails(@PathVariable String id){
		      
 		return service.getResumeDetails(id);
	}
    
	@GetMapping("/resumes/getforjob/{list}")
	public List<Resume> getResumes(@PathVariable("list") String arr){
		
		return service.getResumes(arr);
	}
	
    @GetMapping("/education/{id}")
    public List<EducationDetails> displayAllEducationDetailsByResumeId(@PathVariable String id){
    	
    	return service.getEducationDetailsByResumeId(id);
    }
    
   
    
    @GetMapping("/exp/{id}")
    public List<ExperienceDetails> displayAllExperienceDetailsByResumeId(@PathVariable String id){
    	return service.getExperienceDetails(id);
    }
    
   
    
    @GetMapping("/skill/{id}")
    public List<Skills> displayAllSkillsDetailsByResumeId(@PathVariable String id){
    	return service.getSkillsDetails(id);
    }
    
    
   @PostMapping("/resume")
   public ResponseEntity<Object> addResumeDetails( @RequestBody Resume resume) {
	   		
	  	  Resume res =service.addResume(resume);
	 	 
	  	  URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
	  			  .buildAndExpand(res.getResumeId()).toUri();
	  	   
	  	  
	  	  return ResponseEntity.created(uri).build();
	  	  
	    }
  
    
    @PostMapping("/education")
    public ResponseEntity<Object> addEducationDetails( @RequestBody EducationDetails education) {
  	  EducationDetails edu =service.addEducation(education);
 	 
  	  URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
  			  .buildAndExpand(edu.getEduID()).toUri();
  	   
  	  
  	  return ResponseEntity.created(uri).build();
  	  
    }
    
    @PostMapping("/exp")
    public ResponseEntity<Object> addExperienceDetails( @RequestBody ExperienceDetails experience) {
  	  ExperienceDetails exp =service.addExperience(experience);
 	 
  	  URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
  			  .buildAndExpand(exp.getExpId()).toUri();
  	   
  	  
  	  return ResponseEntity.created(uri).build();

    }
    
    @PostMapping("/skill")
    public ResponseEntity<Object> addSkillsDetails( @RequestBody Skills skill) {
  	  Skills skil =service.addSkills(skill);
 	 
  	  URI uri =ServletUriComponentsBuilder.fromCurrentRequest()
  			  .buildAndExpand(skil.getSkillsId()).toUri();
  	   
  	  
  	  return ResponseEntity.created(uri).build();
}
    
}    
