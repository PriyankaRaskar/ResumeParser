package edu.resume.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.resume.dao.JobseekerDAO;

/**
 * Servlet implementation class JobseekerRegister
 */

@WebServlet("/JobseekerRegister")
public class JobseekerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JobseekerRegister() {
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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		System.out.println("name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Password :" + password);
		boolean status = JobseekerDAO.registerJobseeker(name, email, password);
		if (status) {
			request.setAttribute("email", email);
			request.getRequestDispatcher("UploadResume.jsp").forward(request, response);

		} else {

			request.setAttribute("errMsg", "Plz try with another Mailid");
			request.getRequestDispatcher("JobseekerRegistration.jsp").forward(request, response);
		}

	}

}
