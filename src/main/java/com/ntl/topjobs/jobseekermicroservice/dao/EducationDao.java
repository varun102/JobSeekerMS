package com.ntl.topjobs.jobseekermicroservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.jobseekermicroservice.model.EducationDetails;

@Repository
public interface EducationDao extends JpaRepository<EducationDetails,Long>{

	public List<EducationDetails> findByResumeId(String resumeId);
}
