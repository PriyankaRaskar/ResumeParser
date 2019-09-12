package edu.resume.entity;

public class JobseekerSearchInput {
	private String functionalarea;
	private String education;
	private String skill;
	private String experience;
	
	
	
	public JobseekerSearchInput(String f, String e, String s, String ex) {

		functionalarea = f;
		education = e;
		skill = s;
		experience = ex;

	}


	public String getFunctionalarea() {
		return functionalarea;
	}

	public void setFunctionalarea(String functionalarea) {
		this.functionalarea = functionalarea;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}

