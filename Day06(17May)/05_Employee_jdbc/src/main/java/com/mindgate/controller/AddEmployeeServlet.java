package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {

	private String name;
	private double salary;
	PrintWriter out;
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	private boolean result;

	public AddEmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		name = request.getParameter("txtName");
		salary = Double.parseDouble(request.getParameter("txtSalary"));
		out.println("Name :: " + name + "<br><br>" + "Salary :: " + salary);
		out.println();
		Employee employee = new Employee(0, name, salary);
		
		result = employeeDAO.addEmplyoee(employee);
		response.setContentType("text/html");
		
		if (result) { 
			//out.println("Record Added Successfully!"+"<br><br>");
			//out.println("<a href=employeehome.html>Home Page</a>");
			response.sendRedirect("GetAllEmployeeServlet");
		}else {
			out.println("Failed to add record"+"<br><br>");
			
		}
		
		
	}

}
