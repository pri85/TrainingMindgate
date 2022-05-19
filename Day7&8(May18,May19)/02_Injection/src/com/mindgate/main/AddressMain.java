package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;

public class AddressMain {

	public static void main(String[] args) {
		//Address address = new Address();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Address address = applicationContext.getBean("address", Address.class);
		
		//Address address = (Address) applicationContext.getBean("address");
		
		System.out.println(address);
	}
}
