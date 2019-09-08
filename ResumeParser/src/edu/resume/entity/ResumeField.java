package edu.resume.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class ResumeField {

	private int jid;
	private String mobileNumber;
	private Float experience;
	private Date dob;
	private String pincode;
	private String email;
	private String resumePath;

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

	public Float getExperience() {
		return experience;
	}

	public void setExperience(String experience) {

		if(experience==null)
			return;
		experience = experience.substring(0, experience.indexOf(" "));

		if (experience != null) {
			this.experience = Float.parseFloat(experience);
		}
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(String dob) {
		Date date1 = null;
		if(dob==null)
			return;
		try {
			String format = "";

			if (dob.contains("/")) {
				format = "dd/MM/yyyy";
			} else if (dob.contains("-")) {
				format = "dd-MM-yyyy";
			} else if (dob.contains(".")) {
				format = "dd.MM.yyyy";
			}

			date1 = new SimpleDateFormat(format).parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.dob = date1;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResumePath() {
		return resumePath;
	}

	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}

	@Override
	public String toString() {
		return "ResumeField [jid=" + jid + ", mobileNumber=" + mobileNumber + ", experience=" + experience + ", dob="
				+ dob + ", picode=" + pincode + ", skills=" + skills + ", education=" + education + ", functionalArea="
				+ functionalArea + "]";
	}

}
