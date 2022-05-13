package com.mindgate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {

	private Set<Employee> employeeSet = new HashSet<Employee>();
	
	// add new employee
	public boolean addNewEmployee(Employee emplyee) {
		if (emplyee!=null) {
			employeeSet.add(emplyee);
			return true;
		}
		
		return false;
	}
	
	// update existing employeee
	public boolean updateEmployee(Employee employee) {
		if (employee != null) {
			for (Employee employeeOld : employeeSet) {
				if (employeeOld.getEmployeeId() == employee.getEmployeeId()) {
					employeeOld.setEmployeeId(employee.getEmployeeId());
					employeeOld.setName(employee.getName());
					employeeOld.setSalary(employee.getSalary());
				}
				return true;
			}
		}
		return false;
	}
	
	// delete employee
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				employeeSet.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	//get single employee by employee id
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	//get all the employees
	public Set<Employee> getAllEmployees(){
		return employeeSet;
	}
	
}
