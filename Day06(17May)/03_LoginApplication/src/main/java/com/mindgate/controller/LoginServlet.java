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
       private String login, password;
       PrintWriter out;
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("in doPost");
		out = response.getWriter();
		login = request.getParameter("txtLogin");
		password = request.getParameter("txtPassword");
		if(login.equals("user") && password.equals("mindgate")) {
			out.println("Welcome User");
		}
		else {
			out.println("Invalid User/Password");
		}
	}

}
