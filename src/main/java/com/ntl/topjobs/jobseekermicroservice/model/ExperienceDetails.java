package com.ntl.topjobs.jobseekermicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExperienceDetails {
	

	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long expId;
	private String resumeId;
	private String companyName;
	private String noOfYears;
	private String position;
	private String description;
	

	/**
	 * 
	 */
	public ExperienceDetails() {
		super();
	}
	/**
	 * @return the expId
	 */
	public Long getExpId() {
		return expId;
	}
	/**
	 * @param expId the expId to set
	 */
	public void setExpId(Long expId) {
		this.expId = expId;
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
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the noOfYears
	 */
	public String getNoOfYears() {
		return noOfYears;
	}
	/**
	 * @param noOfYears the noOfYears to set
	 */
	public void setNoOfYears(String noOfYears) {
		this.noOfYears = noOfYears;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
