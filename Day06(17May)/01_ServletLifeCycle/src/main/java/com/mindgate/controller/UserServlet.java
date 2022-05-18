package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

	PrintWriter printWriter;
	private String name;
	public UserServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet");
		printWriter = response.getWriter();
		printWriter.println("Hello From doGet()");
		name = request.getParameter("txtUserName");
		printWriter.println("Hello :: "+name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doPost");
		printWriter = response.getWriter();
		printWriter.println("Hello From doPost()");
	}

}
