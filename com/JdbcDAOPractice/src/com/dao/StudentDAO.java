package com.dao;

import java.util.List;

import com.dto.Student;

public interface StudentDAO {
	void addStudent(Student st);
	void deleteStudent(int rollNo);
	void updateStudent(Student st);
	List<Student> displayStudent();
}
