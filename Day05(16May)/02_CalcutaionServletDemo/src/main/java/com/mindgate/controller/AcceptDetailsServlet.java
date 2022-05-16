package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter out;
	private String numb1;
	private String numb2;
	private double number1, number2;
	private double result;

	public AcceptDetailsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();

		System.out.println("in doGet");
//		numb1 = request.getParameter("txtNumber1");
//		numb2 = request.getParameter("txtNumber2");
//		number1 = Integer.parseInt(numb1);
//		number2 = Integer.parseInt(numb2);

		number2 = Double.valueOf(request.getParameter("txtNumber1"));
		number2 = Double.parseDouble(request.getParameter("txtNumber2"));
		result = number1 + number2;

		out.println("Addition Of " + numb1 + " & " + numb2 + " is " + result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
