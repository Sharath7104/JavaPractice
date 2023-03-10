package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Student;
import com.dto.StudentImpl;

public class StudentDAOImpl implements StudentDAO {
	
	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DbUtils.connectToDatabase();
//			System.out.println("Connection Successful");
			
			String insertquery = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertquery);
			ps.setInt(1, st.getRollNo());
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setDouble(4, st.getxPer());
			ps.setString(5, st.getState());
			
			System.out.println(ps.executeUpdate()>0 ? "Student added successfully" : "Something went wrong");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DbUtils.closeConnection(conn);
//				System.out.println("Connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = DbUtils.connectToDatabase();
			
			String deletequery = "Delete from student where rollno = ?";
			PreparedStatement ps = conn.prepareStatement(deletequery);
			ps.setInt(1, rollNo);
			
			System.out.println(ps.executeUpdate()>0 ? "Deleted Successfully" : "Something went wrong");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DbUtils.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void updateStudent(Student st) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = DbUtils.connectToDatabase();
			
			String updatequery = "UPDATE STUDENT SET NAME = ?, EMAIL = ?, X_PER = ?, STATE = ? WHERE ROLLNO = ?";
			PreparedStatement ps = conn.prepareStatement(updatequery);
			ps.setInt(5, st.getRollNo());
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setDouble(3, st.getxPer());
			ps.setString(4, st.getState());
			
			System.out.println(ps.executeUpdate()>0 ? "Updated Successfully" : "Something went wrong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DbUtils.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private boolean isEmpty(ResultSet rs) throws SQLException {
		return (!rs.isBeforeFirst() && rs.getRow() == 0)?true:false;
	}
	
	private List<Student> getStudentList(ResultSet rs) throws SQLException{
		List<Student> list = new ArrayList<>();
		
		while(rs.next()) {
			//Object of student
			Student st = new StudentImpl();
			st.setRollNo(rs.getInt("rollNo"));
			st.setName(rs.getString("name"));
			st.setEmail(rs.getString("email"));
			st.setxPer(rs.getDouble("x_per"));
			st.setState(rs.getString("state"));
			
			list.add(st);
		}
		
		return list;
	}
	@Override
	public List<Student> displayStudent() {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Student> list = null;
		try {
			conn = DbUtils.connectToDatabase();
			String selectquery = "Select * from student";
			PreparedStatement ps = conn.prepareStatement(selectquery);
			
			ResultSet rs = ps.executeQuery();
			if(isEmpty(rs)) {
				System.out.println("No Record Found");
			}else {
				list = getStudentList(rs);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				DbUtils.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
