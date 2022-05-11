package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char choice;

		System.out.println("Paint Application");
		System.out.println("a. Circle");
		System.out.println("b. Triangle");
		System.out.println("c. Square");
		System.out.println("Enter Your Choice");
		choice = scanner.next().charAt(0);

		Shapes shapes = ShapesFactory.getShapes(choice);
		//shapes.draw();
		
		if (shapes != null) {
			shapes.draw();
			
		}else {
			System.out.println("Invalid Shape Choice");
		}
		
	}
}
