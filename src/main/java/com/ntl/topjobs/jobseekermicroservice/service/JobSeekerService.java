package com.ntl.topjobs.jobseekermicroservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ntl.topjobs.jobseekermicroservice.dao.EducationDao;
import com.ntl.topjobs.jobseekermicroservice.dao.ExperienceDao;
import com.ntl.topjobs.jobseekermicroservice.dao.ResumeDao;
import com.ntl.topjobs.jobseekermicroservice.dao.SkillsDao;
import com.ntl.topjobs.jobseekermicroservice.exceptions.ResumeNotFoundException;
import com.ntl.topjobs.jobseekermicroservice.model.EducationDetails;
import com.ntl.topjobs.jobseekermicroservice.model.ExperienceDetails;
import com.ntl.topjobs.jobseekermicroservice.model.Resume;
import com.ntl.topjobs.jobseekermicroservice.model.Skills;

@Service
public class JobSeekerService {

	@Autowired
	private ResumeDao resumeDao;

	@Autowired
	private SkillsDao skillsDao;

	@Autowired
	private ExperienceDao expDao;

	@Autowired
	private EducationDao eduDao;

	public JobSeekerService() {
		super();
	}

	public JobSeekerService(ResumeDao resume) {
		resumeDao = resume;
	}

	public JobSeekerService(SkillsDao skill) {
		skillsDao = skill;
	}

	public JobSeekerService(ExperienceDao experience) {
		expDao = experience;
	}

	public JobSeekerService(EducationDao education) {
		eduDao = education;
	}

	public List<Resume> getResumeDetails() {
		return resumeDao.findAll();
	}

	public Resume getResumeDetails(String id)
	{
		return resumeDao.findById(id).get();
	}
	
//	public Resume getResumeDetails(String id) {
//               updateViews(id);
//         Optional<Resume> optional = resumeDao.findById(id);    
//         if(!optional.isPresent()) {
//        	 throw new ResumeNotFoundException(id);
//         }
//               
//		return optional.get();
//	}

	public Resume addResume(Resume resumeBean) {
		String resumeId = generateResumeId();
		resumeBean.setResumeId(resumeId);
		return resumeDao.save(resumeBean);
	}

	public List<EducationDetails> getEducationDetails() {
		return eduDao.findAll();

	}
	
	public List<Resume> getResumes(String arr){
		String[] arrList=arr.split(",");
		ArrayList<Resume> resumes=new ArrayList<>();
		for(String a:arrList) {
			resumes.add(getResumeDetails(a));
		}
		return resumes;
	}

	public List<EducationDetails> getEducationDetailsByResumeId(String resumeId) {

		return eduDao.findByResumeID(resumeId);
	}

	public EducationDetails addEducation(EducationDetails education) {

		return eduDao.save(education);

	}

	public List<ExperienceDetails> getExperienceDetails() {
		return expDao.findAll();
	}

	public List<ExperienceDetails> getExperienceDetails(String id) {
		return expDao.findByresumeId(id);
	}

	public ExperienceDetails addExperience(ExperienceDetails experience) {

		return expDao.save(experience);
	}

	public List<Skills> getSkillsDetails() {
		return skillsDao.findAll();
	}

	public List<Skills> getSkillsDetails(String resumeId) {
		return skillsDao.findByresumeId(resumeId);
	}

	public Skills addSkills(Skills skill) {

		return skillsDao.save(skill);
	}

	public String generateResumeId() {
		int x = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
		String str = Integer.toString(x);
		char a[] = { str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3) };
		return (new String(a));
	}

	public int updateViews(String id)
	{
		return resumeDao.increaseViewCount(id);
	}
//	public int updateViews(String id) {
//		
//		 Optional<Resume> optional = resumeDao.findById(id);
//		 if (!optional.isPresent())
//				{throw new ResumeNotFoundException("id-" + id);
//	            }
//			return resumeDao.increaseViewCount(id);
//		}

}
