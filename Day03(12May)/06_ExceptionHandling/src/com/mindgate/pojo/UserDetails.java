package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {

	private int userId;
	private String name;
	private int age;

	public UserDetails() {

	}

	public void acceptUserDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter UserId :");
			userId = scanner.nextInt();

			System.out.println("Enter name :");
			name = scanner.next();

			System.out.println("Enter age :");
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input from User");
			System.out.println("Please Enter Valid values");
		} catch (Exception e) {

		}

	}

	public void displayUserDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}
}
