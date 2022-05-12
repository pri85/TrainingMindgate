package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("Vivek");
		nameSet.add("Rohit");
		nameSet.add("Priyanka");
		nameSet.add("Aruna");
		nameSet.add("Priyanka");
		
		System.out.println(nameSet);
		
		System.out.println("-".repeat(50));
		
		Employee employee1 = new Employee(101,"Vivek", 1000);
		System.out.println(employee1.hashCode());
		Employee employee2 = new Employee(102,"Chaitanya", 2000);
		System.out.println(employee2.hashCode());
		Employee employee3 = new Employee(103,"Kiran", 2000);
		System.out.println(employee3.hashCode());
		Employee employee4 = new Employee(101,"Vivek", 1000);
		System.out.println(employee4.hashCode());
		
		System.out.println("-".repeat(50));
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
		Set<Integer> integer = new HashSet<Integer>();
		integer.add(10);
		integer.add(10);
		integer.add(20);
		System.out.println(integer);
		
		Integer i = Integer.valueOf(10);
		System.out.println(i.hashCode());
		Integer i2 = Integer.valueOf(10);
		System.out.println(i2.hashCode());
		

		String s = new String("hi");
		System.out.println(s.hashCode());
		s= s+"hello";
		System.out.println(s.hashCode());
		
		
	}
}
