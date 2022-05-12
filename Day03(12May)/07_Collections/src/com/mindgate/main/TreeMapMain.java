package com.mindgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		SortedMap<Integer, String> employeeMap = new TreeMap<Integer,String>();
		
		employeeMap.put(101, "Pravin");
		employeeMap.put(111, "Pratap");
		employeeMap.put(109, "Priyanka");
		employeeMap.put(107, "Priya");
		
		System.out.println(employeeMap);
		
	}
}
