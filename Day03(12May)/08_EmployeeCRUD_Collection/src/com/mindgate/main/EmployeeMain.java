package com.mindgate.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
	
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee employee = new Employee();
		String continueChoice;
		boolean result = false;
		
		do {
		System.out.println("1. Add new Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Get Single Employee");
		System.out.println("5. Get All Employees");
		System.out.println("Enter your choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Id :");
			int id = scanner.nextInt();
			System.out.println("Enter Name :");
			String name = scanner.next();
			System.out.println("Enter Salary :");
			double salary = scanner.nextDouble();
			employee.setEmployeeId(id);
			employee.setName(name);
			employee.setSalary(salary);
			System.out.println(employeeDAO.addNewEmployee(employee));
			if (employeeDAO.addNewEmployee(employee)) {
				System.out.println("Employee Added SuccessFully!");
			}else {
				System.out.println("Employee Not Added");
			}
			
			break;
			
		case 2:
			System.out.println("Enter Id :");
			int idUpdate = scanner.nextInt();
			System.out.println("Enter Name :");
			String nameUpdate = scanner.next();
			System.out.println("Enter Salary :");
			double salaryUpdate = scanner.nextDouble();
			employee.setEmployeeId(idUpdate);
			employee.setName(nameUpdate);
			employee.setSalary(salaryUpdate);
			
			if (employeeDAO.addNewEmployee(employee)) {
				System.out.println("Employee Updated SuccessFully!");
			}else {
				System.out.println("Employee Not Updated");
			}
			break;
			
		case 3:
			System.out.println("Enter Employee Id you Want to Delete :");
			int deleteId = scanner.nextInt();
			employeeDAO.deleteEmployeeByEmployeeId(deleteId);
			break;
		
		case 4:
			System.out.println("Enter Employee id you want to see :");
			int empId = scanner.nextInt();
			Employee employeeSingle= employeeDAO.getEmployeeByEmployeeId(empId);
			System.out.println("Id :"+employeeSingle);
			System.out.println("Name :"+employeeSingle.getName());
			System.out.println("Salary :"+employeeSingle.getSalary());
			break;
		case 5:
			Set<Employee> employeeSet = employeeDAO.getAllEmployees();
			for (Employee employee2 : employeeSet) {
				System.out.println(employee2);
			}
			break;
		default: System.out.println("Invalid Choice");
			break;
		
			
		}
		
		System.out.println("Do you want to continue?(yes/no)");
		continueChoice= scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you!");
	}
}
