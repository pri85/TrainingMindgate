package com.mindgate.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee employee=null;
		String continueChoice;
		boolean result = false;
		int id;
		String name;
		double salary;
		int choice;
		Set<Employee> employeeSet;

		do {
			System.out.println("1. Add new Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Get Single Employee");
			System.out.println("5. Get All Employees");
			System.out.println("Enter your choice");

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id :");
				id = scanner.nextInt();
				System.out.println("Enter Name :");
				name = scanner.next();
				System.out.println("Enter Salary :");
				salary = scanner.nextDouble();
				employee = new Employee();
				employee.setEmployeeId(id);
				employee.setName(name);
				employee.setSalary(salary);
				// System.out.println(employeeDAO.addNewEmployee(employee));
				if (employeeDAO.addNewEmployee(employee)) {
					System.out.println("Employee Added SuccessFully!");
				} else {
					System.out.println("Employee Not Added");
				}

				break;

			case 2:
				System.out.println("Enter Id :");
				id = scanner.nextInt();
				System.out.println("Enter Name :");
				name = scanner.next();
				System.out.println("Enter Salary :");
				salary = scanner.nextDouble();
				employee.setEmployeeId(id);
				employee.setName(name);
				employee.setSalary(salary);

				if (employeeDAO.updateEmployee(employee)) {
					System.out.println("Employee Updated SuccessFully!");
				} else {
					System.out.println("Employee Not Updated");
				}
				break;

			case 3:
				System.out.println("Enter Employee Id you Want to Delete :");
				id = scanner.nextInt();

				if (employeeDAO.deleteEmployeeByEmployeeId(id)) {
					System.out.println("employee deleted successfully");
				} else {
					System.out.println("employee not deleted");
				}

				break;

			case 4:
				System.out.println("Enter Employee id you want to see :");
				id = scanner.nextInt();
				employee = employeeDAO.getEmployeeByEmployeeId(id);
				if ((employee != null)) {
				System.out.println("Id :" + employee.getEmployeeId());
				System.out.println("Name :" + employee.getName());
				System.out.println("Salary :" + employee.getSalary());
				}else {
					System.out.println("No Record Found!");
				}
				break;
			case 5:
				employeeSet = employeeDAO.getAllEmployees();
				if ((employeeSet != null)) {
					for (Employee employee2 : employeeSet) {
						System.out.println("Id :" + employee2.getEmployeeId());
						System.out.println("Name :" + employee2.getName());
						System.out.println("Salary :" + employee2.getSalary());
						System.out.println();
					}
				} else {
					System.out.println("No Entry Found!");
				}

//				System.out.println(employeeDAO.getAllEmployees());
				break;
			default:
				System.out.println("Invalid Choice");
				break;

			}

			System.out.println("Do you want to continue?(yes/no)");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

		System.out.println("Thank you!");
	}
}
