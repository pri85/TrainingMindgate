package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCURDMain {
	
	    
	    Employee employee;
	public static void main(String[] args) {
		Employee employee = new Employee(1, "XYZ", 100);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);

//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Employee added Successfully");
//		} else {
//			System.out.println("Failed to add employee");
//		}
		
//		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
//		for (Employee emp : allEmployees) {
//			System.out.println(emp);
//		}
//		System.out.println("-".repeat(50));
//		Employee sachin = employeeServiceInterface.getEmployeeByEmployeeId(2);
//		System.out.println(sachin);
//		
		Employee employee2 = new Employee(21, "Spring JDBC", 100);
		System.out.println("-".repeat(50));
		boolean resultUpdate = employeeServiceInterface.updateEmployee(employee2);
		if (resultUpdate) {
			System.out.println("Employee updated Successfully");
			} else {
				System.out.println("Failed to update employee");
		}
		
//		System.out.println("-".repeat(50));
//		boolean resultDelete = employeeServiceInterface.deleteEmployeeByEmployeeId(43);
//		if (resultDelete) {
//			System.out.println("Employee Deleted Successfully");
//			} else {
//				System.out.println("Failed to Delete employee");
//		}
	}
}
