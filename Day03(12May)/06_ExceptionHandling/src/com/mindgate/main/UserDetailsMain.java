package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		UserDetails details = new UserDetails();
		details.acceptUserDetails();
		details.displayUserDetails();
		System.out.println("Main Ends");

		try {
			Class.forName("com.mindgate.pojo.UserDetails");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
