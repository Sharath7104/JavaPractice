package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToDatabaseDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//call the connection
			
			String url = "jdbc:mysql://localhost/demo";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(url,username, password);
			
			System.out.println("Connection successful");
		
			String insertStatement = "INSERT INTO STUDENT (ROLLNO, NAME,EMAIL,X_PER,STATE) VALUES(1, 'SHARATH','SHARATH@GMAIL.COM',99.5, 'KARNATAKA')";
			
			Statement state = conn.createStatement();
			
			if(state.executeUpdate(insertStatement)>0) {
				System.out.println("Student Added Successful");
			}else {
				System.out.println("Something Went Wrong");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
