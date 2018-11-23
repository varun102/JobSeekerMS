package com.ntl.topjobs.jobseekermicroservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.jobseekermicroservice.model.EducationDetails;
import com.ntl.topjobs.jobseekermicroservice.model.Resume;

@Repository
public interface ResumeDao  extends JpaRepository<Resume, String>{

	
}
