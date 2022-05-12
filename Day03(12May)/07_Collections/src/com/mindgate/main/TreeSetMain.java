package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {

		SortedSet<String> nameSortedSet = new TreeSet<String>();
		
		nameSortedSet.add("Rohit");
		nameSortedSet.add("Priyanka");
		nameSortedSet.add("Aruna");
		nameSortedSet.add("Ravina");
		nameSortedSet.add("Komal");
		nameSortedSet.add("Mahimat");
		
		System.out.println(nameSortedSet);
	}
}
