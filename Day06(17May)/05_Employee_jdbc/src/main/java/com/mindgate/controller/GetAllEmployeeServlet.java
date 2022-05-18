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
import javax.servlet.http.HttpSession;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private Employee employee;
	private Set<Employee> employeeSet;
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	
	
    public GetAllEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	out = response.getWriter();
	out.print("Get All Employees<br><br>");
	employeeSet = employeeDAO.getAllEmployee();
	HttpSession session = request.getSession();
	session.setAttribute("data", employeeSet);
	response.sendRedirect("displayallemployees.jsp");
	
//	for (Employee employee : employeeSet) {
//		out.println("Id : "+employee.getEmployeeId()+" "+"Name : "+employee.getName()
//	    +" "+"Salary : "+employee.getSalary()+"<br><br>" );
//		
//		out.println("__".repeat(50));
//		out.println("<br><br>");
//	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
}
