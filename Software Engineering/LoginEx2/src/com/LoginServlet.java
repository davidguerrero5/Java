package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// default constructor
	public LoginServlet() {

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// retrieves values from text fields
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");
		String personalEmail = request.getParameter("personalEmail");

		// allows for admin to log in
		if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			request.setAttribute("Username", username);
			request.setAttribute("Password", password);
			rd.forward(request, response);

		// if user is not an admin, they will be signed up
		} else if (firstName != null) {
			request.setAttribute("Username", username);
			request.setAttribute("Password", password);
			request.setAttribute("firstName", firstName);
			request.setAttribute("lastName", lastName);
			request.setAttribute("address", address);
			request.setAttribute("phoneNumber", phoneNumber);
			request.setAttribute("personalEmail", personalEmail);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("error.jsp");
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}