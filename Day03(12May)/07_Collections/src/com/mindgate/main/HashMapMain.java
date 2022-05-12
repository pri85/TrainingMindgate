package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(101, "Santosh");
		employeeMap.put(103, "Shubham");
		employeeMap.put(104, "Shashank");
		employeeMap.put(102, "Vaibhav");
		
		System.out.println(employeeMap);
	}
}
