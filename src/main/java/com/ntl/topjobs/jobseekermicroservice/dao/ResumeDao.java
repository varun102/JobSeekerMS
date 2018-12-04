package com.ntl.topjobs.jobseekermicroservice.dao;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.ntl.topjobs.jobseekermicroservice.model.Resume;


@Repository
public interface ResumeDao  extends JpaRepository<Resume, String>{

	public Resume findByseekerId(String seekerId);

	@Transactional
    @Modifying(flushAutomatically = true,clearAutomatically = true)
    @Query("UPDATE Resume  SET noOfViews=noOfViews+1  WHERE resumeId = :resumeid")
     public int increaseViewCount(@Param("resumeid") String resumeid);
	
}
