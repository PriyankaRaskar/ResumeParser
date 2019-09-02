package edu.resume.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.resume.dao.EmployerDAO;

/**
 * Servlet implementation class EmployerRegister
 */
@WebServlet("/EmployerRegister")
public class EmployerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployerRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("cname");
		String regno = request.getParameter("regno");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		//String uname = request.getParameter("username");
		String password = request.getParameter("pwd");
		String contactdetail = request.getParameter("contactdetail");
		String ares = request.getParameter("farea");
		
		System.out.println("name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Password :" + password);
		System.out.println("address :" + address);
		System.out.println("contactdetail :" + contactdetail);
		System.out.println("area :" + ares);
		boolean status = EmployerDAO.registerEmployer(name,regno,email,address,password,contactdetail,ares);
		if (status) {
			request.setAttribute("email", email);
			request.getRequestDispatcher("emplogin.jsp").forward(request, response);

		} else {

			request.setAttribute("errMsg", "Plz try with another Mailid");
			request.getRequestDispatcher("Empregistration.jsp").forward(request, response);
		}
	}

}
