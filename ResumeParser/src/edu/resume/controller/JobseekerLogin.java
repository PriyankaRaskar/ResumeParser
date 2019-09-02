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
 * Servlet implementation class JobseekerLogin
 */
@WebServlet("/JobseekerLogin")
public class JobseekerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobseekerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println("Email:" + email);
		System.out.println("Password :" + password);
		boolean status = JobseekerDAO.jobseekerLogin(email, password);
		if (status) {
			request.setAttribute("email", email);
			request.getRequestDispatcher("JobseekerHome.jsp").forward(request, response);

		} else {

			request.setAttribute("errMsg", "Invalid User");
			request.getRequestDispatcher("jobseekerlogin.jsp").forward(request, response);
		}
	}

}
