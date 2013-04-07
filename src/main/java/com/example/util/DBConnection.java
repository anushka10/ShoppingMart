package com.example.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class DBConnection {

	String dbUrl = "jdbc:mysql://localhost:3306/shoppingmart";
	String dbClass = "com.mysql.jdbc.Driver";
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection con = (Connection) DriverManager.getConnection (dbUrl,"root","123");
		return con;
	}

	
	public static void main(String[] args) {
		DBConnection dbConnection = new DBConnection();
		try {
			System.out.println("con " + dbConnection.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}
