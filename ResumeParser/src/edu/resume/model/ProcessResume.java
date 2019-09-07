package edu.resume.model;

import java.io.InputStream;

import edu.resume.entity.ResumeField;

public class ProcessResume {
	
	private InputStream resumeStream;
	private String resumeFileType;
	private String email;

	

	public ProcessResume(InputStream resumeStream, String resumeFileType, String email) {
		super();
		this.resumeStream = resumeStream;
		this.resumeFileType = resumeFileType;
		this.email = email;
	}



	public String resumeFileProces() {
		String resumeText = null;
		StreamToString streamtoText = new StreamToString(resumeStream, resumeFileType);
		String parseInputText = streamtoText.getTextFromStream();		
		parseInputText = parseInputText.replaceAll("[\\n\\t ]", "");
		parseInputText = parseInputText.toLowerCase();
		
		System.out.println("parseInputText:"+parseInputText);
		//get jid from email using DAO
		
		ParseResumeText TextParser = new ParseResumeText(parseInputText);
		ResumeField resumeFields = TextParser.parse();
		
		
		
		return resumeText;
	}
}
