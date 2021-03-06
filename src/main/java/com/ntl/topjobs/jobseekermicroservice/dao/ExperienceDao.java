package com.ntl.topjobs.jobseekermicroservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.jobseekermicroservice.model.EducationDetails;
import com.ntl.topjobs.jobseekermicroservice.model.ExperienceDetails;

@Repository
public interface ExperienceDao extends JpaRepository<ExperienceDetails, String>{

	public List<ExperienceDetails> findByresumeId(String resumeId);
}
