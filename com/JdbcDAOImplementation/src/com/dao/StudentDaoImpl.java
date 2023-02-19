package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Student;


public class StudentDaoImpl implements StudentDao{

	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = DbUtils.connectToDataBase();
			System.out.println("Connection Successfull");
			
			String insertQuery = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, st.getRollNo());
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setDouble(4, st.getxPer());
			ps.setString(5, st.getState());
			
			System.out.println(ps.executeUpdate()>0 ? "Student added" : "Something went wrong");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DbUtils.closeConnection(conn);
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		}
		
		
	}

	@Override
	public void updateStudent(Student st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		
	}




}
