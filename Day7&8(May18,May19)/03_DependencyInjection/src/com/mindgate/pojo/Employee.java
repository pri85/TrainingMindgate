package com.mindgate.pojo;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private Address homeAddress;
	
	public Employee() {
		System.out.println("default constructor of Employee called");
	}

	public Employee(int employeeId, String name, double salary, Address homeAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		System.out.println("Overloaded constructor of Employee Called");
	}

	public int getEmployeeId() {
		
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("Setting EmployeeId :: "+employeeId);
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name :: "+name);
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Setting salary :: "+salary);
		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		System.out.println("Setting homeAddress :: "+homeAddress);
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}
	
	
	
}
