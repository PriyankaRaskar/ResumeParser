package edu.resume.model;

import java.io.File;
import java.io.InputStream;

import edu.resume.dao.JobseekerDAO;
import edu.resume.entity.ResumeField;

public class ProcessResume {
	
	private InputStream resumeStream;
	private String resumeFileType;
	private String email;
	private int jid;
	private File resumeFile;

	public ProcessResume(File file, InputStream resumeStream, String resumeFileType, String email, int jid) {
		super();
		this.resumeStream = resumeStream;
		this.resumeFileType = resumeFileType;
		this.email = email;
		this.jid = jid;
		this.resumeFile = file;
	}



	public String resumeFileProces() {
		String resumeText = null;
		StreamToString streamtoText = new StreamToString(resumeStream, resumeFileType);
		String parseInputText = streamtoText.getTextFromStream();		
		parseInputText = parseInputText.replaceAll("[\\n\\t ]", " ");
		//parseInputText = parseInputText.toLowerCase();
		
		System.out.println("parseInputText:"+parseInputText);
		
		
		ParseResumeText TextParser = new ParseResumeText(parseInputText);
		ResumeField resumeFields = TextParser.parse();
		resumeFields.setJid(jid);
		resumeFields.setEmail(email);
		resumeFields.setResumePath(resumeFile.getName());
		boolean status = JobseekerDAO.insertResumeData(resumeFields);
		
		return resumeText;
	}
}
