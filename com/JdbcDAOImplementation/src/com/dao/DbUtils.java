package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbUtils {
	static final String url;
	static final String username;
	static final String password;
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("dbdetails");
		url = bundle.getString("url");
		username = bundle.getString("username");
		password = bundle.getString("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static Connection connectToDataBase() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	
	static void closeConnection(Connection conn) throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
}
