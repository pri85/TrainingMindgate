package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	PrintWriter out;
	Employee employee;
	Set<Employee> employeeSet;
	EmployeeDAO employeeDAO = new EmployeeDAO();
	
	
    public GetAllEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	out = response.getWriter();
	out.print("Get All Employees<br><br>");
	employeeSet = employeeDAO.getAllEmployee();
	
	for (Employee employee : employeeSet) {
		out.println("Id : "+employee.getEmployeeId()+" Name : "+employee.getName()
	    +" Salary : "+employee.getSalary()+"<br>");
		
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
}
