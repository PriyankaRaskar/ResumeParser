package edu.resume.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.resume.dao.EmployerDAO;

/**
 * Servlet implementation class EmployerLogin
 */
@WebServlet("/EmployerLogin")
public class EmployerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployerLogin() {
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
		boolean status = EmployerDAO.employerLogin(email, password);
		if (status) {
			request.setAttribute("email", email);
			request.getRequestDispatcher("EmployerHome.jsp").forward(request, response);

		} else {

			request.setAttribute("errMsg", "Invalid User");
			request.getRequestDispatcher("emplogin.jsp").forward(request, response);
		}
	}

}
