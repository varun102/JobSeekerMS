package com.ntl.topjobs.jobseekermicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long skillsId;
	private String resumeId;
	private String skill;
	
	/**
	 * 
	 */
	public Skills() {
		super();
	}
	/**
	 * @return the skillsId
	 */
	public Long getSkillsId() {
		return skillsId;
	}
	/**
	 * @param skillsId the skillsId to set
	 */
	public void setSkillsId(Long skillsId) {
		this.skillsId = skillsId;
	}
	/**
	 * @return the resumeId
	 */
	public String getResumeId() {
		return resumeId;
	}
	/**
	 * @param resumeId the resumeId to set
	 */
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skill;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skill = skills;
	}
	
	

}
