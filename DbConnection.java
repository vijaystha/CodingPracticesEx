package com.trading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
//		DB connection parameters

		String jdbcURL = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "root";

		// Initialize the connection
		Connection connection = null;

		try {
//        	register mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//        	Establish db connection
			connection = DriverManager.getConnection(jdbcURL, username, password);

			if (connection != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to connect to the db.");

			}
		} catch (ClassNotFoundException e) {
			System.err.println("MySql JDBC Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.print("COnnection to the db failed.");
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("Database connection closed.");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
