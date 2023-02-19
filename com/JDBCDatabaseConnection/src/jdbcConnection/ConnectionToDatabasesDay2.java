package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionToDatabasesDay2 {
	
	static String getStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root";
		String password = "root";
		StringBuilder sb = new StringBuilder();
		String statement = "select * from student";
		try(Connection conn = DriverManager.getConnection(url, username, password)){
//			System.out.println("Connection Successfull");
			PreparedStatement ps = conn.prepareStatement(statement);
			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				do {
					String record = rs.getString(1) + "," +	rs.getString(2) + ","+rs.getString(3)+ ","	+rs.getString(4)+ ","+rs.getString(5)+"\n";
					sb.append(record);
					
					
				}while(rs.next());
			}else {
				return "NO Data Found";
			}
			
			
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return sb.toString();
	}
	
	static boolean deleteStudent(Scanner sc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter rollNo");
		int rollno = sc.nextInt();
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root";
		String password = "root";
		
		String deleteStatement = "DELETE FROM STUDENT WHERE ROLLNO = ?";
		try(Connection conn = DriverManager.getConnection(url, username, password)){
//			System.out.println("Connection Successfull");
			PreparedStatement ps = conn.prepareStatement(deleteStatement);
			ps.setInt(1, rollno);
			
			if(ps.executeUpdate()>0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return false;
		
	}
	
	static boolean addStudent(Scanner sc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found check for jar file");
			return false;
		}
		
		System.out.println("Rollno");
		String rollno = sc.next();
		System.out.println("Name");
		String name = sc.next();
		System.out.println("Email");
		String email = sc.next();
		System.out.println("X_per");
		Double x_per = sc.nextDouble();
		System.out.println("State");
		String state = sc.next();
		
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root";
		String password = "root";
		
		String addStatement = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
		
		
		try(Connection conn = DriverManager.getConnection(url,username,password)){
//			System.out.println("Connection Successfull");
			PreparedStatement ps = conn.prepareStatement(addStatement);
			ps.setString(1, rollno);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setDouble(4, x_per);
			ps.setString(5, state);
			
			
			if(ps.executeUpdate()>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	static boolean updateStudent(Scanner sc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found check for jar file");
			return false;
		}
		
		System.out.println("Rollno");
		String rollno = sc.next();
		System.out.println("Name");
		String name = sc.next();
		System.out.println("Email");
		String email = sc.next();
		System.out.println("X_per");
		Double x_per = sc.nextDouble();
		System.out.println("State");
		String state = sc.next();
		
		
		String url = "jdbc:mysql://localhost/demo";
		String username = "root";
		String password = "root";
		
		String updateStatement = "UPDATE STUDENT SET NAME = ?, EMAIL = ?, X_PER = ?,STATE = ? WHERE ROLLNO = ?";
		
		
		try(Connection conn = DriverManager.getConnection(url,username,password)){
//			System.out.println("Connection Successfull");
			PreparedStatement ps = conn.prepareStatement(updateStatement);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setDouble(3, x_per);
			ps.setString(4, state);
			ps.setString(5, rollno);
			
			if(ps.executeUpdate()>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter Selection \n 1.Add Student\n 2.Update Student\n 3.Delete Student\n 4.Get Student Details");
		choice = sc.nextInt();
		if(choice == 2) {
			if(updateStudent(sc)) {
				System.out.println("Student Updated Successfully");
			}else {
				System.out.println("Something went wrong");
			}
		}else if(choice ==1) {
			if(addStudent(sc)) {
				System.out.println("Student added Successfully");
			}else {
				System.out.println("Something went wrong");
			}
		}else if(choice == 3) {
			if(deleteStudent(sc)) {
				System.out.println("Student deleted successfully");
			}else {
				System.out.println("Something went wrong");
			}
		}else if(choice == 4){
			
			System.out.println(getStudent());
			
		}else {
		
			System.out.println("Invalid Selection");
		}
		 sc.close();
	}
}
