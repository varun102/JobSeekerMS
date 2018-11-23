package com.ntl.topjobs.jobseekermicroservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ntl.topjobs.jobseekermicroservice.model.Skills;

@Repository
public interface SkillsDao extends JpaRepository<Skills, String>{

	public List<Skills> findByresumeId(String resumeId);
}
