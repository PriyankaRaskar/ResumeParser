package edu.resume.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import edu.resume.dao.JobseekerDAO;

/**
 * Servlet implementation class UploadResume
 */
@WebServlet("/UploadResume")
@MultipartConfig
public class UploadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "D:/uploads";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadResume() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		System.out.println("Email:" + email);

		int jid = JobseekerDAO.uploadResume(email);
		if (jid > -1) {

			Part filePart = request.getPart("resumeFile"); // Retrieves <input type="file" name="file">
			String resumeFileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
			InputStream resumeStream = filePart.getInputStream();
			new File(UPLOAD_DIRECTORY + File.separator + jid).mkdirs();
			System.out.println("resumeFileName: "+resumeFileName);
			Path path = Paths.get(UPLOAD_DIRECTORY + File.separator + jid + File.separator + resumeFileName);
			System.out.println("path:"+path);
			Files.copy(resumeStream, path);

		}

	}

	

}
