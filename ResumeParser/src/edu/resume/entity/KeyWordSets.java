package edu.resume.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeyWordSets {

	private static final String FUNCTIONALAREA_TXT_FILE_PATH = "E:\\Priyanka Projects\\Resume Parser\\Documents\\InputOutput\\Output\\functionalarea.txt";
	private static final String EDUCATION_TXT_FILE_PATH = "E:\\Priyanka Projects\\Resume Parser\\Documents\\InputOutput\\Output\\education.txt";
	private static final String SKILL_TXT_FILE_PATH = "E:\\Priyanka Projects\\Resume Parser\\Documents\\InputOutput\\Output\\skill.txt";
	private static Set<String> skills;
	private static Set<String> education;
	private static Set<String> functionalArea;

	private static KeyWordSets instance = new KeyWordSets();

	private KeyWordSets() {
		skills = getSetFromTextFile(SKILL_TXT_FILE_PATH);
		education = getSetFromTextFile(EDUCATION_TXT_FILE_PATH);
		functionalArea = getSetFromTextFile(FUNCTIONALAREA_TXT_FILE_PATH);
	}

	public Set<String> getSkills() {
		return skills;
	}

	public Set<String> getEducation() {
		return education;
	}

	public Set<String> getFunctionalArea() {
		return functionalArea;
	}

	public static KeyWordSets getKeyWordSetsInstance() {
		return instance;
	}

	public Set<String> getSetFromTextFile(String filePath) {

		Set<String> fieldSet = new HashSet<>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));

			String line = br.readLine();

			while (line != null) {
				line = br.readLine();
				//getStringSetFromString
				if(line==null || line =="")
					continue;
				Set<String> set = getSetFromString(line);
				fieldSet.addAll(set);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		fieldSet.remove("");
		return fieldSet;

	}

	private Set<String> getSetFromString(String line) {

		//preprocess String to remove whitespaces linbreak;
		line = line.replaceAll("[\\n\\t ]", "");
		line = line.toLowerCase();
		
		Set<String> wordSet = new HashSet<>();
		
		String arr[] = line.split("\n");
		wordSet.addAll(Arrays.asList(arr));
		
		return wordSet;
	}

}
