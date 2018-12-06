package com.ntl.topjobs.jobseekermicroservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("zuul-app")
public interface ServiceProxy {
	@GetMapping("job-application/getAllJobs")
	public List getAllJobs();
	
	@GetMapping("seeker-registration/seeker/getResumeid/{id}")
	public String getSeeker(@PathVariable("id")String id);
	
	@PutMapping("job-application/applyForJob/{resumeId}/{jobId}")
	public boolean applyForJob(@PathVariable("resumeId") String resumeId,@PathVariable("jobId") String jobId);
}
