package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount = 0;
		String sqlQuery = "";

		Connection connection;
		// Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;

//		System.out.println("Insert Example");
//		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery ="INSERT INTO employee_details(name,salary) VALUES(?,?)";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Priyanka");
//			preparedStatement.setDouble(2, 1000);
//			resultCount= preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount>0) {
//				System.out.println("Record Inserted Successfully");
//			}else {
//				System.out.println("Failed to insert record");
//			}
//			
//		} catch (ClassNotFoundException | SQLException e) {
//
//			System.out.println("Failed to Connect");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("Update Record Example");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "UPDATE employee_details SET name=?,salary=? where employee_id=?";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Priya");
//			preparedStatement.setDouble(2, 10000);
//			preparedStatement.setInt(3, 3);
//
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//
//			if (resultCount > 0) {
//				System.out.println("Updated");
//			} else {
//				System.out.println("Failed Update");
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//
//			System.out.println(e.getMessage());
//			System.out.println("Connection Failed");
//		}

		System.out.println("Delete Example");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			sqlQuery = "DELETE from employee_details where employee_id=?";
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 3);
			resultCount = preparedStatement.executeUpdate();
			
			if (resultCount>0) {
				System.out.println("Deleted");
			}else {
				System.out.println("Enmployee not Deleted");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Connection Failed");
		}
		

//		System.out.println("Display all Employee");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "SELECT * from employee_details";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			resultSet = statement.executeQuery(sqlQuery);
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt("employee_id"));
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getDouble("salary"));
//				System.out.println("_".repeat(50));
//			}
//			connection.close();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		

	}
}
