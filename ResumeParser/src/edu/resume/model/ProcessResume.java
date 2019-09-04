package edu.resume.model;

import java.io.InputStream;

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
		String parsedText = streamtoText.getTextFromStream();
		System.out.println("parsedText:"+parsedText);
		
		return resumeText;
	}
}
