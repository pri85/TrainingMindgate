package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	PrintWriter out;
	String loginId,password;
	public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		loginId = request.getParameter("txtLogin");
		password = request.getParameter("txtPassword");
		if (loginId.equals("user") && password.equals("mindgate")) {
			response.sendRedirect("success.html");
		}else {
			response.sendRedirect("failure.html");
		}
	}

}
