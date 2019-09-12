package edu.resume.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.resume.entity.ResumeConstants;

/**
 * Servlet implementation class DownloadResume
 */
@WebServlet("/DownloadResume")
public class DownloadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownloadResume() {
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
		String resumepath = request.getParameter("resumePath");
		String jid = request.getParameter("jid");
		System.out.println("resumepath:" + resumepath);
		System.out.println("jid :" + jid);

		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ resumepath + "\"");
		
		String resumePath = ResumeConstants.UPLOAD_DIRECTORY + File.separator + jid + File.separator + resumepath;
		OutputStream out = response.getOutputStream();
		try {
			FileInputStream in = new FileInputStream(resumePath);
			byte[] buffer = new byte[4096];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
