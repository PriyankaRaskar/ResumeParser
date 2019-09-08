package edu.resume.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.resume.dao.EmployerDAO;
import edu.resume.dao.JobseekerDAO;

/**
 * Servlet implementation class EmployerSearch
 */
@WebServlet("/EmployerSearch")
public class EmployerSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployerSearch() {
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
		String functionarea = request.getParameter("functionarea");
		String education = request.getParameter("education");
		String skill = request.getParameter("skill");
		String experience = request.getParameter("experience");
		String select1 = request.getParameter("select1");
		String select2 = request.getParameter("select2");
		String select3 = request.getParameter("select3");
		System.out.println("functionarea : " + functionarea);
		System.out.println("education:" + education);
		System.out.println("skill:" + skill);
		System.out.println("experience :" + experience);
		System.out.println("select1:" + select1);
		System.out.println("select2:" + select2);
		System.out.println("select3:" + select3);
		//boolean status = JobseekerDAO.searchJobseeker();
	}

}
