package edu.resume.model;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.resume.entity.KeyWordSets;
import edu.resume.entity.ResumeField;

public class ParseResumeText {

	private static final String PINCODE_REGX = "\\s[1-9][0-9]{5}\\s";
	private static final String MOBILE_REGX = "(0/91)?[7-9][0-9]{9}";
	private static final String DOB_REGX = "0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)";
	private String parseInputText;
	private ResumeField resumeFields = new ResumeField();
	private KeyWordSets keyWordSets;

	public ParseResumeText(String parseInputText) {

		this.parseInputText = parseInputText;

		keyWordSets = KeyWordSets.getKeyWordSetsInstance();
	}

	public ResumeField parse() {

		// get Skills
		Set<String> skills = parseResumeText(keyWordSets.getSkills());
		System.out.println("skills: " + skills);
		resumeFields.setSkills(skills);

		// getEducation
		Set<String> educations = parseResumeText(keyWordSets.getEducation());
		System.out.println("educations: " + educations);
		resumeFields.setEducation(educations);

		// get and set functionalArea
		Set<String> functionalArea = parseResumeText(keyWordSets.getFunctionalArea());
		System.out.println("functionalArea: " + functionalArea);
		resumeFields.setFunctionalArea(functionalArea);

		
		//get mobile no
		String mobileNo = getParsedFromRegex(MOBILE_REGX);
		System.out.println("mobileNo :"+mobileNo);
		resumeFields.setMobileNumber(mobileNo);
		
		//get Date of birth
		String dob = getParsedFromRegex(DOB_REGX);
		System.out.println("Date of birth:"+dob);
		resumeFields.setDob(dob);
		
		//get pincode
		String pincode = getParsedFromRegex(PINCODE_REGX);
		System.out.println("Pincode is"+pincode);
		resumeFields.setPincode(pincode);
		
		
		
		return resumeFields;
	}

	private String getParsedFromRegex(String regEx) {
		String parsedText=null;
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(parseInputText);
		while (m.find()) {
			parsedText = m.group();
		}
		return parsedText;
	}

	private Set<String> parseResumeText(Set<String> wordSet) {

		Set<String> result = new HashSet<String>();

		for (String word : wordSet) {
			if (parseInputText.contains(word))
				result.add(word);
		}

		return result;
	}

}
