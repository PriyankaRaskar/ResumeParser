package edu.resume.entity;

import java.util.Set;

public class ResumeField {
	
	private int jid;
	private String mobileNumber;
	private String experience;
	private String dob;
	private String pincode;
	
	private Set<String> skills;
	private Set<String> education;
	private Set<String> functionalArea;
	
	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String picode) {
		this.pincode = picode;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Set<String> getEducation() {
		return education;
	}

	public void setEducation(Set<String> education) {
		this.education = education;
	}

	public Set<String> getFunctionalArea() {
		return functionalArea;
	}

	public void setFunctionalArea(Set<String> functionalArea) {
		this.functionalArea = functionalArea;
	}

	@Override
	public String toString() {
		return "ResumeField [jid=" + jid + ", mobileNumber=" + mobileNumber + ", experience=" + experience + ", dob="
				+ dob + ", picode=" + pincode + ", skills=" + skills + ", education=" + education + ", functionalArea="
				+ functionalArea + "]";
	}

	
}
