package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
       private double number1, number2;
       PrintWriter out;
    public CalculatorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		number1 = Double.parseDouble(request.getParameter("txtNum1"));
		number2 = Double.parseDouble(request.getParameter("txtNum2"));
		
		if (request.getParameter("add").equalsIgnoreCase("add")) {
			
		}else if (request.getParameter("sub").equalsIgnoreCase("sub")) {
			
		}else if (request.getParameter("mul").equalsIgnoreCase("mul")) {
			
		}else if (request.getParameter("div").equalsIgnoreCase("div")) {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
