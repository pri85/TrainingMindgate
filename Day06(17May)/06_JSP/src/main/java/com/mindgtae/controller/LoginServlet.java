package com.mindgtae.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	PrintWriter out;
	private String userId;
	private String password;
	
	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		userId = request.getParameter("txtUserId");
		password = request.getParameter("txtPassword");
		request.setAttribute("txtUserId",userId);
		
		if (userId.equals(password)) {
			//response.sendRedirect("success.jsp");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
			
		}else {
			//response.sendRedirect("failure.jsp");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("failure.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
