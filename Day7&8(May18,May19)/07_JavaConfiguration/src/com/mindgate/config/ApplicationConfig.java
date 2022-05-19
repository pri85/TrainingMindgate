package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

@ComponentScan("com.mindgate.pojo")
@Configuration
public class ApplicationConfig {
	
//	@Bean
//	public Address address() {
//		System.out.println("In address() of ApplicationConfig");
//		Address address = new Address();
//		return address;
//	}
//	
//	@Bean
//	public Employee employee() {
//		System.out.println("In employee() of ApplicationConfig");
//		Address address = new Address();
//		Employee employee = new Employee();
//		employee.setHomeAddress(address);
//		return employee;
//	}
}
