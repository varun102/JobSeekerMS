package com.ntl.topjobs.jobseekermicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationDetails {
	
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long eduId;
	private String resumeId;
	private String degree;
	private String score;
	private String institution;
	private LocalDate startdate;
	private LocalDate enddate;
	private String board;
	/**
	 * 
	 */
	public EducationDetails() {
		super();
	}
	/**
	 * @param eduId
	 * @param resumeId
	 * @param degree
	 * @param score
	 * @param institution
	 * @param startdate
	 * @param enddate
	 * @param board
	 */
	public EducationDetails(long eduId, String resumeId, String degree, String score, String institution,
			LocalDate startdate, LocalDate enddate, String board) {
		super();
		this.eduId = eduId;
		this.resumeId = resumeId;
		this.degree = degree;
		this.score = score;
		this.institution = institution;
		this.startdate = startdate;
		this.enddate = enddate;
		this.board = board;
	}
	/**
	 * @return the eduId
	 */
	public long getEduId() {
		return eduId;
	}
	/**
	 * @param eduId the eduId to set
	 */
	public void setEduId(long eduId) {
		this.eduId = eduId;
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
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * @return the institution
	 */
	public String getInstitution() {
		return institution;
	}
	/**
	 * @param institution the institution to set
	 */
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	/**
	 * @return the startdate
	 */
	public LocalDate getStartdate() {
		return startdate;
	}
	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	/**
	 * @return the enddate
	 */
	public LocalDate getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	/**
	 * @return the board
	 */
	public String getBoard() {
		return board;
	}
	/**
	 * @param board the board to set
	 */
	public void setBoard(String board) {
		this.board = board;
	}
	
	
	
	
}