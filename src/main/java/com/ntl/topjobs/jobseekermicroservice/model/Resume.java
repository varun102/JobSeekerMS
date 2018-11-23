package com.ntl.topjobs.jobseekermicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resume {

	@Id
	private String resumeId;
	private String name;
	private String email;
	private String contact;
	private String gender;
	private LocalDate dob;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	private String seekerId;
	
	
	
	
	/**
	 * 
	 */
	public Resume() {
		super();
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
	 * @return the seekerId
	 */
	public String getSeekerId() {
		return seekerId;
	}
	/**
	 * @param seekerId the seekerId to set
	 */
	public void setSeekerId(String seekerId) {
		this.seekerId = seekerId;
	}
	
	
}
