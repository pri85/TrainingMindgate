package com.mindgate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.rowmapper.EmployeeRowMapper;

@Repository("employeeDao")
@Scope("prototype")
public class EmployeeDAO implements EmployeeDAOInterface {

	private JdbcTemplate jdbcTemplate;
	private int resultCount;

	private static final String INSERT_EMPLOYEE = "INSERT INTO employee_details(name,salary) values(?,?)";
	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details";
	private static final String SELECT_SINGLE_EMPLOYEES = "SELECT * FROM employee_details WHERE employee_id=?";
	private static final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name = ? , salary= ? where employee_id=?";
	private static final String DELETE_EMPLOYEE = "DELETE employee_details where employee_id=?";
	
	public EmployeeDAO() {

	}

	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside EmployeeDAO Inserting new employee into database");
		System.out.println(employee);

		Object[] args = { employee.getName(), employee.getSalary() };
		resultCount = jdbcTemplate.update(INSERT_EMPLOYEE, args);

		if (resultCount > 0)
			return true;

		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = jdbcTemplate.query(SELECT_ALL_EMPLOYEES, new EmployeeRowMapper());

		return employees;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		Object[] args = { employeeId };
		Employee employee = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEES, args, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Object[] args = { employee.getName(), employee.getSalary() , employee.getEmployeeId()};
		resultCount = jdbcTemplate.update(UPDATE_EMPLOYEE, args);

		if (resultCount > 0)
			return true;

		else
			return false;
		
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Object[] args = { employeeId};
		resultCount = jdbcTemplate.update(DELETE_EMPLOYEE, args);

		if (resultCount > 0)
			return true;

		else
			return false;
		
	}

}
